package com.otracking.action.dzp;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
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
import com.otracking.bean.DZPTH;
import com.otracking.dao.DZPTHDao;
import com.otracking.dao.MODao;
import com.otracking.tool.LogUtil;

public class SaveDZPInfoByExcelAction extends ActionSupport {
	private int order_id;
	private File dzpexcel;// 必须与表单中的name属性一致
	private String dzpexcelFileName;// 必须是name属性+FileName
	private String error = "无;";
	int savenumber = 0;
	int updatenumber = 0;
	DZPTHDao dzpthDao = new DZPTHDao();
	MODao moDao = new MODao();

	public String execute() throws Exception {
		List<String> headingLine = new ArrayList<>();
		List<DZPTH> dzpths = new ArrayList<>();
		// 将客户端的文件上传到服务端

		String desPath = ServletActionContext.getServletContext().getRealPath("../DZPFile");
		// System.out.println(dzpexcelFileName);
		// System.out.println(order_id);
		//File destFile = new File(desPath, dzpexcelFileName);
		//FileUtils.copyFile(dzpexcel, destFile);

		// 解析excel
		// 得到一个excel文件
		ZipSecureFile.setMinInflateRatio(-1.0d);
		XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(dzpexcel));
		// 得到第一张表
		XSSFSheet sheet = book.getSheetAt(0);
		// 遍历输出
		XSSFRow headingRow = sheet.getRow(2);
		if (headingRow != null) {
			int h = 3;
			while (headingRow.getCell(h) != null && !headingRow.getCell(h).getStringCellValue().trim().equals("")) {
				headingRow.getCell(h).setCellType(CellType.STRING);
				String value = headingRow.getCell(h).getStringCellValue().trim();
				// System.out.println(value);
				headingLine.add(value);
				h++;
			}
		}

		for (int i = 3; i <= sheet.getLastRowNum(); i++) {
			// 得到行
			XSSFRow row = sheet.getRow(i);
			if (row == null || row.getCell(2) == null) {
				break;
			} else {
				row.getCell(2).setCellType(CellType.STRING);
				if (row.getCell(2).getStringCellValue() == null
				        || row.getCell(2).getStringCellValue().trim().equals("")) {
					break;
				}
			}
			int j = 3;
			// System.out.println(i + "--" + row.getCell(2).getStringCellValue().trim());
			while (row.getCell(j) != null) {
				row.getCell(j).setCellType(CellType.STRING);
				row.getCell(3).setCellType(CellType.STRING);
				String value = row.getCell(j).getStringCellValue().trim();
				if (value.equals("")) {
					break;
				}
				dzpths.add(new DZPTH(row.getCell(2).getStringCellValue().trim(),
				        headingRow.getCell(j).getStringCellValue().trim(), row.getCell(j).getStringCellValue().trim(),
				        j - 3, order_id));
				j++;
			}
			// 更新柜深

			savenumber++;
		}
		if (error.equals("无;") && dzpths.size() != 0) {
			dzpthDao.saveBatch(dzpths);
		}
		LogUtil.RollingFile.error("error:" + error);
		LogUtil.RollingFile.error("savenumber:" + savenumber);
		ActionContext.getContext().put("error", "异常:" + error);
		ActionContext.getContext().put("savenumber", "上传成功行数:" + savenumber + "行;<br>");
		ActionContext.getContext().put("order_id", order_id);
		ActionContext.getContext().put("error", error);
		return "success";
	};

	public File getDzpexcel() {
		return dzpexcel;
	}

	public void setDzpexcel(File dzpexcel) {
		this.dzpexcel = dzpexcel;
	}

	public String getDzpexcelFileName() {
		return dzpexcelFileName;
	}

	public void setDzpexcelFileName(String dzpexcelFileName) {
		this.dzpexcelFileName = dzpexcelFileName;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

}
