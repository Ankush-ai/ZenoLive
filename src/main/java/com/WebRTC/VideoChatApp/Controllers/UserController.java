package com.WebRTC.VideoChatApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebRTC.VideoChatApp.Service.UserService;
import com.WebRTC.VideoChatApp.User.User;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin(origins = "*")
@Slf4j
@RequiredArgsConstructor
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/users")
	public void register(@RequestBody User user) {
		service.register(user);
	}

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return service.login(user);
	}

	@PostMapping("/logout")
	public void logout(@RequestBody User email) {
		service.logout(email.getEmail());
	}

	@GetMapping("/users")
	public List<User> findAll() {
		return service.findAll();
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handle(Exception ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
}
