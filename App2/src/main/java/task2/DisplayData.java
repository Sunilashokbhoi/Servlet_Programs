package task2;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/getinfo")
public class DisplayData implements Servlet{
	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String eMail = req.getParameter("email");
		long Mno = Long.parseLong(req.getParameter("mno"));
		String Address = req.getParameter("address");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("**** User Details ****<br>");
		pw.println(fName+"<br>");
		pw.println(lName+"<br>");
		pw.println(eMail+"<br>");
		pw.println(Mno+"<br>");
		pw.println(Address+"<br>");

		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
