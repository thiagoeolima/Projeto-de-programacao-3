package br.ufal.ic.srm.model;

public class Places {

	private String name;
	private int capacity;
	private String plugsType;
	private int idPlace;

	public Places(String name, int capacity, String plugsType, int idPlace) {
		this.name = name;
		this.capacity = capacity;
		this.plugsType = plugsType;
		this.idPlace = idPlace;
	}

	public Places() {

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

	public int getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

}
