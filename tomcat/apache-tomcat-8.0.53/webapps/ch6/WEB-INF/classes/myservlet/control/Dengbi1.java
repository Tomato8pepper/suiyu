package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mybean.data.Dengbi;
public class Dengbi1 extends HttpServlet{
	public void init(ServletConfig config) throws ServletException{
        super.init(config);
    }
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        Dengbi dengbi=new Dengbi(); //创建对象
        request.setAttribute("dengbi",dengbi);
        //将seriesData存到request中
        double a=Double.parseDouble(request.getParameter("firstItem"));
        double d=Double.parseDouble(request.getParameter("var"));
        int n=Integer.parseInt(request.getParameter("number"));
        dengbi.setFirstItem(a);
        dengbi.setVar(d);
        dengbi.setNumber(n);
        double sum=0,item=a; 
        int i=1;
        while(i<=n){
          sum=sum+item;
          i++;
          item=item*d;
        }
        dengbi.setSum(sum);
        RequestDispatcher rd=request.getRequestDispatcher("dengbishow.jsp");
		rd.forward(request,response);
  } 
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		doPost(request, response);
	}
}
