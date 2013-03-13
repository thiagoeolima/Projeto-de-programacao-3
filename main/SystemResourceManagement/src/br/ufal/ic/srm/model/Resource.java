package br.ufal.ic.srm.model;

import java.util.Date;
import java.util.List;

public class Resource implements Model{

	private int resourceId;
	private Date iniDate;
	private Date endDte;
	private String status;
	private User responsable;
	private Activity activities;
	private Place places;

	public Resource(int resourceId, Date iniDate, Date endDte, String status,
			User responsable, Activity activities, Place places) {
		this.resourceId = resourceId;
		this.iniDate = iniDate;
		this.endDte = endDte;
		this.status = status;
		this.responsable = responsable;
		this.activities = activities;
		this.places = places;
	}
	
	public Resource(){
		
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

	public Activity getActivities() {
		return activities;
	}

	public void setActivities(Activity activities) {
		this.activities = activities;
	}

	public Place getPlaces() {
		return places;
	}

	public void setPlaces(Place places) {
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
