package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class English extends HttpServlet{
       public void init(ServletConfig c)throws ServletException{
              super.init(c);
       }
       public void service(HttpServletRequest req,HttpServletResponse res)throws IOException{
              req.setCharacterEncoding("gb2312");
              res.setContentType("text/html;charset=gb2312");
              PrintWriter o=res.getWriter();
              o.println("<html><body bgcolor=yellow>");
              String n=req.getParameter("eng");
              if(n==null||n.length()==0)
                   return;
              String []word=n.split("[^a-zA-Z]+");
              int m=0;
              try{
                  for(int i=0;i<word.length;i++){
                      if(word[i].length()>=1){
                          m++;
                          o.print("<br>"+word[i]);
                       }
                   }
              }
              catch(NumberFormatException e){
                    o.print(""+e);
              }
              o.print("<h2>句子中单词数目:"+m);
              o.println("</body></html>");
        }
}