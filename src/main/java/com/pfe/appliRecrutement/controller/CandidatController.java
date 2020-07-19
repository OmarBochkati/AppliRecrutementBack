package com.pfe.appliRecrutement.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pfe.appliRecrutement.domain.Candidat;
import com.pfe.appliRecrutement.domain.Role;
import com.pfe.appliRecrutement.domain.RoleName;
import com.pfe.appliRecrutement.exception.AppException;
import com.pfe.appliRecrutement.payload.ApiResponse;
import com.pfe.appliRecrutement.service.CandidatService;
import com.pfe.appliRecrutement.service.RoleService;

@RestController
@RequestMapping("/candidats")
public class CandidatController {

	@Autowired
	CandidatService candidatService;

	@Autowired
	RoleService roleService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("/{candidatId}")
	public Candidat retrieveCandidatById(@PathVariable Long candidatId) {
		System.out.println("candidatId:"+candidatId);
		return candidatService.retrieveCandidat(candidatId);
	}

	@GetMapping("/allcandidats")
	public List<Candidat> retrieveAllCandidats(@RequestHeader("Authorization") String token, HttpServletResponse response) {
		return candidatService.retrieveAllCandidats();
	}

	@GetMapping("/allcandidates")
	public List<Candidat> retrieveAllCandidates() {
		return candidatService.retrieveAllCandidats();
	}

	@PostMapping("/createCandidat")
	public ResponseEntity<?> createCandidat(@Valid @RequestBody Candidat candidat) {
		System.out.println(candidat);

		candidat.setPassword(passwordEncoder.encode(candidat.getPassword()));

		Role candidatRole = roleService.findRoleByName(RoleName.ROLE_CANDIDAT)
				.orElseThrow(() -> new AppException("User Role not set."));

		//candidat.setRoles(Collections.singleton(candidatRole));

		//Candidat result = candidatService.saveCandidat(candidat);

		URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/candidats/{pseudo}")
                .buildAndExpand("").toUri();
		return ResponseEntity.created(location).body(new ApiResponse(true, "Candidat registered successfully"));
	}

}
