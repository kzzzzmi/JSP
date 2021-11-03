package newlecture.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go")

public class Nana extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String temp = req.getParameter("cnt");
		int cnt = 0;
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);
		}
		
		for(int i = 0; i < cnt; i++) {
			out.println((i+1) + ": �ȳ�, Servlet !!<br />");
		}
	}
}