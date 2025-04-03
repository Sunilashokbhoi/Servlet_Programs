package ser.task04;
import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
public class Reg2 implements Servlet{

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

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String EmpLName = req.getParameter("elname");
		String EmpMail = req.getParameter("emid");
		String EmpPhno = req.getParameter("ephno");
	
		
		
	}
	
}
