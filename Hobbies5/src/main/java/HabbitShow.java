import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/showing")
public class HabbitShow implements Servlet{
	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String Name = req.getParameter("name");
		String[] Hobbies = req.getParameterValues("hobbis");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text.html");
		
		pw.println("<h1>Hello"+Name+"Your Hobbies Are<h1><br>");
		for(String h : Hobbies) {	
		pw.println("<h3>"+h+"<h3><br>");
		}
		pw.println("<h3>Thanking You,<h3>");
		pw.println("<a href=\"https://www.w3schools.com\">Visit W3Schools.com!</a>");
		
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
		return "habbit run";
	}

	
	}

