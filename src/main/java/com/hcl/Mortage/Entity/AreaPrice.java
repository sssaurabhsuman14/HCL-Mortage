package com.hcl.Mortage.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area_price")
public class AreaPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "pin_code")
	private String pinCode;

	@Column(name = "property_price_per_unit")
	private Double propertyPricePerUnit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Double getPropertyPricePerUnit() {
		return propertyPricePerUnit;
	}

	public void setPropertyPricePerUnit(Double propertyPricePerUnit) {
		this.propertyPricePerUnit = propertyPricePerUnit;
	}

}
