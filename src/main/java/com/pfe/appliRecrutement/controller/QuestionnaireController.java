package com.pfe.appliRecrutement.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pfe.appliRecrutement.domain.Questionnaire;
import com.pfe.appliRecrutement.payload.ApiResponse;
import com.pfe.appliRecrutement.service.QuestionnaireService;

@RestController
@RequestMapping("/questionnaires")
public class QuestionnaireController {

	@Autowired
	private QuestionnaireService questionnaireService;

	@GetMapping("/allQCMs")
	public List<Questionnaire> allQuestionnaire(){
		return questionnaireService.getAllQuestionnaire();
	}

	@PostMapping("/createQCM")
	public ResponseEntity<?> createQCM(@Valid @RequestBody Questionnaire questionnaire){
		System.out.println("test");
		Questionnaire qcm = questionnaireService.saveQCM(questionnaire);
		URI location = ServletUriComponentsBuilder
                .fromCurrentContextPath().path("/api/questionnaires/{nomTest}")
                .buildAndExpand(qcm.getNomTest()).toUri();
		return ResponseEntity.created(location).body(new ApiResponse(true, "Questionnaire enregistré avec succés"));
	}

}
