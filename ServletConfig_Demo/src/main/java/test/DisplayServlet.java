package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//@WebServlet("/display")
public class DisplayServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
		ServletConfig scf = super.getServletConfig();
		req.setAttribute("scf", scf);
	//	RequestDispatcher rs = req.getRequestDispatcher("\"Display.jsp\"");
	//	rs.forward(req, resp);
		req.getRequestDispatcher("Display.jsp").forward(req, resp);
		
	}

}
