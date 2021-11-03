package newlecture.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")

public class NoticeReg extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		//req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		out.println("<b>���� : " + title + "</b><br>");
		out.println("<b>���� : " + content + "</b>");
		
	}
}