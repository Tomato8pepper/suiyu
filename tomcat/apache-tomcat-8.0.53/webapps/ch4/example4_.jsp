<%@page contentType="text/html;charset=gb2312"%>
<HTML><body bgcolor=pink><font Size=2>
<jsp:useBean id="file" class="tom.jiafei.ListFile" scope="request"/>
     <form action="" Method="post">
       ����Ŀ¼�������磺D��/2000<input type="text" name="dir" size=15><br>
       �����ļ�����չ�������磺java<input type="text" name="extendsName" size="6">
       <input type="submit" value="�ύ">
    </form>
       <jsp:setProperty name="file"  property="dir"  param="dir"/>
       <jsp:setProperty name="file"  property="extendsName"  param="extendsName"/>   
       <br><b>Ŀ¼<jsp:getProperty name="file"  property="dir"/>��
       ��չ����<jsp:getProperty name="file"  property="extendsName"/>���ļ��У�
       <%String []fileName=file.getAllFileName();
         if(fileName!=null){
            for(int i=0;i<fileName.length;i++){
             out.print("<br>"+fileName[i]);
            }
         }
        %>
</font></body></HTML>  
