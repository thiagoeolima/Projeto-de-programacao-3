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
@Table(name="multimedia")
public class Multimedia extends Model{

	@Id
	@GeneratedValue
	private int id;
	
	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String model;
	
	@Column(columnDefinition = "int(3)", nullable = false)
	private int voltage;
	
	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String plugsType;
	
	@Column(columnDefinition = "varchar(50)", nullable = false)
	private String mediaType;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "multimedia")
	private List<Resource> resourcesList;


	public Multimedia() {

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getVoltage() {
		return voltage;
	}


	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}


	public String getPlugsType() {
		return plugsType;
	}


	public void setPlugsType(String plugsType) {
		this.plugsType = plugsType;
	}


	public String getMediaType() {
		return mediaType;
	}


	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
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
