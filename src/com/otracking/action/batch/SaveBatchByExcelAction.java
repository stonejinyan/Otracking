package com.otracking.action.batch;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.Batch;
import com.otracking.bean.SEEEOrder;
import com.otracking.dao.BatchDao;
import com.otracking.dao.OrderDao;
import com.otracking.tool.LogUtil;

public class SaveBatchByExcelAction extends ActionSupport {
	OrderDao orderDao = new OrderDao();
	BatchDao batchDao = new BatchDao();
	private File excel;// 必须与表单中的name属性一致
	private String excelFileName;// 必须是name属性+FileName
	private String error = "无;";
	List<Batch> batchs = new ArrayList<Batch>();
	int savenumber = 0;
	int updatenumber = 0;

	public String execute() throws Exception {
		// 将客户端的文件上传到服务端

		String desPath = ServletActionContext.getServletContext().getRealPath("../BatchFile");
		System.out.println(excelFileName);
		File destFile = new File(desPath, excelFileName);
		FileUtils.copyFile(excel, destFile);

		// 解析excel
		// 得到一个excel文件
		ZipSecureFile.setMinInflateRatio(-1.0d);
		XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(destFile));
		// 得到第一张表
		XSSFSheet sheet = book.getSheetAt(0);
		// 遍历输出
		for (int i = 2; i <= sheet.getLastRowNum(); i++) {
			// 得到行
			LogUtil.RollingFile.info(i);
			XSSFRow row = sheet.getRow(i);
			Batch batch = new Batch();
			int orderID;
			if (row == null || row.getCell(2) == null) {
				break;
			} else {
				row.getCell(2).setCellType(CellType.STRING);
				if (row.getCell(2).getStringCellValue() == null || row.getCell(2).getStringCellValue().equals("")) {
					break;
				}
			}
			row.getCell(0).setCellType(CellType.STRING);
			int No = Integer.parseInt(row.getCell(0).getStringCellValue());
			LogUtil.RollingFile.debug("No:" + No);
			row.getCell(1).setCellType(CellType.STRING);
			String SO = row.getCell(1).getStringCellValue().trim();
			row.getCell(2).setCellType(CellType.STRING);
			String batch_name = row.getCell(2).getStringCellValue();
			LogUtil.RollingFile.debug("batch_name:" + batch_name);
			row.getCell(3).setCellType(CellType.STRING);
			String order_name = row.getCell(3).getStringCellValue();
			LogUtil.RollingFile.debug("order_name:" + order_name);
			row.getCell(4).setCellType(CellType.STRING);
			String WBS = row.getCell(4).getStringCellValue().trim();
			LogUtil.RollingFile.debug("WBS:" + WBS);
			row.getCell(5).setCellType(CellType.STRING);
			String Line = row.getCell(5).getStringCellValue();
			LogUtil.RollingFile.debug("Line:" + Line);
			row.getCell(6).setCellType(CellType.STRING);
			String mo_type = row.getCell(6).getStringCellValue();
			LogUtil.RollingFile.debug("mo_type:" + mo_type);
			if (row.getCell(7) != null) {
				row.getCell(7).setCellType(CellType.NUMERIC);
				int quantity = (int) row.getCell(7).getNumericCellValue();
				batch.setQuantity(quantity);
				LogUtil.RollingFile.debug("quantity:" + quantity);
			}
			if (row.getCell(8) != null) {
				row.getCell(8).setCellType(CellType.NUMERIC);
				int drawer_quantity = (int) row.getCell(8).getNumericCellValue();
				batch.setDrawer_quantity(drawer_quantity);
				LogUtil.RollingFile.debug("drawer_quantity:" + drawer_quantity);
			}
			if (row.getCell(9) != null) {
				row.getCell(9).setCellType(CellType.STRING);
				String outsource = row.getCell(9).getStringCellValue();
				LogUtil.RollingFile.debug("outsource:" + outsource);
				if (outsource != null && !outsource.equals("")) {
					batch.setOutsource(outsource);
				} else {
					batch.setOutsource(outsource);
				}
			}
			if (row.getCell(10) != null) {
				row.getCell(10).setCellType(CellType.NUMERIC);
				int accessory_case_quantity = (int) row.getCell(10).getNumericCellValue();
				batch.setAccessory_case_quantity(accessory_case_quantity);
				LogUtil.RollingFile.debug("accessory_case_quantity:" + accessory_case_quantity);
			}
			row.getCell(11).setCellType(CellType.STRING);
			String p_staff = row.getCell(11).getStringCellValue();
			LogUtil.RollingFile.debug("p_staff:" + p_staff);
			row.getCell(12).setCellType(CellType.STRING);
			String E_staff = row.getCell(12).getStringCellValue();
			LogUtil.RollingFile.debug("E_staff:" + E_staff);
			row.getCell(13).setCellType(CellType.STRING);
			String M_staff = row.getCell(13).getStringCellValue();
			LogUtil.RollingFile.debug("M_staff:" + M_staff);
			row.getCell(14).setCellType(CellType.NUMERIC);
			Date material_arrive_time = row.getCell(14).getDateCellValue();
			LogUtil.RollingFile.debug("material_arrive_time:" + material_arrive_time);
			if (row.getCell(15) != null) {
				row.getCell(15).setCellType(CellType.NUMERIC);
				int level = (int) row.getCell(15).getNumericCellValue();
				batch.setLevel_id(level);
				LogUtil.RollingFile.debug("Batch Level:" + level);
			}
			if (SO != null && !SO.equals("")) {
				SEEEOrder seeeOrder = orderDao.queryBySO(SO);
				if (seeeOrder == null) {
					error = SO + "/" + order_name + ":SO/orderName " + "未维护，请先在系统中创建订单并维护SO！";
				} else {
					batch.setOrder_id(seeeOrder.getId());
				}
			} else {
				error = SO + "/" + order_name + ":SO/orderName " + "is null;\n";
				break;
			}
			batch.setNo(No);
			if (batch_name != null && !batch_name.equals("")) {
				batch.setBatch(batch_name);
			} else {
				error = batch_name + ":batchName " + batch_name + "is null;\n";
				break;
			}
			if (WBS != null && !WBS.equals("")) {
				batch.setWBS(WBS);
				batch.setName(WBS);
			} else {
				error = WBS + ":WBS " + WBS + "is null;\n";
				break;
			}
			if (Line != null && !Line.equals("")) {
				batch.setLine(Line);
			} else {
				error = Line + ":Line " + Line + "is null;\n";
				break;
			}
			if (mo_type != null && !mo_type.equals("")) {
				batch.setMo_type(mo_type);
			} else {
				error = mo_type + ":mo_type " + mo_type + "is null;\n";
				break;
			}

			if (p_staff != null && !p_staff.equals("")) {
				batch.setP_staff(p_staff);
			} else {
				error = p_staff + ":p_staff " + p_staff + "is null;\n";
				break;
			}
			// if (E_staff != null && !E_staff.equals("")) {
			batch.setE_staff(E_staff);
			// } else {
			// error = E_staff + ":E_staff " + E_staff + "is null;\n";
			// break;
			// }
			// if (M_staff != null && !M_staff.equals("")) {
			batch.setM_staff(M_staff);
			// } else {
			// error = M_staff + ":M_staff " + M_staff + "is null;\n";
			// break;
			// }
			// if (material_arrive_time != null) {
			batch.setMaterial_arrive_time(material_arrive_time);
			// } else {
			// error = material_arrive_time + ":material_arrive_time " +
			// material_arrive_time + "is null;\n";
			// break;
			// }

			batchs.add(batch);
			/*
			 * for (int j = 0; j < row.getLastCellNum(); j++) { // 得到一行中的单元格 XSSFCell cell =
			 * row.getCell(j); System.out.print(cell + "\t"); } System.out.println();
			 */
		}
		if (error.equals("无;")) {
			for (int i = 0; i < batchs.size(); i++) {
				int isSaveOrUpdate = batchDao.saveOrUpdate(batchs.get(i));
				if (isSaveOrUpdate == 1) {
					savenumber++;
				} else if (isSaveOrUpdate == 2) {
					updatenumber++;
				} else {
					if (error.equals("无;")) {
						error = "";
					}
					error += "A mistake. Batch（" + batchs.get(i).getName() + "）已开始生产，无法覆盖，请手工修改！<br>";
				}
			}
		}
		LogUtil.RollingFile.error("error:" + error);
		LogUtil.RollingFile.error("savenumber:" + savenumber);
		LogUtil.RollingFile.error("updatenumber:" + updatenumber);
		ActionContext.getContext().put("error", "异常:" + error);
		ActionContext.getContext().put("savenumber", "上传成功行数:" + savenumber + "行;<br>");
		ActionContext.getContext().put("updatenumber", "覆盖成功行数:" + updatenumber + "行;<br>");
		ActionContext.getContext().put("active", "Maintain");
		return "success";
	};

	private int getOrderIdByNameORCreated(String SO, String order_name) {
		// TODO Auto-generated method stub
		SEEEOrder seeeOrder = orderDao.queryBySO(SO);
		if (seeeOrder == null) {
			seeeOrder = new SEEEOrder();
			seeeOrder.setName(order_name);
			seeeOrder.setSO(SO);
			seeeOrder.setSchedule_starttime(new Date());
			orderDao.save(seeeOrder);
			seeeOrder = orderDao.queryBySO(SO);
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
