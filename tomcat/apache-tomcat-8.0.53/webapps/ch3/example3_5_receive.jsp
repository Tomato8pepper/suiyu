<%@ page contentType="text/html;charset=gb2312"%>
<%! public String handleStr(String s){
       try{ byte[] bb=s.getBytes("iso-8859-1");
             s=new String(bb);
           }
        catch(Exception exp){}
        return s;
    }
%>
<HTML><body><font size=2 face="verdana" color="blue">
<%
   String onOrOff=request.getParameter("R");
   String secretMess=request.getParameter("secret");
   String itemName[]=request.getParameterValues("item");
    out.println("<p>�Ƿ�򿪱������֣�"+onOrOff);
    out.println("<p>��ϲ������ӣ�");
    if(itemName==null){
      out.println("һ������ϲ��");
    }
    else{
     for(int k=0;k<itemName.length;k++){
       out.println(" "+handleStr(itemName[k]));
     }
    } 
    out.println("<p>���ύ��������Ϣ��"+handleStr(secretMess));
    if(onOrOff.equals("on")){
        %>  <bgsound src='sound/back.mp3'loop="-1"/>
        <% }
%>
</font></body></HTLM>