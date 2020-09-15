package com.otracking.tool;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;

import org.junit.Test;

public class MD5Utils {

	public static String md5(String plainText) {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("md5 error");
		}
		return new BigInteger(1, secretBytes).toString(16);
	}

	public static double getTwoDecimal(double num) {
		DecimalFormat dFormat = new DecimalFormat("#.00");
		String yearString = dFormat.format(num);
		Double temp = Double.valueOf(yearString);
		return temp;
	}

	@Test
	public void test() {
		System.out.println(md5("123"));
	}
}
