package com.hcl.Mortage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.Mortage.Entity.AreaPrice;

@Repository
public interface AreaPriceRepository extends JpaRepository<AreaPrice, Integer>{
	
	public AreaPrice findByPinCode(String pinCode);
	
	
	/** This method will return property price per unit for pincode 
	 * @param pinCode : pincode of the area
	 * @return : property per unit for pincode
	 */
	@Query("select e.propertyPricePerUnit from AreaPrice e where pinCode =?1")
	public Double findAmountByPinCode(String pinCode);

}
