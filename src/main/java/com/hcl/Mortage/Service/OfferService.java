package com.hcl.Mortage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Mortage.Entity.Offer;
import com.hcl.Mortage.Repository.OfferRepository;

@Service
public class OfferService {

	@Autowired
	OfferRepository offerRepository;
	
	public List<Offer> findByOfferPropertyValue(Double offerPropertyValue) {
		
		return offerRepository.findByOfferPropertyValue(offerPropertyValue);
		
	}
	
}
