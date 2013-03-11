package br.ufal.ic.srm.model;

import java.util.Date;

public class Resources {

	private int resourceId;
	private Date iniDate;
	private Date endDte;
	private String status;
	private User responsable;
	private Activities activities;
	private Places places;

	public Resources(int resourceId, Date iniDate, Date endDte, String status,
			User responsable, Activities activities, Places places) {
		this.resourceId = resourceId;
		this.iniDate = iniDate;
		this.endDte = endDte;
		this.status = status;
		this.responsable = responsable;
		this.activities = activities;
		this.places = places;
	}
	
	public Resources(){
		
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
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
	
	
	

}
