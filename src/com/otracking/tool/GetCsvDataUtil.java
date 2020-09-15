package com.otracking.tool;

import java.io.InputStreamReader;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class GetCsvDataUtil {

	public <T> List<T> getCsvData(Class<T> Clazz, InputStreamReader in) {
		HeaderColumnNameMappingStrategy<T> strategy = new HeaderColumnNameMappingStrategy<>();
		strategy.setType(Clazz);
		CsvToBean<T> csvToBean = new CsvToBeanBuilder<T>(in).withSeparator(',').withQuoteChar('\'')
		        .withMappingStrategy(strategy).build();
		List<T> list = csvToBean.parse();
		System.out.println(System.currentTimeMillis());
		System.out.println(list.size());
		return list;
	}

}
