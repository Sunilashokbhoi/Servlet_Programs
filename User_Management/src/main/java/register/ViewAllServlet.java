package register;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/viewall")
public class ViewAllServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		RegistrationBean rb = new RegistrationBean();
		RegistrationBean  k = new ViewAllDAO().retrieveAll(rb);
	if(k==null) {
		
	}else {
		req.setAttribute("rbean", k);
		req.getRequestDispatcher("viewall.jsp").forward(req, resp);
	}
		
	}
	
}
