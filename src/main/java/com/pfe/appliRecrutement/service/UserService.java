package com.pfe.appliRecrutement.service;

import java.util.List;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getUsersByRole(Role role);

}
