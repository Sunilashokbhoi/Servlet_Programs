package register;

import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

import jakarta.servlet.*;
@WebServlet("/register")
public class RegisterServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException ,IOException {
		RegistrationBean rb = new RegistrationBean();
		rb.setName(req.getParameter("uname"));
		rb.setEmail(req.getParameter("uemail"));
		rb.setPassword(req.getParameter("upass"));
		rb.setPhno(Long.parseLong(req.getParameter("uphno")));
		
		int k = new RegisterDAO().insert(rb);
		if(k>0) {
			req.setAttribute("msg","Registration Successfully ...");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg", "Registration Fail ...");
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
				
		
	}

	

	
	
}
