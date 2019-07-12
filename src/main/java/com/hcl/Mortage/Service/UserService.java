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

	public List<Offer> mortage(UserModel model) {

		userRepository.save(toEntity(model));

		Double propertyPricePerUnit = areaPriceService.findAmountByPinCode(model.getPropertyPinCode());

		Double overallPropertyPrice = MortageUtils.calculatePropertyValue(model.getPropertyAreaSize(),
				propertyPricePerUnit);

		Double offerPropertyValue = 0.92 * overallPropertyPrice;

		List<Offer> offers = offerService.findByOfferPropertyValue(offerPropertyValue);

		return offers;
	}

	public Boolean addOfferToUser(Integer userId,  Integer offerId) {
		UserOffer userOffer= userOfferService.addUserOffer(userId, offerId);
		
		if(userOffer != null) {
			return true;
		}
		return false;
	}
	User toEntity(UserModel model) {
		
		User user  = new User();
		
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
