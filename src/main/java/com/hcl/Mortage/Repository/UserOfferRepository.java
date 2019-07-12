package com.hcl.Mortage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.Mortage.Entity.UserOffer;

@Repository
public interface UserOfferRepository extends JpaRepository<UserOffer, Integer>{

	
}
