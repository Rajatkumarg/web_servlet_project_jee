package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String pwd = req.getParameter("password");
		
		//using cookie
		String userRole = req.getParameter("userRole");
		if(userRole!=null && userRole.equals("admin")) {
			String userId = "12345";
			Cookie cookie = new Cookie("userId", userId);
			cookie.setMaxAge(60*60*24*7);
			resp.addCookie(cookie);
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("username", username);
		resp.sendRedirect("welcome.jsp");
	}

}
