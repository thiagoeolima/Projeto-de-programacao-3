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
@Table(name="place")
public class Place extends Model {

	@Id
	@GeneratedValue
	private int id;

	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String name;

	@Column(columnDefinition = "int(3)", nullable = false)
	private int capacity;

	@Column(columnDefinition = "varchar(40)", nullable = false)
	private String plugsType;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "place")
	private List<Resource> resourcesList;

	public Place() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getPlugsType() {
		return plugsType;
	}

	public void setPlugsType(String plugsType) {
		this.plugsType = plugsType;
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
