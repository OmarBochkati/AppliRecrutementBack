package com.pfe.appliRecrutement.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Questionnaire")
public class Questionnaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name="description")
	private String description;

	@Column(name="nomTest")
	private String nomTest;

	@Column(name="temps")
	private int temps;

	@Column(name="maxPoint")
	private int maxPoint;

	public Questionnaire() {

	}

	public Questionnaire(Long id, String desc, String nomT, int temps) {
		this.id=id;
		this.description = desc;
		this.nomTest = nomT;
		this.temps = temps;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNomTest() {
		return nomTest;
	}
	public void setNomTest(String nomTest) {
		this.nomTest = nomTest;
	}
	public int getTemps() {
		return temps;
	}
	public void setTemps(int temps) {
		this.temps = temps;
	}
	public Long getId() {
		return id;
	}

	public int getMaxPoint() {
		return maxPoint;
	}

	public void setMaxPoint(int maxPoint) {
		this.maxPoint = maxPoint;
	}
}
