package newlecture.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")

public class Add extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String n1_ = request.getParameter("n1");
		String n2_ = request.getParameter("n2");
		
		int n1 = 0;
		int n2 = 0;
		
		if(!n1_.equals("")) {
			n1 = Integer.parseInt(n1_);
		}
		if(!n2_.equals("")) {
			n2 = Integer.parseInt(n2_);
		}
		
		out.println("µ¡¼À °á°ú : <b>" + (n1+n2) + "</b>");
		
	}
	
}
