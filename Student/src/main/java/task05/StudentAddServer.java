package task05;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet("/add")
public class StudentAddServer extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		StudentBean sb = new StudentBean();
		sb.setId(req.getParameter("sid"));
		sb.setName(req.getParameter("sname"));
		sb.setCourse(req.getParameter("scourse"));
		
		int k = new StudentAddDAO().insert(sb);
		if(k>0) {
			req.setAttribute("msg","Student Added Successflly...");
			//RequestDispatcher rd = req.getRequestDispatcher("addstudent.jsp");
			//rd.forward(req, resp);
			req.getRequestDispatcher("addstudent.jsp").forward(req, resp);
		}
	}

}
