package com.pfe.appliRecrutement.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Result {

	public Result() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name="name")
	private String name;

	@Column(name="date")
	private Date date;

	@Column(name="level")
	private String level;

	@Column(name="totalPoints")
	private Float totalPoints;

	@Column(name="totalPointsLibres")
	private Float totalPointsLibres;

	@Column(name="noteFinale")
	private Float noteFinale;

	@Column(name="corrige")
	private Boolean corrige;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Float getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(Float totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Float getTotalPointsLibres() {
		return totalPointsLibres;
	}

	public void setTotalPointsLibres(Float totalPointsLibres) {
		this.totalPointsLibres = totalPointsLibres;
	}

	public Float getNoteFinale() {
		return noteFinale;
	}

	public void setNoteFinale(Float noteFinale) {
		this.noteFinale = noteFinale;
	}

	public Boolean getCorrige() {
		return corrige;
	}

	public void setCorrige(Boolean corrige) {
		this.corrige = corrige;
	}

	public Long getId() {
		return id;
	}

}
