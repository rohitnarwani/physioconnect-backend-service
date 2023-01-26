package com.physioconnect.api.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.physioconnect.api.rest.jpa.UserRepository;

@Service
public class UserService {
	@Autowired    
	private UserRepository userRepository; 

}
