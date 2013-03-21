package br.ufal.ic.srm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public Controller() {

	}
	
	public static void isLogin(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		if (session.getAttribute("user") == null) {		
			try {
				response.sendRedirect("http://localhost:8080/SystemResourceManagement/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected abstract void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException, IOException;
}
