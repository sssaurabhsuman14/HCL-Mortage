package com.hcl.Mortage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Mortage.Entity.AreaPrice;
import com.hcl.Mortage.Repository.AreaPriceRepository;

@Service
public class AreaPriceService {
	
	@Autowired
	AreaPriceRepository areaPriceRepository;

	/** This method will find AreaCode based on pincode
	 * @param pinCode : property for AreaCode
	 * @return : AreaPrice
	 */
	public AreaPrice findByPinCode(String pinCode) {
		return areaPriceRepository.findByPinCode(pinCode);
	}
	
	/** his method will find Amount based on pincode
	 * @param pinCode : property for AreaCode
	 * @return : Amount for pincode
	 */
	public Double findAmountByPinCode(String pinCode) {
		return areaPriceRepository.findAmountByPinCode(pinCode);
	}
	
}
