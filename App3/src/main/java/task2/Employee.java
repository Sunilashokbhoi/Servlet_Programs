package task2;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/showdata")
public class Employee implements Servlet{
	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
	String Ename = req.getParameter("ename");
	int Age = Integer.parseInt(req.getParameter("age"));
	float Salary = Float.parseFloat(req.getParameter("salary"));
	String EId = req.getParameter("mail");
	String Gender = req.getParameter("gen");
	String State = req.getParameter("states");
   
	String[] Hobbies = req.getParameterValues("hobbies");
   
	 PrintWriter pw = resp.getWriter();
	 resp.setContentType("text.html");
	 
	 pw.println("Employee Name:"+Ename+"<br>");
	 pw.println("Employee Age:"+Age+"<br>");
	 pw.println("Employee Salary:"+Salary+"<br>");
	 pw.println("Employee MailId:"+EId+"<br>");
	 pw.println("Employee Gender:"+Gender+"<br>");
	 pw.println("Employee States:"+State+"<br>");
	 pw.println("Employee Hobbies:"+Arrays.toString(Hobbies));
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Showing Employee Details";
	}


	
}
