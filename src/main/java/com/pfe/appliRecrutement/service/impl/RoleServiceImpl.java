package com.pfe.appliRecrutement.service.impl;

import java.util.Optional;

import com.pfe.appliRecrutement.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.RoleName;
import com.pfe.appliRecrutement.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Optional<Role> findRoleByName(RoleName roleName) {
		return roleRepository.findByName(roleName);
	}

}
