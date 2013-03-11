package br.ufal.ic.test;

import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.srm.model.User;
import br.ufal.ic.srm.util.HibernateUtility;

public class TestUser {
	private Session sessao;
	private Transaction transaction;

	@Before
	public void setUp() throws Exception {

		sessao = HibernateUtility.getSession();
		transaction = sessao.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		sessao.close();
	}

	@Test
	public void createUserTest() {
		User user = new User();

		user.setName("Thiago");
		user.setEmail("eu@eu.com");
		user.setNumber("8809-2604");
		user.setPassword("complicada007");

		sessao.save(user);
		transaction.commit();

		User r = (User) sessao.get(User.class, new Integer(1));
		assertEquals(user, r);

	}

}