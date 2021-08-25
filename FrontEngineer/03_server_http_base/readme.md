网络基础
IP地址：
域名：IP地址别名
DNS服务：映射域名与IP地址
端口：计算机大概有五万多个端口
公网服务器 Apache+php+mysql


客户端与服务器交互
客户端： 1.地址栏输入地址 get  2.超链接 get 3.表单 get、post
<form action="06.php" method="post">
    <input type="text" name="username">
    <input type="submit" value="提交数据">
</form>
服务端： 1.接受请求 2.处理数据 3.给客户端浏览器一个响应

文件上传与文件下载
<form action="./api/02_post.php" method="post">
    照片:<input type="file" name="lifephoto"> <br> <br>
    <input type="submit" value="上传">
</form>

http协议：协议就是规范，用来约束双方的，超文本传输协议，数据格式

抓包工具：Firebug、httpWatch、Chrome dev tools、Charles 

php+mysql+h5 => 登录注册

cookie:服务器暂时存放在客户端的资料，再次访问服务器的时候会把cookie携带到服务器
        生命周期：内存cookie这个cookie客户端保存在浏览器当中，关闭浏览器就消失
                 硬盘cookie这个cookie设置了保存时间，关闭电脑和重启电脑都存在
                 追杀cookie 把之前写到客户端的cookie清除掉
        应用场景：http协议是基于请求响应的，连接就会断开，http是无状态的，cookie是用来
                 记住用户的状态，用来进行多个请求之间的数据共享，是保存在客户端的

session: 一次会话当中多次独立的请求，会话开始把sessionId存在cookie中
         然后第二次请求的时候会把cookie带到服务器，服务器到session连接池中
         通过sessionId查找（消失1浏览器清缓存2会话超时session存储在服务器内存中一定的时间）
localStorage：本地硬盘存储
sessionStorage：客户端存储

ajax：实现页面不刷新，获取服务端数据
    同步交互：服务器响应回来的数据，把原来的页面给覆盖了
    异步交互：不会覆盖
    四步：
        1.var xhr = new XMLHttpRequest();
        2.xhr.open('get', 'login.php?username=zhangsan')
          xhr.open('post', 'post.php')
          // post需要加一个请求头
          xhr.setRequestHeader('Content-type','application/x-www-form-urlencoded')
        3.xhr.send(null)
          xhr.send('username=zhangsan')
        4.xhr.onreadystatechange=function(){
            // 0,1,2,3,4
            if(xhr.readyState === 4) {
                if(xhr.status === 200) {
                    var data = xhr.responseText
                }
            }
        }

数据格式：xml，json，html. ajax封装

跨域：jsonp、cors、自己服务器发送http请求给其他服务器、通过nginx转发请求

异步的文件上传：























