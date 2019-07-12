package com.hcl.Mortage.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "email")
	private String email;

	@Column(name = "gender")
	private String gender;

	@Column(name = "pan")
	private String pan;

	@Column(name = "salary")
	private Double salary;

	@Column(name = "property_type")
	private String propertyType;

	@Column(name = "property_address")
	private String propertyAddress;

	@Column(name = "property_pin_code")
	private String propertyPinCode;

	@Column(name = "property_area_size")
	private Double propertyAreaSize;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
