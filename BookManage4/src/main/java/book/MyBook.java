package book;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/bookshow")
public class MyBook implements Servlet{

	@Override
	public void init(ServletConfig scf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
			String BookCode = req.getParameter("bcode");
			String BookName = req.getParameter("bname");
			String BookAuthor = req.getParameter("bauthor");
			float BookPrice = Float.parseFloat(req.getParameter("bprice"));
			int BookQty = Integer.parseInt(req.getParameter("bqty"));
			
			PrintWriter pw = resp.getWriter();
			resp.setContentType("text/html");
			
			pw.println("Book Code :"+BookCode+"<br>");
			pw.println("Book Name :"+BookName+"<br>");
			pw.println("Book Author :"+BookAuthor+"<br>");
			pw.println("Book Price :"+BookPrice+"<br>");
			pw.println("Book QTY :"+BookQty+"<br>");
			
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
