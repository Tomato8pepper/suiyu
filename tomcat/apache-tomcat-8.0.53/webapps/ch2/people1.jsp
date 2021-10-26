<%@page contentType="text/html;charset=gb2312"%>
<HTML>
<BODY bgcolor=cyan><font size=3 color=red>
<%!  int count;
     StringBuffer personList;
     public void judge(){
        if(count==0)
           personList=new StringBuffer();
     }
     public void addPerson(String p){
           if(count==0)
               personList.append(p);
           else
               personList.append(","+p);
           count++;
     }
%>
               
<%       request.setCharacterEncoding("iso-8859-1"); 
         String n=request.getParameter("n");      
         if(n.length()==0 || n.length()>10){
%>          <jsp:forward page="inputName.jsp"/>
<%       }
         judge();
         n=new String(n.getBytes("iso-8859-1"));
         addPerson(n);
%>
     <center><br>目前共有<%=count%>个人浏览了页面，他们的名字是：</center>
     <center><br><%=personList %></center>
</font></BODY></HTML>	  
   