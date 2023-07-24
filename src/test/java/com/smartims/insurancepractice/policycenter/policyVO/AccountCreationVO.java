package com.smartims.insurancepractice.policycenter.policyVO;

public class AccountCreationVO {

	String username;
	String password;
	String companyname;
	String firstName;
	String lastName;
	String state;
	String addressLine1;
	String city;
	String ZIPcode;
	String addressType;
	String organizationName;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getZIPcode() {
		return ZIPcode;
	}

	public String getAddressType() {
		return addressType;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZIPcode(String zIPcode) {
		ZIPcode = zIPcode;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

}
