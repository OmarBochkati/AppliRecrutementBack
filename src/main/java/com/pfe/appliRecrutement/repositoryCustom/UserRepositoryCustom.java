package com.pfe.appliRecrutement.repositoryCustom;

import java.util.List;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.User;

public interface UserRepositoryCustom {
	public List<User> getUsersByRole(Role role);
}
