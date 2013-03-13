package br.ufal.ic.srm.model;

import java.util.List;

public class Place implements Model{

	private String name;
	private int capacity;
	private String plugsType;
	private int idPlace;

	public Place(String name, int capacity, String plugsType, int idPlace) {
		this.name = name;
		this.capacity = capacity;
		this.plugsType = plugsType;
		this.idPlace = idPlace;
	}

	public Place() {

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
