package newlecture.study;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc3")
public class Calc3 extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		
		String value = request.getParameter("value");
		String operator = request.getParameter("operator");
		String dot = request.getParameter("dot");
		
		String expression = "";
		
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("exp")) {
					expression = c.getValue();
					break;
				}
					
			}
		}		
		
		if(operator != null && operator.equals("=")) {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
			try {
				expression = engine.eval(expression) + "";
			} catch (ScriptException e) {
				e.printStackTrace();
			}
		} else if(operator != null && operator.equals("C")){
			expression = "C";
		} else {
			expression += (value == null) ? "" : value;
			expression += (operator == null) ? "" : operator;
			expression += (dot == null) ? "" : dot;
		}
		
		Cookie c = new Cookie("exp", expression);
		if(expression.equals("C")) {
			c.setMaxAge(0);
		}
		response.addCookie(c);
		response.sendRedirect("/calcPage");
	}

}
