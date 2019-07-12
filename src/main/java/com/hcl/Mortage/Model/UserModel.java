package com.hcl.Mortage.Model;

import java.time.LocalDate;
import java.util.Date;

public class UserModel {

	private String userName;

	private String phoneNumber;

	private LocalDate dob;

	private String email;

	private String gender;

	private String pan;

	private Double salary;

	private String propertyType;

	private String propertyAddress;

	private String propertyPinCode;

	private Double propertyAreaSize;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getPropertyPinCode() {
		return propertyPinCode;
	}

	public void setPropertyPinCode(String propertyPinCode) {
		this.propertyPinCode = propertyPinCode;
	}

	public Double getPropertyAreaSize() {
		return propertyAreaSize;
	}

	public void setPropertyAreaSize(Double propertyAreaSize) {
		this.propertyAreaSize = propertyAreaSize;
	}

}
