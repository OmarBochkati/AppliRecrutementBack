package com.pfe.appliRecrutement.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="candidats")
public class Candidat {



//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name="candidat_qcm",
//		joinColumns
//			= @JoinColumn(name="candidat_id", referencedColumnName="id"),
//		inverseJoinColumns
//			= @JoinColumn(name="questionnaire_id", referencedColumnName="id")
//			)
//	private List<Questionnaire> questionnaires;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="pseudo")
	private String pseudo;

	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;

	@Column(name="email")
	private String email;

	@Column(name="telephone")
	private String telephone;

	@Column(name="password")
	private String password;

	@Column(name="confirmPassword")
	@JsonIgnore
	@Transient
	private String confirmPassword;

	@Column(name="niveau")
	private int niveau;

	@Column(name="compteStatus")
	private boolean compteStatus;

	public Candidat() {

	}

//	public Candidat(Long id, String pseudo, String nom, String prenom, String email, String telephone,
//			List<Questionnaire> questionnaires) {
//		this.id = id;
//		this.pseudo = pseudo;
//		this.nom = nom;
//		this.prenom = prenom;
//		this.email = email;
//		this.telephone = telephone;
//		this.questionnaires = questionnaires;
//	}
	public Candidat(Long id, String pseudo, String nom, String prenom, String email, String telephone) {
		this.id = id;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
	}

	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
//	public List<Questionnaire> getQuestionnaires() {
//		return questionnaires;
//	}
//	public void setQuestionnaires(List<Questionnaire> questionnaires) {
//		this.questionnaires = questionnaires;
//	}
	public Long getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public boolean isCompteStatus() {
		return compteStatus;
	}
	public void setCompteStatus(boolean compteStatus) {
		this.compteStatus = compteStatus;
	}
}
