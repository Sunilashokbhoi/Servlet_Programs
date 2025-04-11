package task02;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/view")
public class RetrieveCustomerServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String cid = req.getParameter("cid");
		CustomerBean cb = new RetrieveCustomerDAO().retrieve(cid);
		
		if(cb==null) {
			
		}else {
			req.setAttribute("cbean", cb);
			req.getRequestDispatcher("viewcust.jsp").
			forward(req, resp);
		}
		
	}
	
}
