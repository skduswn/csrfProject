package com.nyj.csrfProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyj.csrfProject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
