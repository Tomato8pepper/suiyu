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
<%       String n=request.getParameter("n");
         byte bb[]=n.getBytes("iso-8859-1");
         n=new String(bb);                  
         if(n.length()==0 || n.length()>10){
%>          <jsp:forward page="inputName.jsp"/>
<%       }
         judge();	
         addPerson(n);      
%>
     <center><br>Ŀǰ����<%=count%>���������ҳ�棬���ǵ������ǣ�</center>
     <center><br><%=personList %></center>
</font></BODY></HTML>	  
   