package br.ufal.ic.srm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ic.ufal.srm.view.View;
import br.ic.ufal.srm.view.login.LoginView;
import br.ufal.ic.srm.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends Controller {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @throws IOException
	 * @throws ServletException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = req.getSession();

		System.out.println(session.getAttribute("user"));

		new LoginView().generate(null, response);
	

	}

	/**
	 * @see HttpSHttpServletRequestervlet#doPost(HttpServletRequest request,
	 *      HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		User user = new User();

		user.setLogin(request.getParameter("login"));
		user.setPassword(request.getParameter("password"));

		HttpSession session = request.getSession();

		session.setAttribute("user", user);

		if (user.validate()) {
			// redirecionamento para perfil
			// salvar o user em session;

		}

		user.errors();

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("jsp/login.jsp");
		dispatcher.forward(request, response);

	}

}
