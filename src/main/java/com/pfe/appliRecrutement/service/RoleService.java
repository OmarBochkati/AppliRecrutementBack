package com.pfe.appliRecrutement.service;

import java.util.Optional;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.RoleName;

public interface RoleService {

	public Optional<Role> findRoleByName(RoleName name);

}
