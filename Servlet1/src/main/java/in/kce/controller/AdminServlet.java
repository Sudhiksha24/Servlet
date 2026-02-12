package in.kce.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get data from Session
		/*HttpSession session=request.getSession();
		String user=(String) session.getAttribute("username");*/
		
			Cookie cookie[]=request.getCookies();
			String user=cookie[0].getValue().toString();
		
		//Generate Response
		PrintWriter out=response.getWriter();
		out.print("<html><body><h1>Welcome to Admin Page</h1>");
		out.print("<h1>"+user+"</h1></body></html>");
	}

}
