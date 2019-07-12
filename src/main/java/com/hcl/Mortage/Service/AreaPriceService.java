package com.hcl.Mortage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Mortage.Entity.AreaPrice;
import com.hcl.Mortage.Repository.AreaPriceRepository;

@Service
public class AreaPriceService {
	
	@Autowired
	AreaPriceRepository areaPriceRepository;

	public AreaPrice findByPinCode(String pinCode) {
		return areaPriceRepository.findByPinCode(pinCode);
	}
	
	public Double findAmountByPinCode(String pinCode) {
		return areaPriceRepository.findAmountByPinCode(pinCode);
	}
	
}
