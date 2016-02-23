package com.vsii.tsc.guru.utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.vsii.tsc.guru.model.TestCase;
import com.vsii.tsc.guru.testbase.TestBase;
import com.vsii.tsc.guru.utility.ExcelHandle;

public class ExtentReporterNG implements IReporter {
	static Properties p;
	public static ExtentReports extent;
	public ITestResult result;
	static String method;

	public TestCase testcase;
	public List<TestCase> tcList;

	// Write test results into test report
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		extent = new ExtentReports(TestBase.p.getProperty("reportPath"), false);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				// Open excel file with the sheet name is the test name in
				// testng.xml
				try {
					ExcelHandle.openExcelFile(TestBase.p.getProperty("tcFile"), context.getName(),
							Integer.parseInt(TestBase.p.getProperty("tcIDCol")),
							Integer.parseInt(TestBase.p.getProperty("tcDescCol")),
							Integer.parseInt(TestBase.p.getProperty("tcStepCol")));
					// Find test case ID in tcIDList and tcList
					tcList = new ArrayList<TestCase>();
					// Create test case List
					for (String id : ExcelHandle.tcIDList) {
						int index = ExcelHandle.tcIDList.indexOf(id);
						if (TestBase.tcList.containsKey(id)) {
							testcase = new TestCase();
							testcase.setTcID(id);
							testcase.setTcDesc(ExcelHandle.tcDescList.get(index));
							testcase.setTcStep(ExcelHandle.tcStepList.get(index));
							testcase.setTcImage(TestBase.tcList.get(id));
							tcList.add(testcase);
						}
					}

				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					buildTestNodes(context.getPassedTests(), LogStatus.PASS);
					buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
					buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Create test result file for each test
				ExcelHandle.createExcelFile(TestBase.p.getProperty("resultpath") + context.getName() + ".xlsx");
			}

		}

		extent.flush();
		extent.close();
		TestBase.driver.quit();
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) throws IOException {

		ExtentTest test;
		if (tests.size() > 0) {

			for (ITestResult result : tests.getAllResults()) {
				// Get Method name
				method = result.getMethod().getMethodName();
				// Start test
				test = extent.startTest(result.getMethod().getMethodName());
				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);
				// Create test message
				String message = "Test " + status.toString().toLowerCase() + "ed";
				if (result.getThrowable() != null)
					message = result.getThrowable().getMessage();

				// Write test results to excel file
				if (status.toString().equals("pass")) {
					ExcelHandle.writeTestResults(method, 5, "Passed");
				} else if (status.toString().equals("fail")) {
					ExcelHandle.writeTestResults(ExtentReporterNG.method, 5, "Failed");
				}

				//Log test case's information
				for (TestCase tc : tcList) {
					if (tc.getTcID().equals(method)) {
						//Description
						test.log(LogStatus.INFO, tc.getTcDesc());
						//Steps
						test.log(LogStatus.INFO, tc.getTcStep());
						//Images
						for (String image : tc.getTcImage()) {
							String imageTestCase = null;
							imageTestCase = image.substring(0, image.indexOf("_"));
							System.out.println("Image:" + imageTestCase);
							// Add image to report
							if (imageTestCase.equals(method)) {
								test.log(LogStatus.INFO,
										test.addScreenCapture(p.getProperty("imagePath") + image + ".jpg"));
								TestBase.imageList.remove(image);
								break;
							}

						}
						break;
					}
				}

				// Write status to report
				test.log(status, message);

				extent.endTest(test);

			}
		}

	}

}
