package myservlet.control;
import mybean.data.Tixing;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Area extends HttpServlet{
       public void init(ServletConfig c)throws ServletException{
              super.init(c);
       }
       public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
              doPost(req,res);
       }
       public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
              Tixing bean=new Tixing();
              HttpSession sess=req.getSession(true);
              sess.setAttribute("bean",bean);
              try{
                  double a=Double.parseDouble(req.getParameter("a"));
                  double b=Double.parseDouble(req.getParameter("b"));
                  double c=Double.parseDouble(req.getParameter("h"));
                  bean.setA(a);
                  bean.setB(b);
                  bean.setH(c);
                  double s=-1;
                  s=(a+b)*c/2.0;
                  bean.setArea(s);
                  bean.setMess("Ã›–Œ");
              }
              catch(Exception e){
                  bean.setArea(-1);
                  bean.setMess("«Î ‰»Î ˝◊÷:");
              }
              res.sendRedirect("input.jsp");
       }       
}