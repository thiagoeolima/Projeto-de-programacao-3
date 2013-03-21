package br.ufal.ic.srm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufal.ic.srm.view.HomeView;
import br.ufal.ic.srm.view.LoginView;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class HomeController extends Controller {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HomeController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		isLogin(request, response);

		new HomeView().generate(null, request, response);

	}

}
