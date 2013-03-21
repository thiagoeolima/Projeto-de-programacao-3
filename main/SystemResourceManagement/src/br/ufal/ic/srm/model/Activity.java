package br.ufal.ic.srm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="activity")
public class Activity extends Model{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(columnDefinition = "varchar(40)",nullable=false)
	private String title;
	
	@Column(columnDefinition = "varchar(40)")
	private String description;
	
	@Column(columnDefinition = "int(5)")
	private int numberMembers;
	
	@Column(columnDefinition = "varchar(40)")
	private String supportItens;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "activity")
	private List<Resource> resourcesList;


	public Activity(int idActivities, String title, String description,
			int numberMembers, String supportItens) {
		this.id = idActivities;
		this.title = title;
		this.description = description;
		this.numberMembers = numberMembers;
		this.supportItens = supportItens;
	}
	
	public Activity(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Resource> getResourcesList() {
		return resourcesList;
	}

	public void setResourcesList(List<Resource> resourcesList) {
		this.resourcesList = resourcesList;
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
