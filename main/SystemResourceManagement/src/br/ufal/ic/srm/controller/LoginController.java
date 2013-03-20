package br.ufal.ic.srm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ufal.ic.srm.model.User;
import br.ufal.ic.srm.view.LoginView;
import br.ufal.ic.srm.view.View;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginController extends Controller {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {

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

		if (user.validate()) {

			HttpSession session = request.getSession();

			session.setAttribute("user", user);
			response.sendRedirect("http://localhost:8080/SystemResourceManagement/home");

		}

		new LoginView().generate(user, response);

	}

}
