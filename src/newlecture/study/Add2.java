package newlecture.study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")

public class Add2 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String[] num_ = request.getParameterValues("num");
		String op = request.getParameter("op");
		
		int result = 0;
		if(op.equals("더하기")) {
			for(int i = 0; i < num_.length; i++) {
				result += Integer.parseInt(num_[i]);
			}
		} else {
			result = 1;
			for(int i = 0; i < num_.length; i++) {
				result *= Integer.parseInt(num_[i]);
			}
		}
		
		out.println("계산 결과는 <br>" + result + "</br> 입니다");
	}
	
}
