package com.pfe.appliRecrutement.service;

import java.util.List;

import com.pfe.appliRecrutement.domain.Questionnaire;

public interface QuestionnaireService {

	public List<Questionnaire> getAllQuestionnaire();
	public Questionnaire saveQCM(Questionnaire qcm);

}
