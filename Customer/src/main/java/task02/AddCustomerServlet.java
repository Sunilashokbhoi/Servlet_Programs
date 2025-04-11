package task02;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/add")
public class AddCustomerServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException  {
		CustomerBean cb = new CustomerBean();
		cb.setId(req.getParameter("cid"));
		cb.setName(req.getParameter("cname"));
		cb.setCity(req.getParameter("ccity"));
		cb.setMid(req.getParameter("cmid"));
		cb.setPhno(Long.parseLong(req.getParameter("cphno")));
		
		int k = new AddCustomerDAO().insert(cb);
		if(k>0) {
			req.setAttribute("msg","Customer Data Added Successfully ...");
			RequestDispatcher rd = req.getRequestDispatcher("AddCustomer.jsp");
			rd.forward(req, resp);
		}
		
	}

	
}
