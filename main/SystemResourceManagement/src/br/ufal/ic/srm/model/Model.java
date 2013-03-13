package br.ufal.ic.srm.model;

import java.util.List;

public interface Model {

	public boolean validate();
	
	public List errors();
	
}
