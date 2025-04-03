package ser.task04;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.SubmissionPublisher;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.*;
@WebServlet("/save")
public class Reg1 implements Servlet{

	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String EmpName = req.getParameter("ename");
		String EmpId = req.getParameter("eid");
		String EmpFName = req.getParameter("efname");
		
		ServletContext context = getServletContext();
		context.setAttribute("ename",EmpName);
		context.setAttribute("eid", EmpId);
		context.setAttribute("efname", EmpFName);
				
	}
	private ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
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
