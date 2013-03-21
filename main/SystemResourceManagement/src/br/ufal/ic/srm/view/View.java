package br.ufal.ic.srm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ufal.ic.srm.model.Model;
import br.ufal.ic.srm.model.User;

public abstract class View {
	protected Model model;
	protected PrintWriter output;
	protected HttpSession session;
	protected String title = "System Resource Management";

	public final void generate(Model model, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		this.model = model;
		this.output = response.getWriter();
		this.session = request.getSession();

		head();
		topMenu();
		leftMenu();
		content();
		footer();
		end();

	}

	protected void head() {
		output.println("<!DOCTYPE html>");
		output.println("<html lang=\"en\">");
		output.println("<head>");
		output.println("<meta charset=\"utf-8\">");
		output.println("  <title>" + title + "</title>");
		output.println("<base href=\"http://localhost:8080/SystemResourceManagement/\"  />");
		output.println("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");

		output.println(" <!-- Loading Bootstrap -->");
		output.println(" <link href=\"css/bootstrap.css\" rel=\"stylesheet\">");

		output.println(" <!-- Loading Flat UI -->");
		output.println("  <link href=\"css/flat-ui.css\" rel=\"stylesheet\">");
		output.println(" <link rel=\"shortcut icon\" href=\"images/favicon.ico\">");

		output.println(" <!-- Loading Reset -->");
		output.println(" <link href=\"css/reset.css\" rel=\"stylesheet\">");

		output.println(" <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->");
		output.println("  <!--[if lt IE 9]>");
		output.println("    <script src=\"js/html5shiv.js\"></script>");
		output.println("  <![endif]-->");
		output.println(" </head>");
		output.println(" <body>");
	}

	protected void topMenu() {

		output.println("<div class=\"navbar navbar-inverse navbar-fixed-top\">");
		output.println("<div class=\"navbar-inner\">");
		output.println("<div class=\"container\">");
		output.println("<button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">");
		output.println("<span class=\"icon-bar\"></span>");
		output.println("<span class=\"icon-bar\"></span>");
		output.println("<span class=\"icon-bar\"></span>");
		output.println("</button>");
		output.println("<a class=\"brand\" href=\"home\">System Resource Management</a>");
		output.println("<div class=\"nav-collapse collapse\">");
		output.println("<ul class=\"nav pull-right\">");
		output.println("<li>");
		output.println("<a href=\"#\">");

		User user = (User) session.getAttribute("user");
		if (user != null) {
			output.println(user.getName());
		}

		output.println("<span class=\"navbar-unread\">10</span>");
		output.println("</a>");
		output.println("<ul>");
		output.println("<li><a href=\"user/editar\">Editar</a></li>");
		output.println("<li><a href=\"logout/\">Logout</a></li>");
		output.println("</ul> <!-- /Sub menu -->");
		output.println("</li>");
		output.println("</ul>");
		output.println("</div><!--/.nav-collapse -->");
		output.println("</div>");
		output.println("</div>");
		output.println("</div>");
	}

	protected void leftMenu() {
		output.println("<div class=\"container-fluid\">");
		output.println("<div class=\"row-fluid\">");
		output.println("<div class=\"span3\">");
		output.println("<div class=\"well sidebar-nav\">");
		output.println("<ul class=\"nav nav-list\">");
		output.println("<li class=\"nav-header\">Sidebar</li>");
		output.println("<li class=\"active\"><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li class=\"nav-header\">Sidebar</li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li class=\"nav-header\">Sidebar</li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("<li><a href=\"#\">Link</a></li>");
		output.println("</ul>");
		output.println("</div><!--/.well -->");
		output.println("</div><!--/span-->");
		output.println("<div class=\"span9\">");
	}

	protected abstract void content();

	protected void footer() {
		output.println("  </div><!--/span-->");
		output.println(" </div><!--/row-->");

		output.println("  <hr>");

		output.println("  <footer>");
		output.println("    <p>&copy; Company 2013</p>");
		output.println("  </footer>");

	}

	protected void end() {
		output.println("</div><!--/.fluid-container-->");
		output.println(" <!-- Load JS here for greater good =============================-->");
		output.println("<script src=\"http://www.thiagoemmanuel.com/js/jquery-1.8.2.min.js\"></script>");
		output.println("<script src=\"http://www.thiagoemmanuel.com/js/jquery-ui-1.10.0.custom.min.js\"></script>");
		output.println("<script src=\"js/jquery.dropkick-1.0.0.js\"></script>");
		output.println("<script src=\"js/custom_checkbox_and_radio.js\"></script>");
		output.println("<script src=\"js/custom_radio.js\"></script>");
		output.println("<script src=\"http://www.thiagoemmanuel.com/js/jquery.tagsinput.js\"></script>");
		output.println("<script src=\"js/bootstrap-tooltip.js\"></script>");
		output.println("<script src=\"js/jquery.placeholder.js\"></script>");
		output.println("<script src=\"http://vjs.zencdn.net/c/video.js\"></script>");
		output.println("<script src=\"js/application.js\"></script>");
		output.println("<!--[if lt IE 8]>");
		output.println("<script src=\"js/icon-font-ie7.js\"></script>");
		output.println("<script src=\"js/icon-font-ie7-24.js\"></script>");
		output.println("<![endif]-->");
		output.println("</body>"); 
		output.println("</html>");
	}
}
