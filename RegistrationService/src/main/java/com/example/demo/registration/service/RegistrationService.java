package com.example.demo.registration.service;

import java.util.List;

import com.example.demo.registration.dto.UserRegistrationDto;

public interface RegistrationService {
	String save(UserRegistrationDto userDto);
	List<UserRegistrationDto> getAllUsers();
}