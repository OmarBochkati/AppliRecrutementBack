package com.pfe.appliRecrutement.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Question {

	public Question() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "description")
	private String description;

	@Column(name = "points")
	private Integer points;

	@Column(name = "pointsNeg")
	private Integer pointsNeg;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getPointsNeg() {
		return pointsNeg;
	}

	public void setPointsNeg(Integer pointsNeg) {
		this.pointsNeg = pointsNeg;
	}

	public Long getId() {
		return id;
	}

}
