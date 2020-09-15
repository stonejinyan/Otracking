package com.otracking.bean;

public class ZXDInfo {

	private MOPackageInfo[] moPackageInfos;
	private String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public MOPackageInfo[] getMoPackageInfos() {
		return moPackageInfos;
	}

	public void setMoPackageInfos(MOPackageInfo[] moPackageInfos) {
		this.moPackageInfos = moPackageInfos;
	}

}
