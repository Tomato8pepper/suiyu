<%@ page contentType="text/html;charset=gb2312"%>
<%! public String handleStr(String s){
       try{ byte[] bb=s.getBytes("iso-8859-1");
             s=new String(bb);
           }
        catch(Exception exp){}
        return s;
    }
%>
<%   String music=request.getParameter("music");
     String pic=request.getParameter("pic");
     if(music==null) music="";
     if(pic==null) pic="";
     music=handleStr(music);
     pic=handleStr(pic);
%>
<HTML><center>
   <body background="image/<%=pic%>"<font size=2> <!-- ����ͼƬ -->
   <bgsound src="sound/<%=music%>"loop=-1/>       <!-- �������� -->
   <form action="" method=post name=form>
   <b>ѡ�񱳾����֣�<br>
       <select name="music">
          <Option selected value="back1.mp3">��ò���
          <Option value="back2.mp3">��
          <Option value="back3.mp3">���׹�
       </select>
   <br><b>ѡ�񱳾�ͼƬ��<br>
       <select name="pic" size=2>
          <Option value="back1.jpg">��ɯ
          <Option value="back2.jpg">��ɯ
          <Option value="back3.jpg">��ɯ
       </select><br>
      <input type="submit" value="�ύ" name="submit">
   </form>
</font></body></HTLM>