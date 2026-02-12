package in.kce.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get data from Session
		HttpSession session=request.getSession();
		String user=(String) session.getAttribute("username");
		
		//Generate Response
		PrintWriter out=response.getWriter();
		out.print("<html><body><h1>Welcome to User Page</h1>");
		out.print("<h1>"+user+"</h1></body></html>");
	}

}