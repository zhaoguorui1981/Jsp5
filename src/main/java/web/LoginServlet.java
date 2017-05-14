package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(
			HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		System.out.println("´ò×®1");
		String user=req.getParameter("user");
		HttpSession session=req.getSession();
		session.setAttribute("user", user);
		System.out.println("´ò×®");
		res.sendRedirect("index");
	}
	
}
