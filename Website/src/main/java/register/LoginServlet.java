package register;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/login")
public class LoginServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String un = req.getParameter("aname");
		String ps = req.getParameter("upass");
		AdminBean ab = new LoginDAO().checking(un,ps);
		PrintWriter pw = resp.getWriter();
		req.setAttribute("abean",ab);
		
		if(un==null&& ps==null) {
			req.setAttribute("adminb",ab);
			RequestDispatcher rd = req.getRequestDispatcher("logsuccess");
			rd.forward(req, resp);
		//	req.getRequestDispatcher("logsuccess").forward(req, resp);
		//	pw.println("Invalid Id PassWord ");
		}else {
			pw.println("Log In Successfully ...");
		}
		
		
	}
	
}
