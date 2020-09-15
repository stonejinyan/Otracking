package com.otracking.action.materialpull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.otracking.bean.MaterialPullTable;
import com.otracking.bean.Staff;
import com.otracking.dao.MaterialPullDao;
import com.otracking.tool.GetCsvDataUtil;

public class PullSuccessBatchAction extends ActionSupport {

	private File excel;// 必须与表单中的name属性一致
	private String excelFileName;// 必须是name属性+FileName
	private String error = "";
	int savenumber = 0;
	int updatenumber = 0;
	GetCsvDataUtil getCsvDataUtil = new GetCsvDataUtil();

	public String execute() throws Exception {
		// 将客户端的文件上传到服务端
		String desPath = ServletActionContext.getServletContext().getRealPath("/") + "/../OtrackingUpLoad";
		// System.out.println(excelFileName);

		File destFile = new File(desPath, excelFileName + new Date().getTime());
		FileUtils.copyFile(excel, destFile);
		ConvertUtils.register(new DateLocaleConverter(), java.util.Date.class);
		HeaderColumnNameMappingStrategy<MaterialPullTable> strategy = new HeaderColumnNameMappingStrategy<>();
		strategy.setType(MaterialPullTable.class);
		CsvToBean<MaterialPullTable> csvToBean = new CsvToBeanBuilder<MaterialPullTable>(
		        new InputStreamReader(getInputStream(new FileInputStream(destFile)), "UTF-8")).withSeparator(',')
		                .withQuoteChar('\'').withMappingStrategy(strategy).build();
		// System.out.println(csvToBean.parse());
		List<MaterialPullTable> materialPullTables = csvToBean.parse();
		MaterialPullDao materialPullDao = new MaterialPullDao();
		int flag = 2;
		Staff staff = (Staff) ActionContext.getContext().getSession().get("staff");
		for (int i = 0; i < materialPullTables.size(); i++) {
			materialPullDao.updateFlag(materialPullTables.get(i).getId(), 3, flag, staff.getId());
		}
		return "success";
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

	public static InputStream getInputStream(InputStream in) throws IOException {

		PushbackInputStream testin = new PushbackInputStream(in);
		int ch = testin.read();
		if (ch != 0xEF) {
			testin.unread(ch);
		} else if ((ch = testin.read()) != 0xBB) {
			testin.unread(ch);
			testin.unread(0xef);
		} else if ((ch = testin.read()) != 0xBF) {
			throw new IOException("错误的UTF-8格式文件");
		} else {
		}
		return testin;
	}
}
