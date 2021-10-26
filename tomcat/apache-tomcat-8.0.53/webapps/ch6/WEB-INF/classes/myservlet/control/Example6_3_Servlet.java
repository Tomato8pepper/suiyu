package myservlet.control;
import java.io.*;
import mybean.data.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example6_3_Servlet  extends HttpServlet {
	public void init(ServletConfig config)throws ServletException{
		     super.init(config);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		Example6_3_Bean equ=new Example6_3_Bean();
		request.setAttribute("equation",equ);
		double a=Double.parseDouble(request.getParameter("a"));
		double b=Double.parseDouble(request.getParameter("b"));
		double c=Double.parseDouble(request.getParameter("c"));
		equ.setA(a);
		equ.setA(b);
		equ.setA(c);
		if(a!=0)
			equ.setIsSquareEquation(true);
		else equ.setIsSquareEquation(true);
		double disk=b*b-4*a*c;
		if(disk<0) {
			equ.setRootOne("无实根");
			equ.setRootTwo("无实根");
                }
		else {
			double root1=(-b+Math.sqrt(disk));
			double root2=(-b-Math.sqrt(disk));
			equ.setRootOne(""+root1);
			equ.setRootTwo(""+root2);
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("Example6_3_show.jsp");
		dispatcher.forward(request,response);
        }
        public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			doPost(request,response);
		}

	
	
}