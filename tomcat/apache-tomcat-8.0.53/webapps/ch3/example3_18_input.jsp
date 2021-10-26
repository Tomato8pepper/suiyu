<%@page contentType="text/html;charset=gb2312"%>
<HTML><body>
   <form action="example3_18_pane.jsp" method=post name="form">
       输入您的姓名：<BR><input type="text" name="peopleName">
       <BR>输入您的留言标题：<BR><input type="text" name="Title">
       <BR>输入您的留言：<BR><TEXTAREA name="messages" ROWs="10" COLS=36 WRAP="physical"></TEXTAREA>
       <BR><input type="submit" value="提交信息" name="submit">
    </form>
    <form action="example3_18_show.jsp" method="post" name="form1">
       <input type="submit" value="查看留言板" name="look">
    </form>
</body></HTML>