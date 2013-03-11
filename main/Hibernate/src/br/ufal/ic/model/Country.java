package br.ufal.ic.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "COUNTRIES")
public class Country implements Serializable {
	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	@Id
	@Column(columnDefinition = "char(2)")
	private String id;

	@Column(columnDefinition = "varchar(40)")
	private String country_name;

	@ManyToOne
	@JoinColumn(name = "region_id", referencedColumnName = "id")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Region region;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
	private List<Location> locations;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	

}
