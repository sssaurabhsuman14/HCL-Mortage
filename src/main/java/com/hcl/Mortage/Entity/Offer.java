package com.hcl.Mortage.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offer")
public class Offer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offer_id")
	private Integer id;
	
	@Column(name = "offer_property_value")
	private Double offerPropertyValue;

	@Column(name = "offer_name")
	private String offerName;

	@Column(name = "offer_desc")
	private String offerDesc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getOfferPropertyValue() {
		return offerPropertyValue;
	}

	public void setOfferPropertyValue(Double offerPropertyValue) {
		this.offerPropertyValue = offerPropertyValue;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferDesc() {
		return offerDesc;
	}

	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}

}
