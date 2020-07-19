package com.pfe.appliRecrutement.service.impl;

import java.util.List;

import com.pfe.appliRecrutement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.User;
import com.pfe.appliRecrutement.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsersByRole(Role role) {
		return userRepository.getUsersByRole(role);
	}




}
