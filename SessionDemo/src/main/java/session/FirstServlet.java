package session;

import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/server1")
public class FirstServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req ,HttpServletResponse resp) {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String name = req.getParameter("uname");
			out.println("User Name "+name);
			out.println("User Name "+name);
			
			Cookie ck = new Cookie("username",name);
			resp.addCookie(ck);
			
			 out.print("<form action='servlet2'method='post'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");  
			
			out.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
