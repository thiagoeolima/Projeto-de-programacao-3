package br.ufal.ic.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="LOCATIONS")
public class Location implements Serializable {
	public List<Departament> getDepartaments() {
		return departaments;
	}

	public void setDepartaments(List<Departament> departaments) {
		this.departaments = departaments;
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name ="street_address",columnDefinition = "varchar(40)")
	private String Address;
	
	@Column(name ="postal_code",columnDefinition = "varchar(12)")
	private String postalCode;
	
	@Column(nullable=false)
	private String city;
	
	@Column(name ="state",columnDefinition = "varchar(25)")
	private String state;
	
	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "id",columnDefinition = "char(2)")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Country	country;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	private List<Departament> departaments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
