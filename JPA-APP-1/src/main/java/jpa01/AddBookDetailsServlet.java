package jpa01;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookDetailsServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException 
	{
		BookBean bb = new BookBean();//Bean Object
		bb.setCode(req.getParameter("bcode"));
		bb.setName(req.getParameter("bname"));
		bb.setAuthor(req.getParameter("bauthor"));
		bb.setPrice(Float.parseFloat(req.getParameter("bprice")));
		bb.setQty(Integer.parseInt(req.getParameter("bqty")));
		
		int k = new AddBookDetailsDAO().insert(bb);
		if(k>0) {
			req.setAttribute("msg","BookDetails Added Successfully...<br>");
			RequestDispatcher rd = 
					req.getRequestDispatcher("AddBookDetails.jsp");
			rd.forward(req, resp);
		}
	}
}
