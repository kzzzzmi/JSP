package newlecture.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc2")
public class Calc2 extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String n1_ = request.getParameter("n1");
		String n2_ = request.getParameter("n2");
		String addSub = request.getParameter("add-sub");
		
		int n1 = Integer.parseInt(n1_);
		int n2 = Integer.parseInt(n2_);
		
		if(addSub.equals("µ¡¼À")) {
			out.println("<b>" + n1 + " + " + n2 + " = " + (n1+n2) + "</b>");
		} else {
			out.println("<b>" + n1 + " - " + n2 + " = " + (n1-n2) + "</b>");
		}
		
	}

}
