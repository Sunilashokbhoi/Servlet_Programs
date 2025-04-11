package numcheck;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/factor")
public class Factorial extends GenericServlet{

	private static final long[] Factorial = null;
   
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/http");
		String num1 = req.getParameter("num");
		int fact = Integer.valueOf(num1);
		
		 PrintWriter pr = resp.getWriter();
		for(int i=1;i<fact;i++) {
			if(fact % i ==0) {
				int arr[] = i;
			}
				pr.println("Number is"+i);
		}
			//pr.println("Number is"+i);
		System.out.println();
	}

}
