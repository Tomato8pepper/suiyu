package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Zhuanfa extends HttpServlet{
       public void init(ServletConfig c)throws ServletException{
              super.init(c);
       }
       public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
              req.setCharacterEncoding("gb2312");
              String n=req.getParameter("n");
              RequestDispatcher dis=req.getRequestDispatcher("show.jsp");
              if(n!=null&&n.length()>=1)
                  dis.forward(req,res);
        }
       public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
              doPost(req,res);
       }
}