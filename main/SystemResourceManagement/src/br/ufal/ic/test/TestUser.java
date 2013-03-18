package br.ufal.ic.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.srm.model.Activity;
import br.ufal.ic.srm.model.User;
import br.ufal.ic.srm.util.HibernateUtility;

public class TestUser {
	private Session session;
	private Transaction transaction;

	@Before
	public void setUp() throws Exception {

		session = HibernateUtility.getSession();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		session.close();
	}

	@Test
	public void createUserTest() {
		User user = new User();

		user.setName("Thiago");
		user.setEmail("eu@eu.com");
		user.setNumber("8809-2604");
		user.setPassword("complicada007");
		user.setLogin("casa");

		session.save(user);
		transaction.commit();

		User r = (User) session.get(User.class, new Integer(1));
		assertEquals(user, r);

	}

	@Test
	public void createActivityTest() {
		Activity activity = new Activity();

		activity.setDescription("uhu");
		activity.setNumberMembers(5);
		activity.setSupportItens("1");
		activity.setTitle("teste");

		User user = (User) session.get(User.class,  new Integer(1));
		activity.setUser(user);

		session.save(activity);
		transaction.commit();

		Activity r = (Activity) session.get(Activity.class, new Integer(1));
		assertEquals(activity, r);

	}

	@Test
	public void createjTest() {
		Activity activity = new Activity();

		activity.setDescription("uhu");
		activity.setNumberMembers(5);
		activity.setSupportItens("1");
		activity.setTitle("teste");

		//User user = (User) session.get(User.class, "Thiago");
		
		List<User> listUser = this.session.createCriteria(User.class).list();
		System.out.println("--------------------------------o--------------------------------");
		System.out.println(listUser.size());
	
		for (User p: listUser) {
			System.out.println(p.getEmail());
			activity.setUser(p);
		}
		

		session.save(activity);
		transaction.commit();

		Activity r = (Activity) session.get(Activity.class, new Integer(2));
		assertEquals(activity, r);

	}

}