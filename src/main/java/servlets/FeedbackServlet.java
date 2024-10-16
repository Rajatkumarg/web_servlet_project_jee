package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//http://localhost:8080/web_servlet_project_jee/feedback.html
public class FeedbackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get feedback message from the request
	    String name = request.getParameter("name");  // Optional
	    String feedback = request.getParameter("feedback");

	    // Process the feedback (e.g., store in database, send email)
	    System.out.println("Received feedback from: " + name);
	    System.out.println("Feedback message: " + feedback);

	    // (Optional) Send a success response
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<h1>Thank you for your feedback!</h1>");
	}
	
}
