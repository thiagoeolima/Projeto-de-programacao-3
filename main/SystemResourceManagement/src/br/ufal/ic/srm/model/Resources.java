package br.ufal.ic.srm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "resources")
public class Resources implements Model {
	@Id
	@GeneratedValue
	private int id;

	@Column(name = "start", columnDefinition = "date", nullable = false)
	private Date iniDate;
	
	@Column(name = "finish", columnDefinition = "date", nullable = false)
	private Date endDte;

	@Column(columnDefinition = "BOOLEAN",nullable=false)
	private String status;

	private User responsable;

	private Activities activities;

	private Places places;

	public Resources(int id, Date iniDate, Date endDte, String status,
			User responsable, Activities activities, Places places) {
		this.id = id;
		this.iniDate = iniDate;
		this.endDte = endDte;
		this.status = status;
		this.responsable = responsable;
		this.activities = activities;
		this.places = places;
	}

	public Resources() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getIniDate() {
		return iniDate;
	}

	public void setIniDate(Date iniDate) {
		this.iniDate = iniDate;
	}

	public Date getEndDte() {
		return endDte;
	}

	public void setEndDte(Date endDte) {
		this.endDte = endDte;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}

	public Activities getActivities() {
		return activities;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
	}

	public Places getPlaces() {
		return places;
	}

	public void setPlaces(Places places) {
		this.places = places;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List errors() {
		// TODO Auto-generated method stub
		return null;
	}

}
