package numcheck;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/cal")
public class CheckingNum extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		
		String num = req.getParameter("num");
		
		if("prime".equalsIgnoreCase(req.getParameter("choice"))) {
			req.getRequestDispatcher("prime").forward(req, resp);
			
		}else if("factor".equalsIgnoreCase(req.getParameter("choice"))) {
			req.getRequestDispatcher("factor").forward(req, resp);
			
		}else if("factorial".equalsIgnoreCase(req.getParameter("choice"))) {
			req.getRequestDispatcher("factorial").forward(req, resp);
			
		}else if("square".equalsIgnoreCase(req.getParameter("choice"))) {
			req.getRequestDispatcher("square").forward(req, resp);
		}else {
			
		}
		
	}
}
