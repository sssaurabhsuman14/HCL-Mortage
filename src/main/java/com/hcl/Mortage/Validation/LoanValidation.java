package com.hcl.Mortage.Validation;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hcl.Mortage.Model.UserModel;
import com.hcl.Mortage.Service.AreaPriceService;
import com.hcl.Mortage.Utils.MortageUtils;

@Component
public class LoanValidation {
	
	@Autowired
	AreaPriceService areaPriceService;
	
	public boolean userValidateForLoan(UserModel userModel) {
		
		int age = Period.between(userModel.getDob(), LocalDate.now()).getYears();
		
		Double salary = userModel.getSalary();
		
		Double areaPrice = areaPriceService.findAmountByPinCode(userModel.getPropertyPinCode());
		
		Double propertyValue = MortageUtils.calculatePropertyValue(userModel.getPropertyAreaSize(), areaPrice);
		
		if(age >= 27 && salary > 10000 && propertyValue > 500000) {
			return true;
		}
		return false;
	}
	
}
