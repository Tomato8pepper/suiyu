<%@page contentType="text/html;charset=gb2312"%>
<%!public String handleStr(String s){
          try{ byte []bb=s.getBytes("iso-8859-1");
                s=new String(bb);
              }
           catch(Exception exp){}
           return s;
     }
%>
  <% String video=request.getParameter("video");
     if(video==null) video="";
     video=handleStr(video);
  %>
<HTML><center>
   <form action=""method=post name=form>
   <b>选择视频：
         <select name=video>
             <option value="Snowdream.avi">Snowdream
             <option value="化鹤归.avi">化鹤归
             <option value="宿敌.avi">宿敌
         </select><input type="submit" value="提交" name="submit">
      
    </form>
    <image src="image/flower.jpg" width=120 height=90 ></image>
    <embed src="avi/<%=video%>" autostart="ture" loop=-1 width=300 height=180>视频</embed>
</font></body></center></HTML>
             