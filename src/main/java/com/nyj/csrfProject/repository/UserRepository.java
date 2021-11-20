package com.nyj.csrfProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nyj.csrfProject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	// SELECT * FROM user WHERE username = ?1 AND password=?2;
	User findByUsernameAndPassword(String username, String password);
	

}
