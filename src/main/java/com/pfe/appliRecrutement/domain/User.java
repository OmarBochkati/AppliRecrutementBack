package com.pfe.appliRecrutement.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users",
		uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "pseudo"
            })
        })
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Column(name="niveau")
	private int niveau;

	@Column(name="compteStatus")
	private boolean compteStatus;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
    private Role role;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="candidat_qcm",
		joinColumns
			= @JoinColumn(name="user_id", referencedColumnName="id"),
		inverseJoinColumns
			= @JoinColumn(name="questionnaire_id", referencedColumnName="id")
			)

	private List<Questionnaire> questionnaires;

	public User() {

	}

	public User(String pseudo, String password, String prenom, String nom) {
		this.pseudo = pseudo;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
	}

	public User(Long id, String pseudo, String nom, String prenom, String email, String telephone,
			List<Questionnaire> questionnaires) {
		this.id = id;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.questionnaires = questionnaires;
	}

	public User(Long id, String pseudo, String password, String prenom, String nom) {
		this.id = id;
		this.pseudo = pseudo;
		this.password = password;
		this.prenom = prenom;
		this.nom = nom;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

	public List<Questionnaire> getQuestionnaires() {
		return questionnaires;
	}

	public void setQuestionnaires(List<Questionnaire> questionnaires) {
		this.questionnaires = questionnaires;
	}

}
