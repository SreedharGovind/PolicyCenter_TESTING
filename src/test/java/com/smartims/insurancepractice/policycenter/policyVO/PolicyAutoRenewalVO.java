package com.smartims.insurancepractice.policycenter.policyVO;

public class PolicyAutoRenewalVO {

	String TestingSystemClockDate;
	String TestingSystemClockTime;
	String TestingSystemClockCurrentDate;
	String TestingSystemClockCurrentTime;
	String policyRenewTermType ;

	public String getTestingSystemClockDate() {
		return TestingSystemClockDate;
	}

	public void setTestingSystemClockDate(String testingSystemClockDate) {
		TestingSystemClockDate = testingSystemClockDate;
	}

	public String getTestingSystemClockTime() {
		return TestingSystemClockTime;
	}

	public void setTestingSystemClockTime(String testingSystemClockTime) {
		TestingSystemClockTime = testingSystemClockTime;
	}

	public String getPolicyRenewTermType() {
		return policyRenewTermType;
	}

	public void setPolicyRenewTermType(String policyRenewTermType) {
		this.policyRenewTermType = policyRenewTermType;
	}

	public String getTestingSystemClockCurrentDate() {
		return TestingSystemClockCurrentDate;
	}

	public String getTestingSystemClockCurrentTime() {
		return TestingSystemClockCurrentTime;
	}

	public void setTestingSystemClockCurrentDate(String testingSystemClockCurrentDate) {
		TestingSystemClockCurrentDate = testingSystemClockCurrentDate;
	}

	public void setTestingSystemClockCurrentTime(String testingSystemClockCurrentTime) {
		TestingSystemClockCurrentTime = testingSystemClockCurrentTime;
	}

}
