package com.nyj.csrfProject.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nyj.csrfProject.model.User;
import com.nyj.csrfProject.repository.UserRepository;

@Service //Ioc를 해준다
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Transactional(readOnly = true)  //select 할 때 트랜잭션 시작, 서비스 종료시 종료
	public User 로그인(User user) {
		return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
