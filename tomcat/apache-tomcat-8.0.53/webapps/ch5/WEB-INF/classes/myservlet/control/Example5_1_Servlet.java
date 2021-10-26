package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_1_Servlet extends HttpServlet{
      public void init(ServletConfig config) throws ServletException{
          super.init(config);
      }
      public void service(HttpServletRequest reqest,HttpServletResponse response)throws IOException{
          reqest.setCharacterEncoding("gb2312");
          String str=reqest.getParameter("moon");
          response.setContentType("text/html;charset=gb2312");
          PrintWriter out=response.getWriter();
          String sevletName=getServletName();
          out.println("<html><body bgcolor=#EEDDFF>");
          out.println("<b>请求的servlet的名字是"+sevletName+"<br></b>");
          out.println("<b>servlet在web设计中非常重要<br></b>");
          if(str!=null && str.length()>=1)
              out.println("<br><h2>"+str+"<h2>");
          out.println("</body></html>");
       }
}