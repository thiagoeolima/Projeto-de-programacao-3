package br.ufal.ic.srm.model;

import java.util.List;

public class Activity implements Model{

	private int idActivities;
	private String title;
	private String description;
	private int numberMembers;
	private String supportItens;

	public Activity(int idActivities, String title, String description,
			int numberMembers, String supportItens) {
		this.idActivities = idActivities;
		this.title = title;
		this.description = description;
		this.numberMembers = numberMembers;
		this.supportItens = supportItens;
	}
	
	public Activity(){
		
	}

	public int getIdActivities() {
		return idActivities;
	}

	public void setIdActivities(int idActivities) {
		this.idActivities = idActivities;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberMembers() {
		return numberMembers;
	}

	public void setNumberMembers(int numberMembers) {
		this.numberMembers = numberMembers;
	}

	public String getSupportItens() {
		return supportItens;
	}

	public void setSupportItens(String supportItens) {
		this.supportItens = supportItens;
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
