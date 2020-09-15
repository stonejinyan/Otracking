package com.otracking.action.mo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.bean.MO;
import com.otracking.bean.Product_Type;
import com.otracking.bean.SEEEOrder;
import com.otracking.dao.BatchDao;
import com.otracking.dao.MODao;
import com.otracking.dao.OrderDao;
import com.otracking.dao.Product_TypeDao;
import com.otracking.tool.LogUtil;

public class SaveMOAction extends ActionSupport {
	MODao moDao = new MODao();
	OrderDao orderDao = new OrderDao();
	BatchDao batchDao = new BatchDao();
	Product_TypeDao product_TypeDao = new Product_TypeDao();
	private File excel;// 必须与表单中的name属性一致
	private String excelFileName;// 必须是name属性+FileName
	private String error = "";
	List<MO> mos = new ArrayList<MO>();
	int savenumber = 0;
	int updatenumber = 0;

	public String execute() throws Exception {
		// 将客户端的文件上传到服务端

		String desPath = ServletActionContext.getServletContext().getRealPath("../MOFile");
		System.out.println(excelFileName);
		File destFile = new File(desPath, excelFileName);
		FileUtils.copyFile(excel, destFile);

		// 解析excel
		// 得到一个excel文件
		XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(destFile));
		// 得到第一张表
		XSSFSheet sheet = book.getSheetAt(0);
		// 遍历输出
		LogUtil.RollingFile.info("行数：" + sheet.getLastRowNum());
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			// 得到行
			XSSFRow row = sheet.getRow(i);
			MO mo = new MO();
			int orderID = 0;
			int NO = 0;
			String customID = null;
			String SO = null;
			String WBS = null;
			int product_type_id;
			if (row == null || row.getCell(0) == null) {
				break;
			} else {
				row.getCell(0).setCellType(CellType.STRING);
			}

			if (row.getCell(0).getStringCellValue() == null || row.getCell(0).getStringCellValue().equals("")) {
				break;
			}
			row.getCell(0).setCellType(CellType.STRING);
			String processlineName = row.getCell(0).getStringCellValue();
			if (row.getCell(1) != null) {
				row.getCell(1).setCellType(CellType.STRING);
				NO = Integer.parseInt(row.getCell(1).getStringCellValue());
			}
			if (row.getCell(2) != null) {
				row.getCell(2).setCellType(CellType.STRING);
				SO = row.getCell(2).getStringCellValue().trim();
			}
			if (row.getCell(3) != null) {
				row.getCell(3).setCellType(CellType.STRING);
				WBS = row.getCell(3).getStringCellValue().trim();
			}
			row.getCell(4).setCellType(CellType.STRING);
			String Panle = row.getCell(4).getStringCellValue();
			row.getCell(5).setCellType(CellType.STRING);
			String moName = row.getCell(5).getStringCellValue();
			row.getCell(6).setCellType(CellType.STRING);
			String description = row.getCell(6).getStringCellValue();
			row.getCell(7).setCellType(CellType.STRING);
			double quantity = Double.parseDouble(row.getCell(7).getStringCellValue());
			if (row.getCell(8) != null) {
				row.getCell(8).setCellType(CellType.STRING);
				customID = row.getCell(8).getStringCellValue();
			}
			row.getCell(9).setCellType(CellType.STRING);
			String type = row.getCell(9).getStringCellValue();
			row.getCell(10).setCellType(CellType.NUMERIC);
			Date schedule_endtime = row.getCell(10).getDateCellValue();
			row.getCell(12).setCellType(CellType.NUMERIC);
			Date schedule_starttime = row.getCell(12).getDateCellValue();
			String batchName = row.getCell(14).getStringCellValue();
			String orderName = row.getCell(15).getStringCellValue();

			if (processlineName.equals("PTLVS")) {
				if (batchName.equals("自用")) {
					orderID = 134;
				} else if (batchName.equals("外发")) {
					orderID = 133;
				}
			} else {
				if (SO != null && !SO.equals("")) {
					SEEEOrder seeeOrder = orderDao.queryBySO(SO);
					if (seeeOrder == null) {
						error = error + SO + "/" + orderName + ":SO/orderName " + "未维护，请先在系统中创建订单并维护SO！<br>";
					} else {
						orderID = seeeOrder.getId();
					}
				} else {
					error = error + moName + ":SO " + SO + "is null;<br>";
					break;
				}
			}
			if (WBS != null && !WBS.equals("")) {
				Batch batch = getBatchIdByName(batchName, orderID, WBS);
				if (batch != null) {
					mo.setBatch_id(batch.getId());
				} else {
					error = error + "Order: " + orderName + " Batch: " + batchName + " MO: " + moName + "Batch创建失败"
					        + "<br>";
				}
			} else {
				error = error + moName + ":WBS " + WBS + "is null;<br>";
				break;
			}
			if (schedule_starttime != null) {
				mo.setSchedule_starttime(schedule_starttime);
			} else {
				error = error + moName + ":schedule_starttime " + schedule_starttime + "is null;<br>";
				break;
			}
			if (schedule_endtime != null) {
				mo.setSchedule_endtime(schedule_endtime);
			} else {
				error = error + moName + ":schedule_endtime " + schedule_endtime + "is null;<br>";
				break;
			}

			mo.setQuantity(quantity);
			mo.setNo(NO);
			mo.setDescription(description);
			mo.setCustomID(customID);
			if (processlineName != null && !processlineName.equals("") && Panle != null && !Panle.equals("")
			        && type != null && !type.equals("")) {
				String product_classify = "";
				if (Panle.indexOf("AOP") != -1) {
					product_classify = "OKKEN";
				} else if (Panle.indexOf("ABP") != -1) {
					product_classify = "Blokset";
				} else if (Panle.indexOf("JAW") != -1) {
					product_classify = "JAW";
				} else if (Panle.indexOf("Frame") != -1) {
					product_classify = "Frame";
				} else if (Panle.indexOf("Polyfast") != -1) {
					product_classify = "Polyfast";
				} else if (Panle.indexOf("BJX") != -1) {
					product_classify = "附件箱";
					mo.setQuantity(0);
				} else {
					error = error + moName + ":Panle " + "is no definition;<br>";
					break;
				}
				String myProcesslineName = "";
				if (processlineName.equals("70")) {
					myProcesslineName = "70产线";
				} else if (processlineName.equals("115")) {
					myProcesslineName = "115产线";
				} else if (processlineName.equals("B柜")) {
					myProcesslineName = "Blokset产线";
				} else if (processlineName.equals("核电")) {
					myProcesslineName = "核电产线";
				} else if (processlineName.equals("非标")) {
					myProcesslineName = "非标产线";
				} else if (processlineName.equals("PLC")) {
					myProcesslineName = "PLC产线";
				} else if (processlineName.equals("PTLVS")) {
					myProcesslineName = "PTLVS";
				} else if (processlineName.equals("附件箱")) {
					myProcesslineName = "附件箱";
				} else if (processlineName.equals("弹性线")) {
					myProcesslineName = "弹性线";
				} else {
					error = error + moName + ":processlineName " + "is no definition;<br>";
					break;
				}
				Product_Type product_type = product_TypeDao.query(myProcesslineName, product_classify, type);
				if (product_type != null) {
					product_type_id = product_type.getId();
					mo.setProduct_type_id(product_type_id);
				} else {
					error = error + moName + ":product_type " + product_type + "is not exist;<br>";
					break;
				}
			} else {
				error = error + moName + ":processlineName or Panle or type " + "is null or not exist;<br>";
				break;
			}
			if (moName != null && !moName.equals("")) {
				mo.setName(moName);
			} else {
				error = error + moName + ":moName " + moName + "is null;<br>";
				break;
			}
			if (Panle != null && !Panle.equals("")) {
				mo.setDms_id(Panle);
			} else {
				error = moName + ":Dms_id " + Panle + "is null;<br>";
				break;
			}
			mo.setScheduling(0);
			mo.setEkitting(0);
			mos.add(mo);
			/*
			 * for (int j = 0; j < row.getLastCellNum(); j++) { // 得到一行中的单元格 XSSFCell cell =
			 * row.getCell(j); System.out.print(cell + "\t"); } System.out.println();
			 */
		}
		if (error.equals("")) {
			for (int i = 0; i < mos.size(); i++) {
				int isSaveOrUpdate = moDao.saveOrUpdate(mos.get(i));
				if (isSaveOrUpdate == 1) {
					savenumber++;
				} else if (isSaveOrUpdate == 2) {
					updatenumber++;
				} else {
					if (error.equals("无;")) {
						error = "";
					}
					error += "A mistake. MO（" + mos.get(i).getName() + "）已开始生产，无法覆盖，请手工修改！<br>";
				}
			}
		}
		LogUtil.RollingFile.error("error:" + error);
		LogUtil.RollingFile.error("savenumber:" + savenumber);
		LogUtil.RollingFile.error("updatenumber:" + updatenumber);
		/*
		 * if (mo.getSchedule_starttime() == null) {
		 * mo.setSchedule_starttime(DateUtil.getNowDateShort()); } if
		 * (mo.getSchedule_starttime() != null && mo.getName() != null && mo.getName()
		 * != "" && !mo.getName().equals("")) { moDao.save(mo);
		 * LogManager.getLogger().info(ActionContext.getContext().getSession().get(
		 * "staff") + " 新增一个batch ：" + mo); }
		 */
		ActionContext.getContext().put("error", "异常:" + error);
		ActionContext.getContext().put("savenumber", "上传成功行数:" + savenumber + "行;<br>");
		ActionContext.getContext().put("updatenumber", "覆盖成功行数:" + updatenumber + "行;<br>");
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	};

	private Batch getBatchIdByName(String batchName, int orderID, String WBS) {
		// TODO Auto-generated method stub
		Batch batch = batchDao.queryByname(WBS);
		if (batch == null) {
			batch = new Batch();
			batch.setName(WBS);
			batch.setWBS(WBS);
			batch.setBatch(batchName);
			batch.setOrder_id(orderID);
			if (orderID == 133 || orderID == 134) {
				batch.setActual_endtime(new Date());
			}
			System.out.println(orderID);
			System.out.println(batchName);
			batchDao.save(batch);
			batch = batchDao.queryByname(batchName, orderID);
		}
		return batch;
	}

	private int getOrderIdByName(String name) {
		// TODO Auto-generated method stub
		SEEEOrder seeeOrder = orderDao.queryByName(name);
		if (seeeOrder == null) {
			seeeOrder = new SEEEOrder();
			seeeOrder.setName(name);
			seeeOrder.setSchedule_starttime(new Date());
			orderDao.save(seeeOrder);
			seeeOrder = orderDao.queryByName(name);
		}
		return seeeOrder.getId();
	}

	public File getExcel() {
		return excel;
	}

	public void setExcel(File excel) {
		this.excel = excel;
	}

	public String getExcelFileName() {
		return excelFileName;
	}

	public void setExcelFileName(String excelFileName) {
		this.excelFileName = excelFileName;
	}

}
