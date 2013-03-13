package br.ic.ufal.srm.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import br.ufal.ic.srm.model.Model;

public abstract class View {
	protected Model model;
	protected PrintWriter output;

	final void generate(Model model, HttpServletResponse response)
			throws IOException {
		this.model = model;
		this.output = response.getWriter();
		head();
		topMenu();
		content();
		footer();

	}

	public abstract void head();

	public abstract void topMenu();

	public abstract void content();

	public abstract void footer();

}
