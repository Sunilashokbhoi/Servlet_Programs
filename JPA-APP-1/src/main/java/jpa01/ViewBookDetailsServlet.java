package jpa01;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewBookDetailsServlet extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException, IOException {
		String bcode = req.getParameter("bcode");
		BookBean bb = new ViewBookDetailsDAO().retrieve(bcode);
		if(bb==null) {
			req.setAttribute("msg","Invalid BookCode ...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, resp);	
		}else {
			req.setAttribute("bbean",bb);
			req.getRequestDispatcher("ViewBookDetails.jsp").forward(req, resp);
			
		}
	}
}
