package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.ModuleDescriptor.Requires;
import java.net.http.HttpResponse.ResponseInfo;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/logsuccess")
public class LogInSuccess extends GenericServlet{
	


	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter pr = resp.getWriter();
		AdminBean ab = (AdminBean)
	}}
