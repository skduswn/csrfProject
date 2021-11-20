package com.nyj.csrfProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nyj.csrfProject.model.User;
import com.nyj.csrfProject.repository.UserRepository;

@Controller
//@RestController
	public class loginController {
		
//		  @Autowired//더미컨트롤러테스트가 메모리에 나타날때 동시에 뜸. 의존성 주입.
//		  private UserRepository userRepository;
//
//		//http://localhost:8000/csrfProject/http/join
//		@PostMapping("/http/join")
//		public String join(User user) {
//		    System.out.println("username : "+user.getUsername());
//		    System.out.println("password : "+user.getPassword());
//			userRepository.save(user);
//			return "회원가입이 완료되었습니다.";
//		}
//		

	@GetMapping("/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	


		
	
}

