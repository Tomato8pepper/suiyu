<%@ page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=blue><font size=3 color=green >
 <p>������ѧϰresponse�����
 <br>setContentType����
 <p>����ǰҳ�汣��Ϊword�ĵ���
  <form action="" method="get" name=form>
    <input type="submit" value="yes" name="submit">
  </form>
 <% String str=request.getParameter("submit");
    if(str==null){
       str="";
    }
    if(str.equals("yes")){
       response.setContentType("application/msword;charset=gb2312");
    }
 %>
</font></body></HTML>