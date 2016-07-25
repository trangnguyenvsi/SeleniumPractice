package com.vsii.tsc.com.methods;

import com.vsii.tsc.utility.TestBase;

public class GetAccountInfo {
	public static String getAdminName() {
		return TestBase.p.getProperty("adminName");
	}

	public static String getAdminPass() {
		return TestBase.p.getProperty("adminPass");
	}

	public static String getPMName() {
		return TestBase.p.getProperty("PMName");
	}

	public static String getPMPass() {
		return TestBase.p.getProperty("PMPass");
	}

	public static String getPMOName() {
		return TestBase.p.getProperty("PMOName");
	}

	public static String getPMOPass() {
		return TestBase.p.getProperty("PMOPass");
	}

	public static String getUserName() {
		return TestBase.p.getProperty("UserName");
	}

	public static String getUserPass() {
		return TestBase.p.getProperty("UserPass");
	}

	public static String getUserFullName() {
		return TestBase.p.getProperty("UserFullName");
	}
}
