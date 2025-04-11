package register;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/register")
public class AdminServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req ,ServletResponse resp)throws ServletException,IOException {
		PrintWriter pr = resp.getWriter();
		AdminBean ab = new AdminBean();
		ab.setFname(req.getParameter("fname"));
		ab.setEmail(req.getParameter("email"));
		ab.setPhno(Long.parseLong(req.getParameter("phno")));
		ab.setPass(req.getParameter("password"));
		ab.setCpass(req.getParameter("cpassword"));
		
		int k = new RegisterDAO().insert(ab);
		
		if(k>0) {
			pr.println("Registration Successfully ...");
			pr.println("<form action ='admin'method ='post'>");
			pr.println("<a href='adminlog.html'>Log In</a>");
			pr.println("</form>");
			
			req.getRequestDispatcher("Registration Successful ...");
		}else {
			pr.println("Registration Fail ...");
			
		}
	}

}
