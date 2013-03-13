package br.ufal.ic.srm.model;

import java.util.List;

public class Multimedia implements Model{

	private int idMultimedia;
	private String model;
	private int voltage;
	private String plugsType;
	private String mediaType;

	public Multimedia(int idMultimedia, String model, int voltage,
			String plugsType, String mediaType) {
		this.idMultimedia = idMultimedia;
		this.model = model;
		this.voltage = voltage;
		this.plugsType = plugsType;
		this.mediaType = mediaType;
	}

	public Multimedia() {

	}

	public int getIdMultimedia() {
		return idMultimedia;
	}

	public void setIdMultimedia(int idMultimedia) {
		this.idMultimedia = idMultimedia;
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
