package br.ufal.ic.srm.view;

public class LoginView extends View {

	public LoginView() {
		super();
	}

	@Override
	public void topMenu() {
		
	}

	@Override
	public void content() {

		output.println("<div class=\"login-screen\">");
		output.println("<div class=\"login-icon\">");
		output.println("<img src=\"http://www.ufal.edu.br/unidadeacademica/ic/configuracao/ic.png\" alt=\"Welcome to Resource Manager\">");
		output.println("<h4>Welcome to <small>Resource Manager App</small></h4>");
		output.println("</div>");
		output.println("<form class=\"login-form\" action=\"\" method=\"post\">");
		output.println("<div class=\"control-group\">");
		output.println("<input name=\"login\" class=\"login-field\" value=\"\" placeholder=\"Enter your name\" id=\"login-name\" type=\"text\">");
		output.println("<label class=\"login-field-icon fui-man-16\" for=\"login-name\"></label>");
		output.println("</div>");
		output.println("<div class=\"control-group\">");
		output.println("<input name=\"password\" class=\"login-field\" value=\"\" placeholder=\"Password\" id=\"login-pass\" type=\"password\">");
		output.println("<label class=\"login-field-icon fui-lock-16\" for=\"login-pass\"></label>");
		output.println("</div>");
		output.println("<button class=\"btn btn-primary btn-large btn-block\" type=\"submit\">Sign in</button>");
		output.println("<a class=\"login-link\" href=\"#\">Lost your password?</a>");
		output.println("</form>");
		output.println("</div>");
	}

}