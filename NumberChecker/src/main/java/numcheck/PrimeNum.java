package numcheck;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/prime")
public class PrimeNum extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pr = resp.getWriter();
		String num = req.getParameter("num");
		int num1 = Integer.valueOf(num);
		int c = 0;
		for(int i=1;i<=num1;i++) {
			if(num1 % i ==0) {
				c++;
			}
		}
		if(c==2) {
			pr.println("Number Is Prime");
			
		}
		else {
			pr.println("Not Prime Number  !!");
		}
		
	}

}
