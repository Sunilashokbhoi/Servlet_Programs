package session;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondSession extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse resp) {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			Cookie ck[] =  req.getCookies();
			out.println("Hello "+ck[0].getValue());
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
