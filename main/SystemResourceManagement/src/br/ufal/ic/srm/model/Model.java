package br.ufal.ic.srm.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufal.ic.srm.util.HibernateUtility;

public abstract class Model {

	public abstract boolean validate();

	public abstract List errors();

}
