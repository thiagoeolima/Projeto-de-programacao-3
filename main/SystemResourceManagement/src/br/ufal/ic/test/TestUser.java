package br.ufal.ic.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.srm.model.Activity;
import br.ufal.ic.srm.model.Multimedia;
import br.ufal.ic.srm.model.Resource;
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
		
		List<Resource> list = new ArrayList<Resource>();
		
		user.setResourcesList(list);

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

		session.save(activity);
		transaction.commit();

		Activity a = (Activity) session.get(Activity.class, new Integer(1));
		assertEquals(activity, a);

	}

	@Test
	public void createMultimedia() {
		Multimedia multimedia = new Multimedia();

		multimedia.setMediaType("Retroprojetor");
		multimedia.setModel("CCE - 1234");
		multimedia.setPlugsType("NTI");
		multimedia.setVoltage(220);

		session.save(multimedia);
		transaction.commit();

		Multimedia m = (Multimedia) session.get(Multimedia.class,
				new Integer(1));
		assertEquals(multimedia, m);

	}

	@Test
	public void createResource() {
		Resource resource = new Resource();

		resource.setIniDate(new Date());
		resource.setEndDate(new Date());
		resource.setStatus(true);

		session.save(resource);
		transaction.commit();

		Resource r = (Resource) session.get(Resource.class, new Integer(1));
		assertEquals(resource, r);
	}

}