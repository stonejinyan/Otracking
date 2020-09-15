package com.otracking.service.productionexecute;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.otracking.bean.MO;
import com.otracking.bean.OffDay;
import com.otracking.bean.Production_Schedule;
import com.otracking.bean.RestTime;
import com.otracking.bean.Routing;
import com.otracking.dao.MODao;
import com.otracking.dao.OffDayDao;
import com.otracking.dao.Production_ScheduleDao;
import com.otracking.dao.RestTimeDao;
import com.otracking.dao.RoutingDao;
import com.otracking.tool.DateUtil;
import com.otracking.tool.LogUtil;

public class ProductionExecute {

	public static final int TT = 20;
	RoutingDao routingDao = new RoutingDao();
	Production_ScheduleDao production_ScheduleDao = new Production_ScheduleDao();
	MODao moDao = new MODao();

	public void setMOStartPlan(MO MO, int startsequenceequence) {
		List<Routing> routings = routingDao.getByProductType_Id(MO.getProduct_type_id());
		Date MOStartTime = DateUtil.getNowDateShort();
		for (int i = 0; i < routings.size(); i++) {
			Routing routing = routings.get(i);
			int sequence = routing.getSequence();
			if (sequence >= startsequenceequence) {
				boolean condition = false;
				do {
					condition = false;
					Date myDay = DateUtil.getDateShort(MOStartTime);
					Date routingLastScheduleStartTime = getLastScheduleStartTime(routing.getMethod_process_id(),
					        DateUtil.getDateShort(myDay));
					if (MOStartTime.before(DateUtil.getStartDate(routingLastScheduleStartTime, 0, 0, TT))) {
						MOStartTime = DateUtil.getStartDate(routingLastScheduleStartTime, 0, 0, TT);
					}
					MOStartTime = checkOffdayAndRestTime(MOStartTime, routing.getMethod_process_id());
					if (DateUtil.getTomorrowDate(myDay).before(MOStartTime)) {
						LogUtil.RollingFile.info("跨日：condition = true");
						condition = true;
					}
				} while (condition);
				Production_Schedule production_Schedule = getProduction_Schedule(MO, routing, MOStartTime);
				boolean isSave = production_ScheduleDao.save(production_Schedule);
				if (isSave) {
					MOStartTime = DateUtil.getStartDate(production_Schedule.getSchedule_endtime(), 0, 0, 5);
				}
			} else if (startsequenceequence == 1 && sequence < 1) {
				Production_Schedule Production_Schedule = getProduction_Schedule(MO, routing, MOStartTime);
				production_ScheduleDao.save(Production_Schedule);
			}
		}
	}

	private Production_Schedule getProduction_Schedule(MO MO, Routing routing, Date MOStartTime) {
		Date MOEndTime = DateUtil.getStartDate(MOStartTime, 0, 0, (int) routing.getDt());
		int flag = 5;
		if (routing.getSequence() <= 1) {
			flag = 1;
		}
		Production_Schedule production_Schedule = new Production_Schedule(0, MOStartTime, MOEndTime, null, null,
		        routing.getMethod_process_id(), MO.getId(), flag);
		return production_Schedule;
	}

	private Date getLastScheduleStartTime(int method_process_id, Date date) {
		// TODO Auto-generated method stub
		return production_ScheduleDao.getLastScheduleStartTime(method_process_id, date);
	}

	private Routing getFirstRouting(List<Routing> routings, int sequence) {
		// TODO Auto-generated method stub
		for (int i = 0; i < routings.size(); i++) {
			if (routings.get(i).getSequence() == sequence) {
				return routings.get(i);
			}
		}
		return null;
	}

	// 排产
	public String setMOPlan() {
		List<MO> mos = moDao.getTodaySchedule();
		for (int i = 0; i < mos.size(); i++) {
			MO mo = mos.get(i);
			setMOStartPlan(mo, 1);
			moDao.updateScheduling(mo);// 标记已排产
		}
		LogUtil.RollingFile.info("今日排产MO：" + mos.size() + "个");
		return "当日排产完成";
	}

	public Date checkOffdayAndRestTime(Date date, int methodProcessId) {
		Date myDate = date;
		OffDayDao offDayDao = new OffDayDao();
		RestTimeDao restTimeDao = new RestTimeDao();
		List<OffDay> offDays = offDayDao.getAll();
		List<RestTime> restTimes = restTimeDao.getAll();
		boolean mycontinue = false;

		boolean flag = false;
		do {
			mycontinue = false;
			flag = false;
			Date myDay = DateUtil.getDateShort(myDate);
			Date myTime = DateUtil.getDateHour(myDate);
			LogUtil.RollingFile.debug("日期部分：" + myDay);
			LogUtil.RollingFile.debug("时间部分：" + myTime);
			LogUtil.RollingFile.debug("合成日期3" + new Date(myDay.getTime() + myTime.getTime() + 8 * 3600 * 1000));
			for (int i = 0; i < offDays.size(); i++) {
				System.out.println(offDays.get(i).getStarttime() + "-" + offDays.get(i).getEndtime());
				if (myDay.compareTo(offDays.get(i).getStarttime()) >= 0
				        && myDay.compareTo(offDays.get(i).getEndtime()) <= 0) {
					myDay = offDays.get(i).getEndtime();
					Calendar calendar = new GregorianCalendar();
					calendar.setTime(myDay);
					calendar.add(Calendar.DATE, 1);
					myDay = calendar.getTime();
					LogUtil.RollingFile.debug("休假，开始日期顺延:" + myDay);
					flag = true;
				}
			}
			if (flag) {
				myTime = DateUtil.getDateHour(DateUtil.strToDateLong("1970-01-01 00:00:00"));
			}
			for (int i = 0; i < restTimes.size(); i++) {
				LogUtil.RollingFile.debug("startTime：" + restTimes.get(i).getStarttime());
				LogUtil.RollingFile.debug("endTime：" + restTimes.get(i).getEndtime());
				LogUtil.RollingFile.debug("myTime：" + myTime);
				LogUtil.RollingFile.debug("check1" + (myTime.compareTo(restTimes.get(i).getStarttime()) >= 0));
				LogUtil.RollingFile.debug("check1" + (myTime.compareTo(restTimes.get(i).getEndtime()) <= 0));
				if (myTime.compareTo(restTimes.get(i).getStarttime()) >= 0
				        && myTime.compareTo(restTimes.get(i).getEndtime()) <= 0) {

					myTime = restTimes.get(i).getEndtime();
					Calendar calendar = new GregorianCalendar();
					calendar.setTime(myTime);
					calendar.add(Calendar.MINUTE, 1);
					myTime = calendar.getTime();
				}
				LogUtil.RollingFile.debug("myTime：" + myTime);
			}
			if (myTime.compareTo(new Date(57659000)) == 0) {
				mycontinue = true;
			}
			LogUtil.RollingFile.debug("myTime:" + myTime.getTime());
			LogUtil.RollingFile.debug("mycontimue:" + mycontinue);
			myDate = new Date(myDay.getTime() + myTime.getTime() + 8 * 3600 * 1000);
			LogUtil.RollingFile.debug("合成myDate：" + DateUtil.dateToStrLong(myDate));
		} while (mycontinue);
		return myDate;
	}

}
