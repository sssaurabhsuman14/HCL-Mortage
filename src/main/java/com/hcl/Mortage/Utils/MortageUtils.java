package com.hcl.Mortage.Utils;

import org.springframework.stereotype.Component;

@Component
public class MortageUtils {

	/** This method will calculate the actual property price value
	 * @param areaSize : area size of the property
	 * @param propertyPrice : price per unit for the property
	 * @return : overall property price
	 */
	public static Double calculatePropertyValue(Double areaSize, Double propertyPrice) {
			return propertyPrice*areaSize ;
	}
	
	
}
