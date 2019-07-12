package com.hcl.Mortage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.Mortage.Entity.Offer;
import com.hcl.Mortage.Model.UserModel;
import com.hcl.Mortage.Service.UserService;
import com.hcl.Mortage.Validation.LoanValidation;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	LoanValidation loanValidation;

	@Autowired
	UserService userService;

	/** Method to check if user is eligible for laon. If eligible then show Offer
	 * @param model : User model 
	 * @return : ResponseEntity body
	 */
	@PostMapping("/mortage")
	public ResponseEntity<?> checkMortage(@RequestBody UserModel model) {

		boolean isUserValidateForLoan = loanValidation.userValidateForLoan(model);

		if (isUserValidateForLoan) {
			List<Offer> offers = userService.mortage(model);

			if (offers != null && !offers.isEmpty()) {
				return new ResponseEntity<>(offers, HttpStatus.OK);
			} else {
				return new ResponseEntity<>("No Offers for you !!! ", HttpStatus.OK);
			}

		} else {
			return new ResponseEntity<>("Not Eligible for Loan !!! ", HttpStatus.OK);
		}
	}

	/** This method saves offer for user after its selection
	 * @param userId : id of user availaing offer
	 * @param offerId : Offer id availaing by user
	 * @return : ResponseEntity body
	 */
	@PostMapping("/offer/{userId}/{offerId}")
	public ResponseEntity<?> userOffer(@PathVariable("userId") Integer userId,
			@PathVariable("offerId") Integer offerId) {

		boolean hasOfferAdded = userService.addOfferToUser(userId, offerId);

		if (hasOfferAdded) {
			new ResponseEntity<>("Offer Added for User!!! ", HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

}
