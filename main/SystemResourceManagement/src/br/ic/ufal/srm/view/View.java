package br.ic.ufal.srm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import br.ufal.ic.srm.model.Model;

public abstract class View {
	protected Model model;
	protected PrintWriter output;

	public final void generate(Model model, HttpServletResponse response)
			throws IOException {
		this.model = model;
		this.output = response.getWriter();
		head();
		topMenu();
		content();
		footer();

	}

	public void head() {
		output.println("<!DOCTYPE html>");
		output.println("<html lang=\"en\">");
		output.println("<head>");
		output.println("<meta charset=\"utf-8\">");
		output.println("  <title>Login</title>");
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

	public abstract void topMenu();

	public abstract void content();

	public void footer() {
		output.println(" <!-- Load JS here for greater good =============================-->");
		output.println("  <script src=\"js/jquery-1.8.2.min.js\"></script>");
		output.println("  <script src=\"js/jquery-ui-1.10.0.custom.min.js\"></script>");
		output.println(" <script src=\"js/jquery.dropkick-1.0.0.js\"></script>");
		output.println(" <script src=\"js/custom_checkbox_and_radio.js\"></script>");
		output.println(" <script src=\"js/custom_radio.js\"></script>");
		output.println(" <script src=\"js/jquery.tagsinput.js\"></script>");
		output.println(" <script src=\"js/bootstrap-tooltip.js\"></script>");
		output.println(" <script src=\"js/jquery.placeholder.js\"></script>");
		output.println(" <script src=\"http://vjs.zencdn.net/c/video.js\"></script>");
		output.println(" <script src=\"js/application.js\"></script>");
		output.println(" <!--[if lt IE 8]>");
		output.println("    <script src=\"js/icon-font-ie7.js\"></script>");
		output.println("    <script src=\"js/icon-font-ie7-24.js\"></script>");
		output.println("    <![endif]-->");
		output.println("  </body>");
		output.println("</html>");
	}

}
