package br.ufal.ic;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session sessao = HibernateUtility.getSession();
		Transaction trans = sessao.beginTransaction();
		
		//Produto p = new Produto();
		//p.setName("Pão");
		//p.setValue(2.70);
		
		//sessao.saveOrUpdate(p);
        trans.commit();
        sessao.close();
		
	}

}
	