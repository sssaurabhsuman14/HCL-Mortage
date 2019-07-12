package com.hcl.Mortage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.Mortage.Entity.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

	/** This method will return all the offers for the property value less than actual property value
	 * @param offerPropertyValue :e property valu
	 * @return : List of all the offers for user.
	 */
	@Query("select o from Offer o where o.offerPropertyValue  < ?1")
	public List<Offer> findByOfferPropertyValue(Double offerPropertyValue);
}
