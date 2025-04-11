package task05;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/view")
public class StudentViewServer extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String Sid = req.getParameter("sid");
		StudentBean sb = new StudentViewDAO().retrieve(Sid);

		if (sb == null) {
			req.setAttribute("msq", "Invalid Student ID");
			req.getRequestDispatcher("Msg.jsp").forward(req, resp);
		} else {
			req.setAttribute("sbean", sb);
			req.getRequestDispatcher("viewstudent.jsp").forward(req, resp);
		}

	}

}
