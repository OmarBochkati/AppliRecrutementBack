package com.pfe.appliRecrutement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pfe.appliRecrutement.domain.Candidat;
import com.pfe.appliRecrutement.domain.Questionnaire;

@Component
public class CandidatService {

	private static List<Candidat> candidats = new ArrayList<>();

	static {
		Questionnaire questionnaire1 = new Questionnaire(new Long(1),"questionnaire1","questionnaire1", 60);
		Questionnaire questionnaire2 = new Questionnaire(new Long(2),"questionnaire2","questionnaire2", 60);

		//Candidat candidat = new Candidat(new Long(1),"candidatPseudo","candidatNom","candidatPrenom","candidatEmail","candidatTelephone", Arrays.asList(questionnaire1,questionnaire2));
		Candidat candidat1 = new Candidat(new Long(1),"candidatPseudo","candidatNom","candidatPrenom","candidatEmail","candidatTelephone");
		Candidat candidat2 = new Candidat(new Long(2),"candidatPseudo2","candidatNom2","candidatPrenom","candidatEmail","candidatTelephone");
		Candidat candidat3 = new Candidat(new Long(3),"candidatPseudo3","candidatNom3","candidatPrenom","candidatEmail","candidatTelephone");
		candidats.add(candidat1);
		candidats.add(candidat2);
		candidats.add(candidat3);
	}

	public Candidat retrieveCandidat(Long candidatId) {
		for (Candidat candidat : candidats) {
			if(candidat.getId().equals(candidatId)) {
				return candidat;
			}
		}
		return null;
	}

	public List<Candidat> retrieveAllCandidats() {
		return candidats;
	}

}
