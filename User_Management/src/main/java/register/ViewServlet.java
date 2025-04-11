package register;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/view")
public class ViewServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("uemail");
		RegistrationBean rb = new ViewDAO().retrieve(email);
		if(rb == null) {
			req.setAttribute("msg","Invalid User Email ..");
			req.getRequestDispatcher("invalid.jsp").forward(req, resp);
		}else {
			req.setAttribute("msg",rb);
			req.getRequestDispatcher("view.jsp").forward(req, resp);
			
			//RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
			//rd.forward(req, resp);
		}
	}
	
}
