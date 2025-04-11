package emp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")
public class EmpServlet implements Servlet {

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
		return "Employee Class";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(Integer.parseInt(req.getParameter("eid")));
		eb.setName(req.getParameter("ename"));
		eb.setEmail(req.getParameter("email"));
		eb.setDept(req.getParameter("dp"));
		eb.setSalary(Double.parseDouble(req.getParameter("esalary")));
		
		int k = new EmpDao().insert(eb);
		if(k>0) {
			req.setAttribute("msg","Employee Registration Successfully ...");
			RequestDispatcher rd = req.getRequestDispatcher("reg.jsp");
			rd.forward(req, resp);
		}
	}

}
