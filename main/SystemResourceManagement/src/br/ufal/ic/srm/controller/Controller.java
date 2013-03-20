package br.ufal.ic.srm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ufal.ic.srm.util.HibernateUtility;

public abstract class Controller extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Session session;
	private Transaction transaction;

	public Controller() {
		session = HibernateUtility.getSession();
		transaction = session.beginTransaction();
	}

	public Session getSession() {
		return session;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected abstract void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException;
}
