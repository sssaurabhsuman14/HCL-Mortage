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
	
	/** This method will validate if user eligible for loan.
	 * Validation conditions:
	 * if age is < 25 yrs not eligible
					 if salary < 10k not eligible
					 if property value is < 5Lakhs not eligible
	 * @param userModel
	 * @return
	 */
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
