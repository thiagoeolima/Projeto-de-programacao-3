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
@Table(name = "users")
public class User implements Model{
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name", columnDefinition = "varchar(40)", nullable = false)
	private String name;

	@Column(columnDefinition = "varchar(45)")
	private String email;

	@Column(columnDefinition = "varchar(20)", nullable = false)
	private String login;

	@Column(name = "password", columnDefinition = "varchar(100)", nullable = false)
	private String password;

	@Column(name = "phone_number", columnDefinition = "varchar(20)")
	private String number;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Activity> activity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}



	public List<Activity> getActivities() {
		return activity;
	}

	public void setActivities(List<Activity> activities) {
		this.activity = activities;
	}

	public boolean validate() {
		if(login != null && password != null){
			//consulta
			return true;
			
		}

		return false;
	}
	
	public List errors() {
		//Criar lista de Logs
		return null;
		
	}

}
