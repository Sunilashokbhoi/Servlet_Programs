package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServelet implements Servlet {
	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String uName = req.getParameter("uname");
		String Mid = req.getParameter("mid");
		long phNo = Long.parseLong(req.getParameter("phno"));
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("****User Details ****<br>");
		pw.println("UserName: "+uName+"<br>");
		pw.println("MailId :"+Mid+"<br>");
		pw.println("PhoneNo :"+phNo+"<br>");
		
		
	}
	public void destroy() {
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.getServletConfig();
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet display User details...";
	}

	
}
