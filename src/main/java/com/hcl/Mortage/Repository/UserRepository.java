package com.hcl.Mortage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.Mortage.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
