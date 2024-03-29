package com.hcl.Mortage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Mortage.Entity.UserOffer;
import com.hcl.Mortage.Repository.UserOfferRepository;

@Service
public class UserOfferService {
	
	@Autowired
	UserOfferRepository userOfferRepository;
	
	/** This method will add eligible offer to user. 
	 * @param userId : property of User
	 * @param offerId : property of Offer
	 * @return : UserOffer
	 */
	public UserOffer addUserOffer(Integer userId,  Integer offerId) {
		
		UserOffer userOffer = new UserOffer();
		userOffer.setUserId(userId);
		userOffer.setOfferId(offerId);
		return userOfferRepository.save(userOffer);
		
	}

}
