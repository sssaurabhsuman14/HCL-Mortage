package com.hcl.Mortage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.Mortage.Entity.Offer;
import com.hcl.Mortage.Entity.User;
import com.hcl.Mortage.Entity.UserOffer;
import com.hcl.Mortage.Model.UserModel;
import com.hcl.Mortage.Repository.UserRepository;
import com.hcl.Mortage.Utils.MortageUtils;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	AreaPriceService areaPriceService;

	@Autowired
	OfferService offerService;

	@Autowired
	UserOfferService userOfferService;

	/**
	 * This method will save user eligible for loan and show them offers if they are
	 * eligible. It return the all the offers which are less than or equals to 80%
	 * of property value.
	 * 
	 * @param model : UserModel
	 * @return : List of offers available for user
	 */
	public List<Offer> mortage(UserModel model) {

		userRepository.save(toEntity(model));

		Double propertyPricePerUnit = areaPriceService.findAmountByPinCode(model.getPropertyPinCode());

		Double overallPropertyPrice = MortageUtils.calculatePropertyValue(model.getPropertyAreaSize(),
				propertyPricePerUnit);

		Double offerPropertyValue = 0.92 * overallPropertyPrice;

		List<Offer> offers = offerService.findByOfferPropertyValue(offerPropertyValue);

		return offers;
	}

	/** This method add offers to user
	 * @param userId : id property of user
	 * @param offerId : id property of offer
	 * @return : boolean true if offer is added to user else false
	 */
	public Boolean addOfferToUser(Integer userId, Integer offerId) {
		UserOffer userOffer = userOfferService.addUserOffer(userId, offerId);

		if (userOffer != null) {
			return true;
		}
		return false;
	}

	/** This method convert model to User entity.
	 * @param model : UserModel type.
	 * @return : User entity
	 */
	User toEntity(UserModel model) {

		User user = new User();

		user.setDob(model.getDob());
		user.setEmail(model.getEmail());
		user.setGender(model.getGender());
		user.setPan(model.getPan());
		user.setPhoneNumber(model.getPhoneNumber());
		user.setPropertyAddress(model.getPropertyAddress());
		user.setPropertyAreaSize(model.getPropertyAreaSize());
		user.setPropertyPinCode(model.getPropertyPinCode());
		user.setPropertyType(model.getPropertyType());
		user.setSalary(model.getSalary());
		user.setUserName(model.getUserName());

		return user;
	}

}
