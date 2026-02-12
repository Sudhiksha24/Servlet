package in.kce.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//reading form inputs
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		
		//generate dynamic response
		response.setContentType("text/html");
		//HttpSession session=request.getSession();
		//session.setAttribute("username",user);
		
		Cookie cookie=new Cookie("username", user);
		response.addCookie(cookie);
		if(user.equals("Admin")) {
			RequestDispatcher rd=request.getRequestDispatcher("AdminServlet");
			rd.forward(request, response);
		
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("UserServlet");
			rd.forward(request, response);			
		}
	
	}

}