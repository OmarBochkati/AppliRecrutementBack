package com.pfe.appliRecrutement.service.impl;

import java.util.List;

import com.pfe.appliRecrutement.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.appliRecrutement.domain.Questionnaire;
import com.pfe.appliRecrutement.service.QuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private QuestionnaireRepository questionnaireRepository;

	@Override
	public List<Questionnaire> getAllQuestionnaire() {
		return questionnaireRepository.findAll();
	}

	@Override
	public Questionnaire saveQCM(Questionnaire qcm) {
		return questionnaireRepository.save(qcm);
	}


}
