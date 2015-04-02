package com.gae_ng_java;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Gae_ng_javaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
