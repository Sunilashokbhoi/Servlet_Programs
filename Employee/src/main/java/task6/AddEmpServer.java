package task6;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/add")
public class AddEmpServer extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		EmployeeBean eb = new EmployeeBean();
		eb.setId(req.getParameter("eid"));
		eb.setName(req.getParameter("ename"));
		eb.setSalary(Float.parseFloat(req.getParameter("esalary")));
		
		int k = new AddEmpDAO().insert(eb);
		if(k>0) {
			req.setAttribute("msg","Employee Added Successfully ..");
			//RequestDispatcher rd = req.getRequestDispatcher("addemp.jsp");
			//rd.forward(req, resp);
			req.getRequestDispatcher("addemp.jsp").forward(req, resp);
		}
		
	}

}
