package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet called!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg= req.getParameter("message");
		System.out.println("doPost called! "+msg);
		//sending response to browser
		Date d = new Date();
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>Form submitted</h1>");
		pw.print("<h2>Message is %s and date is %s</h2>".formatted(msg,d));
	}
}
