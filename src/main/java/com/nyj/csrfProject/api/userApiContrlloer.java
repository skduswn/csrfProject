package com.nyj.csrfProject.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nyj.csrfProject.dto.ResponseDto;
import com.nyj.csrfProject.model.User;
import com.nyj.csrfProject.service.UserService;

@RestController
public class userApiContrlloer {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("api/user/login")
	public ResponseDto<Integer> login(@RequestBody User user, HttpSession session){
		System.out.println("UserApiController : login 호출됨");
		User principal = userService.로그인(user); //접근주체
		
		if(principal !=null) {
			session.setAttribute("principal", principal);
		}
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
}
