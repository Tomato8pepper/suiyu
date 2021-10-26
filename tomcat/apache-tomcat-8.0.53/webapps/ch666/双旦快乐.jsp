<%@page contentType="text/html;charset=utf-8"%>
<%    String str=request.getParameter("food");
%>
<html><head><title>双旦快乐</title></head>
<body background="image\9.jpg" ><font color=blue face="楷体" size=5>
    <bgsound src="sound\<%=str%>" />
    <center><font size=20 color=blue face="楷体">双&nbsp&nbsp&nbsp旦&nbsp&nbsp&nbsp快&nbsp&nbsp&nbsp乐</font></center>
    <table   cellspacing=40 align=center>
        <tr><td><a href="liwu.jsp" ><font size=5 color=green>圣诞老人给你送礼物了</font></a></td>
            <td><a href="" ><font size=5 ></font></a></td>
            <td><a href="yuandan.jsp" ><font size=5 color=green>元旦要来了哦</font></a></td>
            <td><a href="" ><font size=5 ></font></a></td>
            <td><a href="pi.jsp" ><font size=5 color=green>你是真的皮！</font></a></td>
            <td><a href="" ><font size=5 ></font></a></td>
            <td><a href="zhenpi.jsp" ><font size=5 color=green>你是真真的皮！</font></a></td>
        </tr>
    </table>
    <form action="show.jsp" method="post">
            <font face="楷体" color=blue size=5>你喜不喜欢元旦或者圣诞：</font>
            <input type="radio" name="ra" value="yes" checked="default" >喜欢
            <input type="radio" name="ra" value="no">不喜欢
            <br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type=submit value="提交">
    </form>
    <form action="" method="post">
                      你想听什么歌：</font><br>
                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<select name="food" size=1>
                                                                                                                                           <option value="4.mp3">音乐一
                                                                                                                                           <option value="2.mp3">音乐二
                                                                                                                                           <option value="3.mp3">音乐三
                                                                                                                                     </select> <br><br><br>
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=submit value="提交">
    </form>   
</font></body></html>
