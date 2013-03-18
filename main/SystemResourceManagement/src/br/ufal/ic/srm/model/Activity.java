package br.ufal.ic.srm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="activities")
public class Activity implements Model{
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
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
