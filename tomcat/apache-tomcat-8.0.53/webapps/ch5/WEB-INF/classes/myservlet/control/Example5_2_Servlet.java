package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Example5_2_Servlet extends HttpServlet{
      public void init(ServletConfig config) throws ServletException{
          super.init(config);
      }
      public void service(HttpServletRequest request,HttpServletResponse response)throws IOException{
          request.setCharacterEncoding("gb2312");
          response.setContentType("text/html;charset=gb2312");
          PrintWriter out=response.getWriter();
          out.println("<html><body bgcolor=blue>");
          String str=request.getParameter("billMess");
          if(str==null||str.length()==0)
              return;
          String []price=str.split("[^0123456789.]+");
          double sum=0;
          try{
              for(int i=0;i<price.length;i++){
                 if(price[i].length()>=1)
                     sum+=Double.parseDouble(price[i]);
               }
           }
           catch(NumberFormatException e){
             out.print(""+e);
           }
           out.print("\""+str+"\"<br>的消费额："+sum+"元");
           out.println("</body></html>");
       }
}