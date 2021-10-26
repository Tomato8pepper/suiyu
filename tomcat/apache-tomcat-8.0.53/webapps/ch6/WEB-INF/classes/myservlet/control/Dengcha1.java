package myservlet.control;
import mybean.data.Dengcha;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Dengcha1 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dengcha dengcha = new Dengcha(); // 创建对象
		request.setAttribute("dengcha", dengcha);
		// 将seriesData存到request中
		double a = Double.parseDouble(request.getParameter("firstItem"));
		double d = Double.parseDouble(request.getParameter("var"));
		int n = Integer.parseInt(request.getParameter("number"));
		dengcha.setFirstItem(a);
		dengcha.setVar(d);
		dengcha.setNumber(n);
		double sum = 0, item = a;
		int i = 1;
		while (i <= n) {
			sum = sum + item;
			i++;
			item = item + d;
		}
		dengcha.setSum(sum);
		RequestDispatcher rd=request.getRequestDispatcher("dengchashow.jsp");
		rd.forward(request,response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}