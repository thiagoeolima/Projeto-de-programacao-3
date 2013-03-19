package br.ufal.ic.srm.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.criterion.Restrictions;

import br.ufal.ic.srm.util.HibernateUtility;

@Entity
@Table(name = "user")
public class User extends Model {

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
	private List<Resource> resourcesList;

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

	public List<Resource> getResourcesList() {
		return resourcesList;
	}

	public void setResourcesList(List<Resource> resourcesList) {
		this.resourcesList = resourcesList;
	}

	public boolean validate() {

		List<User> user = HibernateUtility.getSession()
				.createCriteria(User.class)
				.add(Restrictions.like("login", this.login))
				.add(Restrictions.like("password", this.password)).list();

		if (user != null) {
			
			
			
			return true;
		}

		return false;
	}

	public List errors() {
		// Criar lista de Logs
		return null;

	}

}
