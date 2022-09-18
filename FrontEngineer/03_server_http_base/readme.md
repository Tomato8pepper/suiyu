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






# 什么是XSS攻击? 如何防范xss攻击? 什么是CSP?
    xss就是攻击者想尽一切办法将可以执行的代码注入到网页中

    xss类型：
        持久型：攻击者的代码被服务端写进了数据库

        非持久型：
            <!-- http://www.baidu.com?name=<script>alert(1)</script> -->


    防范：
        转译字符
        function escape(str) {
            str = str.replace(/&/g, '&amp;')
            str = str.replace(/</g, '&lt;')
            str = str.replace(/>/g, '&gt;')
            str = str.replace(/"/g, '&quto;')
            str = str.replace(/'/g, '&#39;')
            str = str.replace(/`/g, '&#96;')
            str = str.replace(/\//g, '&#x2F;')
            return str
        }
        
        <!-- <script>alert(1)</script> -->


        const xss = require('xss')
        let html = xss('<h1>XSS Demo</h1>')

# CSP
    开发者告诉浏览器那些外部资源是可以加载和执行的，如何拦截是由浏览器自己实现的

    通常有两种方式开启csp：
      1. 设置http Header 中的 Content-Security-Policy: default-src 'self'
      2. 设置mate标签 <metahttp-equiv="Content-Security-Policy">

    <!-- Content-Security-Policy: default-src 'self' -->
    <!-- Content-Security-Policy: img-src https://* -->




# 什么是CSRF攻击？如何防范 CSRF ？
    跨站请求伪造，

    防范：
    1. Get 请求不对数据进行修改
    2. 不让第三方网站访问cookie
    3. 阻止第三方网站的请求接口
    4. 请求时必须携带验证码或者Token







## HTTP服务&AJAX编程

### CS 架构

``` cs 架构流程图 ```

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wps66E2.tmp.jpg) 

```
在C/S结构的情况下，不同的服务需要安装不同的客户端软件，比如QQ、迅雷、Foxmail这种情况下安装的软件会越来越多，进而占用非常多的系统资源，除此之外还有其它弊端，比如A出差，需要在B电脑上查收邮件，但是B电脑并未安装Foxmail等类似的客户端软件，这样不得不先去下载Foxmail，非常不方便，并且客户端软件升级后也需要重新下载。
```

### bs 架构

```
  B/S（即Broswer、Server）解决了C/S所带来的不便，将所有的服务（如QQ、邮件等）都可以通过浏览器来完成，因为基本所有浏览器都安装了浏览器，这样可以更多的节省系统资源，并且功能升级也无需重新下载，只要刷新网页即可，要但B/S也有一些不利，比如操作稳定性、流畅度等方面相对较弱。
```
## 客户端

```
具有向服务器索取服务能力的终端，如比如 手机、电脑等，通过安装不同的客户端软件，可以获取不同的服务，
比如通过QQ获得即时通讯服务、通过迅雷获得下载服务等。常见的客户端软件：浏览器、QQ、迅雷、Foxmail等。
以浏览器为宿主环境，结合 HTML、CSS、Javascript等技术，而进行的一系列开发，通常称之为前端开发。
```
## 服务端

通俗的讲，能够提供某种服务的机器（计算机）称为服务器。

### 服务器类型

按照不同的划分标准，服务可划分为以下类型：

1、按服务类型可分为：文件服务器、数据库服务器；

2、按操作系统可分为：Linux服务器、Windows服务器等；

3、按应用软件可分为 Apache服务器、Nginx 服务器、IIS服务器、Tomcat服务器、Node服务器等；

### 服务器软件

使计算机具备提供某种服务能力的应用软件，称为服务器软件，通过安装相应的服务软件，然后进行配置后就可以使计算具备了提供某种服务的能力。

常见的服务器软件有：

1、文件服务器：Server-U、FileZilla、VsFTP等；

2、数据库服务器：Oracle、MySQL、PostgreSQL、MSSQL等；

3、邮件服务器：Postfix、Sendmail等；

4、web 服务器：Apache、Nginx、IIS、Tomcat、NodeJS等；

### Web服务器

即网站服务器，主要提供文档(文本、图片、视频、音频)浏览服务，一般安装Apache、Nginx服务器软件。

HTTP服务器可以结合某一编程语言处理业务逻辑，由此进行的开发，通常称之为服务端开发。

常见的运行在服务端的编程语言包括 PHP、Jsp、Asp、Python、Ruby, go等。

## 网络基础 

### IP 地址

所谓IP地址就是给每个连接在互联网上的主机分配的一个32位地址。(就像每部手机能正常通话需要一个号码一样)

查看本机IP地址 ping、ipconfig、ifconfig

公网ip，局域网ip

### 域名

由于IP地址基于数字，不方便记忆，于是便用域名来代替IP地址，域名是一个IP地址的“面具”

查看域名对应的IP地址 ping、tracert。

### DNS服务

DNS记录了 IP 地址和域名的映射（对应）关系；

查找优先级 本机hosts文件、DNS服务器。

### 端口

端口号是计算机与外界通讯交流的出口，每个端口对应不同的服务。

现实生活中，银行不同的窗口办理不同的业务。

查看端口占用情况 netstat -an。

常见端口号 80、8080、3306、21、22。

##搭建web服务器

Windows (Linux) + Apache + Mysql + PHP，首字母组合

### 安装WampServer

安装wampserver，和普通软件安装无差别，除指定安装路径外，其它默认安装。

### 管理HTTP服务

任务图标绿色为正常启动状态

通过图形控制台可以启动、重启、停止所有服务

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wps7D72.tmp.jpg)

或者单独启动、重启、停止特定服务

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsF032.tmp.jpg)

**注意事项：**

1、检查网络是不是通的 ping 对方IP

2、检查防火墙是否开启，如果开启将不能正常被访问

3、检查访问权限 Allow from all  235 行

4、理解默认索引

5、确保端口没有被其它程序占用

6、“#”表示注释

7、修改配置要格外小心，禁止无意修改其它内容

###  配置根目录 

网站根目录是Web服务器上存放网站程序的空间，可通过修改配置文件自定义，如E:/www

具体步骤如下 （178行，205 行）

1、打开配置文件，控制台选择

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsD1AB.tmp.jpg)

或者 wampserver安装目录下

bin\apache\Apache2.2.21\conf\httpd.conf

2、设定根目录，查找并修改

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsED47.tmp.jpg) 

例如：

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsED57.tmp.jpg) 

这样就指定了 "E:/www/"为存放网站的根目录。

3、配置根目录，查找

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsED58.tmp.jpg) 

修改成 

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsED59.tmp.jpg) 

4、修改完后，并不能立即生效，需要重启Apache

注：可以指定任意目录为根目录

###  网站部署

将我们制作好的网页拷贝到配置好的根目录下，浏览器访问127.0.0.1即可。

###  配置虚拟主机

在一台Web服务器上，我们可以通过配置虚拟主机，然后分别设定根目录，实现对多个网站的管理。

具体步骤如下：

1、开启虚拟主机辅配置，在httpd.conf 中找到

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsEA0.tmp.jpg) 

去掉前面的#号注释，开启虚拟主机配置

2、配置虚拟主机，打开conf/extra/httpd-vhosts.conf 

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsEA1.tmp.jpg) 

分别修改以下三项

DocumentRoot "E:/www/example"

ServerName "example.com "

ServerAlias "www.example.com"

其它项无需指定。

3、修改DNS（hosts）文件

打开C:\Windows\System32\drivers\etc\hosts

目录是固定的

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wpsEA2.tmp.jpg) 

注：修改hosts文件权限

4、重启Apache

5、浏览器访问www.example.com

### 静态资源 与动态资源

静态资源：可以直接被浏览器解析的资源我们称为静态资源，比如html,javascript,css,video 等。

动态资源:动态资源在服务器被解析，可以被转换为静态资源。 

区别：如果我们客户端浏览器访问的是静态资源，那服务器接收到请求后，会直接将静态资源响应给客户端。

如果客户端浏览器访问的是动态资源，那么服务器接收到请求后会将动态资源转换成静态资源，然后进行响应。

## php 编程

### php 入门

文件以.php后缀结尾，所有程序包含在

<?php /** 这里是代码 **/ ?>

![img](file:///C:\Users\zhuwu\AppData\Local\Temp\ksohtml\wps792.tmp.jpg) 

**避免使用中文目录和中文文件名**

### php 变量

1、变量以$开头 字母/数字/下划线 不能以数字开头

2、大小写敏感（区分大小写）

### 数据类型

字符型、整型、浮点型、布尔型、数组、

索引数组、关联数组（了解即可）

### 内容输出

echo：输出简单数据类型，如字符串、数值

print_r()：输出复杂数据类型，如数组

var_dump()：输出详细信息，如对象、数组（了解）

### 运算符

基本与Javascript语法一致

.号表示字符串拼接符，Javascript中为+号。

### 函数

与Javascript基本一致函数名对大小写不敏感默认参数（了解即可）。

### 分支 循环语句

与Javascript基本一致foreach()

### 表单处理

表单name属性的是用来提供给服务端接收所传递数据而设置的

表单action属性设置接收数据的处理程序

表单method属性设置发送数据的方式

当上传文件是需要设置 enctype="multipart/form-data"，且只能post方式

$_GET接收 get 传值

$_POST接收 post 传值

$_FILES接收文件上传

### 常用PHP函数

in_array() 是否在数组中

```
$arrs=array("1","2","3");
//判断1 这个元素是否存在$arrs 这个数组当中。
echo in_array("1",$arrs);
```

count() 计算数组长度

```
$arrs=array("1","2","3");
count($arrs);
```

array_key_exists ()检测数组中是否存在key

```
 $arrs=array("username"=>"张三","age"=>11);
echo array_key_exists("username",$arrs);
```

file_get_contents读取文件

...还有很多

```
$data=file_get_contents("hello.txt");
echo $data;
```

 $data=$_FILES[**"lifephoto"**];
*// var_dump($data);**//**获取到**apache* *临时存储的文件**.*$file=$data[**"tmp_name"**];
//获取到文件名 $fileName=$data[**"name"**];
**move_uploaded_file**($file,**"images/"**.$fileName);

## 数据库

###  数据库基础知识

数据库：存储数据的仓库

内存存储

​	数据无法持久化

​	无法保存大量的数据

文件存储

​	速度太慢，无法忍受

​	很难确定数据的结构以及关系，增加、删除、修改麻烦，需要你自己按照一种固定的方式

​	不安全，随便一个人都能打开你的文件

###数据库概述

- **数据结构化**

![img](wps8650.tmp.jpg) 

 

 

![img](wps8651.tmp.jpg) 

- **实现数据共享**

![img](wps8662.tmp.jpg) 

不是为某一个用户存储特定的数据

- 可以减少冗余数据

- 数据独立性高

- 数据统一管理与控制 

### 数据结构化

数据库就是用来存储数据的。

电子化的文件柜——存储电子文件的处所

一个容器。

就是用来存储电子化的数据的

数据库管理系统（DataBase Management System，DBMS）：

为管理[数据库](https://zh.wikipedia.org/wiki/%E6%95%B0%E6%8D%AE%E5%BA%93)而设计的大型电脑[软件](https://zh.wikipedia.org/wiki/%E8%BD%AF%E4%BB%B6)管理系统

[Oracle](https://zh.wikipedia.org/wiki/Oracle)、[Microsoft SQL Server](https://zh.wikipedia.org/wiki/Microsoft_SQL_Server)、[Access](https://zh.wikipedia.org/wiki/Access)、[MySQL](https://zh.wikipedia.org/wiki/MySQL)及[PostgreSQL](https://zh.wikipedia.org/wiki/PostgreSQL)

数据库应用程序（DataBase Application）：

其实就是一些图形化管理界面的GUI软件，来操作数据库管理系统管理我们的数据

### 数据库存储结构

![img](wpsA4AC.tmp.jpg) 

一个数据库服务器可以管理多个数据库，通常情况下开发人员会针对每个应用创建一个数据库，为保存应用中实体的数据，会在数据库中创建多个表（用于存储和描述数据的逻辑结构），每个表都记录着实体的相关信息。

一个数据库服务器中可以有多个数据库

一个数据库当中可以有多张表用来存储数据

一个表中可以用来存储多条记录

### SQL 语言



SQL（Structure Query Language）：结构化查询语言

是一种数据库**查询语言**。

SQL语言是一个标准。由一个规范组织提出和维护的。

市面上常见的数据库基本都支持SQL查询语言。

#### DDL

l 数据定义语言（Data Definition  [ˌdefɪˈnɪʃn]  Language）简称**DDL**

数据库定义语言主要用于定义数据库、表等，其中包括：

CREATE  语句用于创建数据库、数据表等

ALTER   语句用于修改表的定义等

DROP    语句用于删除数据库、删除表等

### DML

l 数据操作语言（Data Manipulation [məˌnɪpjʊ'leɪʃn] Language）简称DML

数据操作语言主要用于对数据进行添加、修改和删除操作，其中包括：

INSERT 语句用于插入数据

UPDATE 语句用于修改数据

DELETE 语句用于删除数据

####DQL

l 数据查询语言（Data Query Language）简称DQL

数据查询语言主要用于查询数据，也就是SELECT语句，使用SELECT 语句可以查询数据库中一条数据或多条数据

数据库中的操作都是通过SQL语句来完成的，而且在应用程序中也经常使用SQL语句，例如在Node.js中嵌入SQL语句，通过执行JavaScript语言来调用SQL语句，就可以完成数据的插入、修改、删除、查询等操作。

SQL语句还可以嵌入到其它语言中，如Java、PHP等。

### 常见的数据库产品

####Orcale数据库

Orcale数据库管理系统由**甲骨文公司**开发，在数据库领域一直处于领先地位。

大型的商业型数据库，目前国内一些大公司在用，国企

淘宝、京东等都有使用，一个很老牌的数据库，稳定

####SqlServer数据库

由微软公司开发，只能在Windows上运行。.net程序员。

但是，微软现在已经把SqlServer移植到了别的平台，例如：Linux

#### DB2数据库

由IBM公司开发，在**金融行业**中使用的比较多。IBM的服务器，买服务器送数据库。

IBM靠硬件发家的，小型机。小型服务器

比较稳定

####MySQL数据库

MySQL数据管理系统由瑞典的MySQLDB公司开发，但是几经辗转，现在已经是Oracle的产品了。

开源、免费、轻量

MySQL具有跨平台的特性，不仅可以在Windows平台上使用，还可以在Unix、Linux和Mac OSX平台上使用。

相对其它数据库而言，MySQL的使用也更加方便、快捷而且MySQL免费所以**运营成本低**，因此很多公司都在用MySQL。

Oracle收购过来之后，发行了两个版本：

​	一个是企业版，公司买了之后，Oracle公司可以提供一些服务，例如数据恢复，或者说存储数据出现了问题

​	一个社区版，也就是免费开原版

#### MongoDB数据库

mongodb是一种非关系型数据库，简称NoSQL

存储方式，不是数据库-表-记录了

mongod的存储方式是：数据库-集合-实体（随便存储，就像json对象一样）

MongoDB是由10gen公司开发的一个介于关系型数据库和非关系型数据库之间的产品，是非关系型数据库中功能最丰富，最像关系型数据库的。他支持的数据结构非常松散，是类似json的格式，所以可以存储比较复杂的数据结构类型。

MongoDB数据库管理系统最大的特点就是它支持的查询语言非常强大，语法类似于面向对象的查询语言。它还是一个开源的数据库，对于大数据量、高并发的互联网应用，支持非常不错。

操作非关系型数据库不需要使用SQL语言



##  MySQL安装与配置

###  Windows平台下安装和配置MySQL

官方网站：<http://www.mysql.com/>

![img](wps87DA.tmp.jpg) 

 

![img](wps87DB.tmp.jpg) 

 

![img](wps87EC.tmp.jpg) 

![img](wps87ED.tmp.jpg) 



![img](wps87EE.tmp.jpg) 

 

![img](wps87FF.tmp.jpg) 

 

![img](wps885D.tmp.jpg) 

![img](wps885E.tmp.jpg) 

![img](wps885F.tmp.jpg) 

![img](wps8870.tmp.jpg) 

![img](wps8871.tmp.jpg) 

![img](wps8881.tmp.jpg) 

![img](wps8882.tmp.jpg) 

![img](wps8883.tmp.jpg) 

![img](wps8884.tmp.jpg) 

![img](wps8895.tmp.jpg) 

![img](wps8896.tmp.jpg) 

![img](wps8897.tmp.jpg) 

 

验证mysql是否安装成功：

- 打开命令台，输入services.msc找到mysql服务

- 通过在cmd命令台中输入path查看是否有mysql的bin目录

###  MySQL目录结构

bin：可执行文件所在目录

data：数据文件所在目录

Docs：文档目录

share：存放字符集等信息

my.ini：MySQL数据库使用的配置文件

## 1.1 MySQL的使用

### 1.1.1 启动 和 停止MySQL服务

1. 通过Windows服务管理器启动MySQL服务

通过Windows的运行，输入services.msc找到MySQL服务

1. 通过DOS命令启动MySQL服务

   et stop mysql	停止MySQL服务

   et start mysql	开启MySQL服务

### 登录MySQL数据库

**使用相关命令登录**

打开命令台：

mysql -h localhost -P 3306 -u root -p

-h：主机名

-P：端口

-u：用户名

-p：密码

这种方式一般用来连接远程数据库服务器

mysql默认连接localhost和3306，所以可以省略-h和-P

mysql -u root -p

这种方式一般用来连接本机，可以省略-h和-P，默认就是localhost和3306

#### 创建数据库

**CREATE** DATABASE [IF **NOT EXISTS**] db_name;

创建   数据库	数据库名;

注意：一定要在语句的末尾加分号

注意：中括号都表示可选的意思，不是让你把中括号也写进入，否则mysql根本不识别。

#### 查看数据库

show database;

#### 删除数据库

**DROP** DATABASE [IF **EXISTS**] db_name;

#### 选择数据库

USE db_name;

### 数据库表的概念

​       我们的数据是面向表存储的，数据库表格式用来存储数据的，这个我们现实当中的表一样，我们首先需要定义表当中有多少列，然后我们可以往表当中添加一条一条的记录。我们在定义一张表的列时，我们需要先根据需求对这张表进行设计，设计一般主要是设计表当中有哪些列，这一列对应的名称是什么，它所存放的数据类型是什么，这个我们也称为表结构的设计。所以在学习表的设计之前，我们需要学习表的一些相关知识.

#####数据类型

数据类型是用来约束表当中每一列存放的数据类型。这样做的目的是为了

##### 整数类型

![1528941073882](1528941073882.png)

##### 日期和时间

![1528941148564](1528941148564.png)

##### 字符串和二进制

![1528941111089](1528941111089.png)



### 数据库表的基本操作

#### 创建数据库表

```
CREATE TABLE table_name
(
    field1  datatype,
    field2  datatype,
    field3  datatype,
)
```

#### 查看数据表

查看当前数据库中的所有表。

```
show tables;
```

查看表结构

``` 
desc table_name;
```

查看建表语句

```
show create table table_name;
```

####删除数据表

```
DROP TABLE table_name;
```

### 表的约束

为了防止数据表中插入错误的数据，在MySQL中，定义了一些维护数据库完整性的规则，即表的约束。

| 约束条件    | 说明                             |
| ----------- | -------------------------------- |
| PRIMARY KEY | 主键约束，用于唯一标识对应的记录 |
| FOREIGN KEY | 外键约束                         |
| NOT NULL    | 非空约束                         |
| UNIQUE      | 唯一性约束                       |
| DEFAULT     | 默认值约束，用于设置字段的默认值 |

表的约束条件都是针对表中字段进行限制，从而保证数据表中数据的正确性和唯一性。

### 数据处理

#### 增加数据

```
INSERT INTO table_name VALUES(value1,value2,value3...);
```

#### 修改数据

```
UPDATE table_name     SET col_name1=expr1 , col_name2=expr2  where condition;
```

#### 删除数据

```
delete from** table_name  [WHERE where_definition];
```

#### 查询数据

```
SELECT [DISTINCT] *|{colum1, colum2, colum3...} FROM table_name;
SELECT指定查询哪些列的数据
column指定列名
* 号表示查询所有列
FROM 指定查询哪种表
DISTINCT 可选，指查询结果时，是否去除重复数据
```

### SQLYong 的介绍

它是一个基于图形化界面的mysql 客户端软件，通过此软件，我们可以通过图形化界面的方式去连接数据库，

创建表，增删改查数据。整个操作都是基于图形化界面的，避免我们编写大量的sql 语句，提升我们的开发效率。




## HTTP服务&AJAX编程

### 昨天内容回顾

- bs 架构与cs 架构的区别

- 客户端的概念

- 服务端的概念

- 搭建web 服务器 

- wamp 的安装以及配置

- 静态资源与动态资源的区别

- php 的基础语法

- php 的函数，常见函数以及以及一些特殊用法

- 客户端与服务端交互的几种方式

  ###文件上传

  ####文件上传客户端的要求

  - 必须表单提交
  - 必须是post 方式提交
  - 当上传文件是需要设置 enctype="multipart/form-data"
  - 必须有一个input  type=file 的属性

  #### 文件上传服务器处理数据  

  使用$_FILES接收文件上传 接收文件上传的数据。move_uploaded_file

  ```
   header("Content-Type:text/html;charset=utf-8");          
   1:怎么去接收文件上传的数据 实际上就是去这个数组里面把客户端传递的文件内容一个一个取出来
                   //var_dump($_FILES);
  接收到的是文件上传的数据. lifephoto 是文件上传的参数的名称
     $_FILES=array(
         "lifephoto"=>
         array(
         name=>"", 客户端传递的文件的名称
         type=>"image/jpeg", 客户端传递的文件类型
         tmp_name=>"",  客户端传递的文件在服务端临时的一个保存地址
         error=>"0"  文件上传的时候可能会发生失败，出错误
         size=>"10823" 客户端上传的 文件的大小
         )
     );
  1.1 获取文件上传的数据
   $fileName=$_FILES["lifephoto"]["name"];
  1.2 获取文件上传的时候在服务器端临时的存储位置
  $tmpaddress=$_FILES["lifephoto"]["tmp_name"];
  2：接收到文件上传的数据之后，我们怎么去处理这些数据.，实际上要把客户端上传的数据保存在服务端的硬盘上面.
  2.1 怎么去保存，php 提供了一个函数 move_uploaded_file，可以将文件上传的数据移动到指定的某个目录文件下面接收两个参数
  1:临时的文件存放的地址
  2:我要放在的目标位置, images/1.jpg
  move_uploaded_file($tmpaddress,"images/".$fileName);
  3：响应数据
  echo "<font color='green'>恭喜你，文件上传成功</font>";
  ```

  ## 网络通讯协议

  指服务器和客户端间进行通信时的约束和规范，客户端与服务端的数据交互并不是杂乱无章的，需要遵照（基于）一定的规范进行。

  ![1529422265623](1529422265623.png)

  ###常见协议

  1、HTTP、HTTPS 超文本传输协议 

  2、FTP 文件传输协议

  3、SMTP 简单邮件传输协议

  4、即时通讯协议XMPP

  ### http 协议 

  即超文本传输协议，网站是基于HTTP协议的，例如网站的图片、CSS、JS等都是基于HTTP协议进行传输的。

  HTTP协议是由从客户机到服务器的请求(Request)和从服务器到客户机的响应(Response)进行了约束和规范。

  即HTTP协议主要由请求和响应构成。

  ![img](wps6F76.tmp.jpg) 

  常用请求方法 POST、GET、PUT、DELETE

  ###  **请求/请求报文**

  请求由客户端发起，其规范格式为：请求行、请求头、请求主体。

  ![img](wpsB453.tmp.jpg) 

  1、请求行

  ![img](wpsB454.tmp.jpg) 

  由请求方式、请求URL和协议版本构成

  2、请求头

  Host：localhost请求的主机

  Cache-Control：max-age=0控制缓存

  Accept：*/* 接受的文档MIME类型

  User-Agent：很重要

  Referer：从哪个URL跳转过来的

  Accept-Encoding：可接受的压缩格式

  3、请求主体

  即传递给服务端的数据

  **注：当以post形式提交表单的时候，请求头里会设置**

  **Content-Type: application/x-www-form-urlencoded，以get形式当不需要**

  特殊的请求头介绍：

  Content-Type:""

  referer: 请求头

  refresh 响应头

  Content-Type: 响应头

  ### **响应/响应报文**

  响应由服务器发出，其规范格式为：状态行、响应头、响应主体。

  ![img](wpsB455.tmp.jpg) 

  1、状态行

  ![img](wpsB465.tmp.jpg) 

  由协议版本号、状态码和状态信息构成

  2、响应头

  Date：响应时间

  Server：服务器信息

  Content-Length：响应主体长度

  Content-Type：响应资源的MIME类型

  **MIME是标识文件类型的，文件后缀并不能正确无误的标识文件的类型。**

  **客户端与服务器在进行数据传输的时候都是以字节形式进行的，咱们可以理解成是以“文本形式”传输，这时浏览器就需要明确知道该怎么样来解析这些文本形式的数据，MIME就是明确告知浏览器该如何来处理。**

  3、响应主体

  即服务端返回给客户端的内容；

  状态码

  ![img](wpsB466.tmp.jpg) 

  常见的有200代表成功、304文档未修改、403没有权限、404未找到、500服务器错误,302 代表的是请求重定向。

  ####**调试工具**

  利用HTTP抓包工具在开发中可以帮我们进行调试，常用抓包工具HttpWatch、Fiddler、Charles、FireBug等

  **浏览器插件**

  Firebug、HttpWatch、chrome dev tools

  **代理软件**

  Charles、Fiddler

  ### get 请求与post 请求介绍

  	1: get 发送的数据都在地址栏当中，不安全
  	2：get 发送的数据对数据大小由限制。
  	3：get 没有请求体
  	4：post 发送的数据在请求体当中，相对安全
  	 5：post 对请求的数据的大小没有限制
  	6：post 有一个特殊的请求头 Content-Type:application/x-www-form-urlencoded
  	 7: get 的请求头相对较少，性能稍微要高一些.

```
案例1
        //解决乱码，给客户端一个响应头
        header("Content-Type:text/html;charset=utf-8");
        //1:获取请求头 获取所有的请求头.
          $arrHeader=getallheaders();
        //2:我获取的是User-Agent 请求头对应的值
          $headeValue=$arrHeader["User-Agent"];
         // echo $headeValue;
        //3:php 里面有一个函数 strstr() 判断字符串是否包含指定的字符串.
        if(strstr($headeValue,"Chrome")){
             echo "您当前使用的google 浏览器，棒棒哒!";
        }else if(strstr($headeValue," Firefox")){
             echo "您当前使用的火狐 浏览器，双击666";
        }else if(strstr($headeValue,"MSIE")){
             echo "您当前使用的浏览器版本较低，请<a href='http://www.360.com'>升级</a>";
        }
```

```
案例2
<?php
        header("Content-Type:text/html;charset=utf-8");
        //1:给一个响应头
        header("Refresh:5;url=http://www.baidu.com");
        //2：给文字提示.
        echo " <span>5</span> 秒钟之后会自动跳转页面，如果没有跳转，请点击<a 		href='http://www.baidu.com'>这里</a>";
?>
<script>
                var i=5;
                var ids=window.setInterval(function(){
                        i--;
                        if(i==0){
                                window.clearInterval(ids);
                                return;
                        }
                        document.querySelector("span").innerHTML=i;
                },1000);
</script>
```

#### http 协议详解

![1529422199930](1529422199930.png)

## 数据库

### 数据库基础知识

![1529422233204](1529422233204.png)

数据库：存储数据的仓库 （仓库用来存储的数据） 

内存存储

​	1:数据无法持久化

​	2:无法保存大量的数据

文件存储

​	速度太慢，无法忍受

​	很难确定数据的结构以及关系，增加、删除、修改麻烦，需要你自己按照一种固定的方式

​	不安全，随便一个人都能打开你的文件

### 数据库概述

- **数据结构化**

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8650.tmp.jpg) 

 

 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8651.tmp.jpg) 

- **实现数据共享**

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8662.tmp.jpg) 

不是为某一个用户存储特定的数据

- 可以减少冗余数据
- 数据独立性高
- 数据统一管理与控制 

### 数据结构化

数据库就是用来存储数据的。

电子化的文件柜——存储电子文件的处所一个容器。

就是用来存储电子化的数据的

数据库管理系统（DataBase Management System，DBMS）：

为管理[数据库](https://zh.wikipedia.org/wiki/%E6%95%B0%E6%8D%AE%E5%BA%93)而设计的大型电脑[软件](https://zh.wikipedia.org/wiki/%E8%BD%AF%E4%BB%B6)管理系统

[Oracle](https://zh.wikipedia.org/wiki/Oracle)、[Microsoft SQL Server](https://zh.wikipedia.org/wiki/Microsoft_SQL_Server)、[Access](https://zh.wikipedia.org/wiki/Access)、[MySQL](https://zh.wikipedia.org/wiki/MySQL)及[PostgreSQL](https://zh.wikipedia.org/wiki/PostgreSQL)

数据库应用程序（DataBase Application）：

其实就是一些图形化管理界面的GUI软件，来操作数据库管理系统管理我们的数据

### 数据库存储结构

![img](../../day_01/%E7%AC%94%E8%AE%B0/wpsA4AC.tmp.jpg) 

一个数据库服务器可以管理多个数据库，通常情况下开发人员会针对每个应用创建一个数据库，为保存应用中实体的数据，会在数据库中创建多个表（用于存储和描述数据的逻辑结构），每个表都记录着实体的相关信息。

一个数据库服务器中可以有多个数据库

一个数据库当中可以有多张表用来存储数据

一个表中可以用来存储多条记录

### SQL 语言



SQL（Structure Query Language）：结构化查询语言

是一种数据库**查询语言**。

SQL语言是一个标准。由一个规范组织提出和维护的。

市面上常见的数据库基本都支持SQL查询语言。

#### DDL

l 数据定义语言（Data Definition  [ˌdefɪˈnɪʃn]  Language）简称**DDL**

数据库定义语言主要用于定义数据库、表等，其中包括：

CREATE  语句用于创建数据库、数据表等

ALTER   语句用于修改表的定义等

DROP    语句用于删除数据库、删除表等

### DML

l 数据操作语言（Data Manipulation [məˌnɪpjʊ'leɪʃn] Language）简称DML

数据操作语言主要用于对数据进行添加、修改和删除操作，其中包括：

INSERT 语句用于插入数据

UPDATE 语句用于修改数据

DELETE 语句用于删除数据

#### DQL

l 数据查询语言（Data Query Language）简称DQL

数据查询语言主要用于查询数据，也就是SELECT语句，使用SELECT 语句可以查询数据库中一条数据或多条数据

数据库中的操作都是通过SQL语句来完成的，而且在应用程序中也经常使用SQL语句，例如在Node.js中嵌入SQL语句，通过执行JavaScript语言来调用SQL语句，就可以完成数据的插入、修改、删除、查询等操作。

SQL语句还可以嵌入到其它语言中，如Java、PHP等。

### 常见的数据库产品

#### Orcale数据库

Orcale数据库管理系统由**甲骨文公司**开发，在数据库领域一直处于领先地位。

大型的商业型数据库，目前国内一些大公司在用，国企

淘宝、京东等都有使用，一个很老牌的数据库，稳定

#### SqlServer数据库

由微软公司开发，只能在Windows上运行。.net程序员。

但是，微软现在已经把SqlServer移植到了别的平台，例如：Linux

#### DB2数据库

由IBM公司开发，在**金融行业**中使用的比较多。IBM的服务器，买服务器送数据库。

IBM靠硬件发家的，小型机。小型服务器

比较稳定

#### MySQL数据库

MySQL数据管理系统由瑞典的MySQLDB公司开发，但是几经辗转，现在已经是Oracle的产品了。

开源、免费、轻量

MySQL具有跨平台的特性，不仅可以在Windows平台上使用，还可以在Unix、Linux和Mac OSX平台上使用。

相对其它数据库而言，MySQL的使用也更加方便、快捷而且MySQL免费所以**运营成本低**，因此很多公司都在用MySQL。

Oracle收购过来之后，发行了两个版本：

​	一个是企业版，公司买了之后，Oracle公司可以提供一些服务，例如数据恢复，或者说存储数据出现了问题

​	一个社区版，也就是免费开原版

#### MongoDB数据库

mongodb是一种非关系型数据库，简称NoSQL

存储方式，不是数据库-表-记录了

mongod的存储方式是：数据库-集合-实体（随便存储，就像json对象一样）

MongoDB是由10gen公司开发的一个介于关系型数据库和非关系型数据库之间的产品，是非关系型数据库中功能最丰富，最像关系型数据库的。他支持的数据结构非常松散，是类似json的格式，所以可以存储比较复杂的数据结构类型。

MongoDB数据库管理系统最大的特点就是它支持的查询语言非常强大，语法类似于面向对象的查询语言。它还是一个开源的数据库，对于大数据量、高并发的互联网应用，支持非常不错。

操作非关系型数据库不需要使用SQL语言



## MySQL安装与配置

### Windows平台下安装和配置MySQL

官方网站：<http://www.mysql.com/>

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87DA.tmp.jpg) 

 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87DB.tmp.jpg) 

 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87EC.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87ED.tmp.jpg) 



![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87EE.tmp.jpg) 

 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps87FF.tmp.jpg) 

 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps885D.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps885E.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps885F.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8870.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8871.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8881.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8882.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8883.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8884.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8895.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8896.tmp.jpg) 

![img](../../day_01/%E7%AC%94%E8%AE%B0/wps8897.tmp.jpg) 

 

验证mysql是否安装成功：

- 打开命令台，输入services.msc找到mysql服务
- 通过在cmd命令台中输入path查看是否有mysql的bin目录

### MySQL目录结构

bin：可执行文件所在目录

data：数据文件所在目录

Docs：文档目录

share：存放字符集等信息

my.ini：MySQL数据库使用的配置文件

## 1.1 MySQL的使用

### 1.1.1 启动 和 停止MySQL服务

1. 通过Windows服务管理器启动MySQL服务

通过Windows的运行，输入services.msc找到MySQL服务

1. 通过DOS命令启动MySQL服务

   et stop mysql	停止MySQL服务

   et start mysql	开启MySQL服务

### 登录MySQL数据库

**使用相关命令登录**

打开命令台：

mysql -h localhost -P 3306 -u root -p

-h：主机名

-P：端口

-u：用户名

-p：密码

这种方式一般用来连接远程数据库服务器

mysql默认连接localhost和3306，所以可以省略-h和-P

mysql -u root -p

这种方式一般用来连接本机，可以省略-h和-P，默认就是localhost和3306

#### 创建数据库

**CREATE** DATABASE [IF **NOT EXISTS**] db_name;

创建   数据库	数据库名;

注意：一定要在语句的末尾加分号

注意：中括号都表示可选的意思，不是让你把中括号也写进入，否则mysql根本不识别。

#### 查看数据库

show database;

#### 删除数据库

**DROP** DATABASE [IF **EXISTS**] db_name;

#### 选择数据库

USE db_name;

### 数据库表的概念

​       我们的数据是面向表存储的，数据库表格式用来存储数据的，这个我们现实当中的表一样，我们首先需要定义表当中有多少列，然后我们可以往表当中添加一条一条的记录。我们在定义一张表的列时，我们需要先根据需求对这张表进行设计，设计一般主要是设计表当中有哪些列，这一列对应的名称是什么，它所存放的数据类型是什么，这个我们也称为表结构的设计。所以在学习表的设计之前，我们需要学习表的一些相关知识.

##### 数据类型

数据类型是用来约束表当中每一列存放的数据类型。这样做的目的是为了

##### 整数类型

![1528941073882](../../day_01/%E7%AC%94%E8%AE%B0/1528941073882.png)

##### 日期和时间

![1528941148564](../../day_01/%E7%AC%94%E8%AE%B0/1528941148564.png)

##### 字符串和二进制

![1528941111089](../../day_01/%E7%AC%94%E8%AE%B0/1528941111089.png)



### 数据库表的基本操作

#### 创建数据库表

```
CREATE TABLE table_name
(
    field1  datatype,
    field2  datatype,
    field3  datatype,
)
```

#### 查看数据表

查看当前数据库中的所有表。

```
show tables;
```

查看表结构

```
desc table_name;
```

查看建表语句

```
show create table table_name;
```

#### 删除数据表

```
DROP TABLE table_name;
```

### 表的约束

为了防止数据表中插入错误的数据，在MySQL中，定义了一些维护数据库完整性的规则，即表的约束。

| 约束条件    | 说明                             |
| ----------- | -------------------------------- |
| PRIMARY KEY | 主键约束，用于唯一标识对应的记录 |
| FOREIGN KEY | 外键约束                         |
| NOT NULL    | 非空约束                         |
| UNIQUE      | 唯一性约束                       |
| DEFAULT     | 默认值约束，用于设置字段的默认值 |

表的约束条件都是针对表中字段进行限制，从而保证数据表中数据的正确性和唯一性。

### 数据处理

#### 增加数据

```
INSERT INTO table_name VALUES(value1,value2,value3...);
```

#### 修改数据

```
UPDATE table_name     SET col_name1=expr1 , col_name2=expr2  where condition;
```

#### 删除数据

```
delete from** table_name  [WHERE where_definition];
```

#### 查询数据

```
SELECT [DISTINCT] *|{colum1, colum2, colum3...} FROM table_name;
SELECT指定查询哪些列的数据
column指定列名
* 号表示查询所有列
FROM 指定查询哪种表
DISTINCT 可选，指查询结果时，是否去除重复数据
```

### SQLYong 的介绍

它是一个基于图形化界面的mysql 客户端软件，通过此软件，我们可以通过图形化界面的方式去连接数据库，

创建表，增删改查数据。整个操作都是基于图形化界面的，避免我们编写大量的sql 语句，提升我们的开发效率。

## php 连接mysql 数据库 

### 前端部分

### php 部分

####注册 往数据库里面添加一条记录

```
/*
响应的数据
*/
header('Content-Type:text/json;charset=utf-8');
/*
连接数据库
账号，密码
*/
$con = mysql_connect("127.0.0.1","root","");
if (!$con){
	die('Could not connect: ' . mysql_error());
}
//连接那个数据
mysql_select_db("kaikeba", $con);
 //sql 语句
//把客户端获取到的值，往数据库里面添加
$sql="INSERT INTO teacher (username, telephone, age,t_desc)
     VALUES('$_POST[username]','$_POST[telephone]','$_POST[age]','$_POST[desc]','$_POST[lifephoto]')";
//通过连接发送sql语句;     
if (!mysql_query($sql,$con)){
 	die('Error: ' . mysql_error());
}
//关闭跟数据库的连接
mysql_close($con)
```

####登录 (从数据库里面查询一条记录)

```
    //给客户端一个响应头，响应json 格式的数据.
    header('Content-Type:application/json;charset=utf-8');
    //连接数据库 得到连接
    $con = mysql_connect("127.0.0.1","root","");
    if (!$con){
        die('Could not connect: ' . mysql_error());
    }
    //连接那个数据库  pdj 数据
    mysql_select_db("pdj", $con);
    $result = mysql_query($sql);
    //定义了一个空数组.
    $list = array();
    $total = 0;
   //把数据库里面返回的结果$result 遍历出来
   //放在$list 空的数据里面.
    while($row = mysql_fetch_array($result)){
        $item = array(
            'id' => $row['id'],
            'username' => $row['username'],
            'telephone' => $row['telephone'],
            'age' => $row['age'],
            't_desc' => $row['t_desc'],
            'lifephoto' => $row['lifephoto'],
        );
        //往数组里面添加一条记录.
        array_push($list,$item);
        //总记录数
        $total = $row['total'];
    }
   echo "<a href=''>kaikeba</a>";
    mysql_close($con);
```

####修改密码 (更改数据库的数据)



### 数据库部分





## HTTP服务&AJAX编程

- 文件上传的小案例(客户端怎么处理)(服务端怎么接收数据)

- http 协议的基本概念(客户端与服务器端进行交互的一种数据格式)

- http 请求的数据格式以及响应的数据格式分析(http 协议就是基于请求响应的协议.)

- get  请求以 post 请求的区别

- 常见的请求头以及响应头的作用

  (检测客户端浏览器的版本)

  （浏览器客户端过几秒钟之后自动跳转）

- 常见的状态码

  200  ok

   403  没有权限访问

   404  请求的资源没有找到 

  304  后端的文件的没有任何的改变 

  302  重定向 

  500  服务器内部错误.

- 数据库的概念

- 数据库的安装 wamp 

- 数据库的存储方式  

  ## 1.1 MySQL的使用

  ```
  一个数据库服务器中可以有多个数据库  
   一个数据库当中可以有多张表用来存储数据 
   一个表中可以用来存储多条记录 
  ```

  ### 启动 和 停止MySQL服务

  1. 通过Windows服务管理器启动MySQL服务

  通过Windows的运行，输入services.msc找到MySQL服务

  1. 通过DOS命令启动MySQL服务

     et stop mysql	停止MySQL服务

     et start mysql	开启MySQL服务

  ### 登录MySQL数据库

  **使用相关命令登录**

  打开命令台：

  mysql -h localhost -P 3306 -u root -p

  -h：主机名

  -P：端口

  -u：用户名

  -p：密码

  这种方式一般用来连接远程数据库服务器

  mysql默认连接localhost和3306，所以可以省略-h和-P

  mysql -u root -p

  这种方式一般用来连接本机，可以省略-h和-P，默认就是localhost和3306

  #### 创建数据库

  **CREATE** DATABASE [IF **NOT EXISTS**] db_name;

  创建   数据库	数据库名;

  注意：一定要在语句的末尾加分号

  注意：中括号都表示可选的意思，不是让你把中括号也写进入，否则mysql根本不识别。

  #### 查看数据库

  show database;

  #### 删除数据库

  **DROP** DATABASE [IF **EXISTS**] db_name;

  #### 选择数据库

  USE db_name;

  ![1529595880482](1529595880482.png)

  ### 数据库表的概念

  ​       我们的数据是面向表存储的，数据库表格式用来存储数据的，这个我们现实当中的表一样，我们首先需要定义表当中有多少列，然后我们可以往表当中添加一条一条的记录。我们在定义一张表的列时，我们需要先根据需求对这张表进行设计，设计一般主要是设计表当中有哪些列，这一列对应的名称是什么，它所存放的数据类型是什么，这个我们也称为表结构的设计。所以在学习表的设计之前，我们需要学习表的一些相关知识.

  ##### 数据类型

  数据类型是用来约束表当中每一列存放的数据类型。这样做的目的是为了

  ##### 整数类型

  ![1528941073882](../../day_01/%E7%AC%94%E8%AE%B0/1528941073882.png)

  ##### 日期和时间

  ![1528941148564](../../day_01/%E7%AC%94%E8%AE%B0/1528941148564.png)

  ##### 字符串和二进制

  ![1528941111089](../../day_01/%E7%AC%94%E8%AE%B0/1528941111089.png)

  

  ### 数据库表的基本操作

  #### 创建数据库表

  ```
  CREATE TABLE table_name
  (
      field1  datatype,
      field2  datatype,
      field3  datatype,
  )
  ```

  #### 查看数据表

  查看当前数据库中的所有表。

  ```
  show tables;
  ```

  查看表结构

  ```
  desc table_name;
  ```

  查看建表语句

  ```
  show create table table_name;
  ```

  #### 删除数据表

  ```
  DROP TABLE table_name;
  ```

  ### 表的约束

  为了防止数据表中插入错误的数据，在MySQL中，定义了一些维护数据库完整性的规则，即表的约束。

  约束是用来约束每一列的整个数据的，保证这个数据的完整性。

  | 约束条件    | 说明                             |
  | ----------- | -------------------------------- |
  | PRIMARY KEY | 主键约束，用于唯一标识对应的记录 |
  | FOREIGN KEY | 外键约束                         |
  | NOT NULL    | 非空约束                         |
  | UNIQUE      | 唯一性约束                       |
  | DEFAULT     | 默认值约束，用于设置字段的默认值 |

  表的约束条件都是针对表中字段进行限制，从而保证数据表中数据的正确性和唯一性。

  ### 数据处理

  #### 增加数据

  ```
  INSERT INTO table_name VALUES(value1,value2,value3...);
  
  INSERT INTO employee(username,PASSWORD,loginName) VALUES('小旋风','111111','xiaoxuanfeng@kaikeba.com');
  ```

  #### 修改数据

  ```
  UPDATE table_name     SET col_name1=expr1 , col_name2=expr2  where condition;
  UPDATE employee SET username='caidaguanren' WHERE id=2;
  ```

  #### 删除数据

  ```
  delete from** table_name  [WHERE where_definition];
  DELETE FROM employee WHERE id =1;
  ```

  #### 查询数据

  ```
  SELECT [DISTINCT] *|{colum1, colum2, colum3...} FROM table_name;
  SELECT指定查询哪些列的数据
  column指定列名
  * 号表示查询所有列
  FROM 指定查询哪种表
  DISTINCT 可选，指查询结果时，是否去除重复数据
  SELECT COUNT(*) FROM employee; 统计某张表里面的数据的数量
  SELECT * FROM employee
  SELECT * FROM employee  where columnName= value;
  
  ```

  ### SQLYong 的介绍

  它是一个基于图形化界面的mysql 客户端软件，通过此软件，我们可以通过图形化界面的方式去连接数据库，

  创建表，增删改查数据。整个操作都是基于图形化界面的，避免我们编写大量的sql 语句，提升我们的开发效率。

  ![1529595927168](1529595927168.png)

  ## php 连接mysql 数据库

  ### 前端部分

  ### php 部分

  #### 注册 往数据库里面添加一条记录

  ```
  /*
  响应的数据
  */
  header('Content-Type:text/json;charset=utf-8');
  /*
  连接数据库
  账号，密码
  */
  $con = mysql_connect("127.0.0.1","root","");
  if (!$con){
  	die('Could not connect: ' . mysql_error());
  }
  //连接那个数据
  mysql_select_db("kaikeba", $con);
   //sql 语句
  //把客户端获取到的值，往数据库里面添加
  $sql="INSERT INTO teacher (username, telephone, age,t_desc); VALUES('$_POST[username]','$_POST[telephone]','$_POST[age]','$_POST[desc]','$_POST[lifephoto]')";
  //通过连接发送sql语句;     
  if (!mysql_query($sql,$con)){
   	die('Error: ' . mysql_error());
  };
  //关闭跟数据库的连接
  mysql_close($con);
  ```

  #### 登录 (从数据库里面查询一条记录)

  ```
   //给客户端一个响应头，响应json 格式的数据.
   header('Content-Type:application/json;charset=utf-8');
  //连接数据库 得到连接
   $con = mysql_connect("127.0.0.1","root","");
   if (!$con){
     die('Could not connect: ' . mysql_error());
  }
  //连接那个数据库  pdj 数据
  mysql_select_db("pdj", $con);
  $result = mysql_query($sql);
  //定义了一个空数组.
  $list = array();
  $total = 0;
  //把数据库里面返回的结果$result 遍历出来
  //放在$list 空的数据里面.
  while($row = mysql_fetch_array($result)){
  $item = array(
      'id' => $row['id'],
      'username' => $row['username'],
      'telephone' => $row['telephone'],
      'age' => $row['age'],
      't_desc' => $row['t_desc'],
      'lifephoto' => $row['lifephoto'],
  );
  //往数组里面添加一条记录.
  array_push($list,$item);
  //总记录数
  $total = $row['total'];
  }
  echo "<a href=''>kaikeba</a>";
  mysql_close($con);
  ```

  #### 修改密码 (更改数据库的数据);

  ## cookie

  ### cookie 概念

  ![1529595997121](1529595997121.png)

  ​	什么是Cookies（“小甜饼”）呢？简单来说，Cookies就是服务器暂时存放在你的电脑里的资料（.txt格式的文本文件），好让服务器用来辨认你的计算机。当你在浏览网站的时候，Web服务器会先送一小小资料放在你的计算机上，Cookies 会把你在网站上所打的文字或是一些选择都记录下来。当下次你再访问同一个网站，Web服务器会先看看有没有它上次留下的Cookies资料，有的话，就会依据Cookie里的内容来判断使用者，送出特定的网页内容给你。 

  怎么去使用：

  服务端：怎么发送cookie (setcookie() 函数用于设置 cookie );

  ```
  setcookie("user", "Alex Porter", time()+3600); 服务端向客户端设置cookie
  ```

  客户端：怎么获取cookie

   var cookies=document.cookie;

  ###cookie 的生命周期

  ![1529595967003](1529595967003.png)

  ##### 内存cookie

  ```
  setcookie("user", "zhuwu");  如果不设置时间，默认就是内存cookie ，当浏览器关闭，客户端会把cookie 清空，整个周期在浏览器的内存当中。
  ```

  ##### 硬盘cookie

  ```
  header("Content-Type:text/html;charset=utf-8");
  //设置当前cookie 的时间为一天。
  setcookie("user", "zhuwu",time()+3600*24);
  echo "php cookie";
  ```

  ##### 追杀cookie

  ```
  把cookie 的value 设置为空，失效时间改成-1 这样即是追杀cookie，把客户端成cookie 清楚。
  setcookie("user", "",-1);
  ```

  ###具体作用:

  ​		http 协议是基于请求响应的协议，请求-->响应，连接断开。没有办法记录客户端的状态。也就没有办法对用户的行为进行跟踪，我们可以根据cookie 对用户进行状态的跟踪,。

  cookie流程：当第一次访问服务器，服务器可以向客户端发送cookie，可以往cookie 当中存入需要的数据。

  客户端如果接收到服务器端响应的cookie，会把cookie 自动保存起来。当客户端再次请求服务器的时候，

  浏览器会自动把客户端cookie 的数据发送到服务器。

  ## session

  ### session 概念

  session  代表的就是一次会话。会话在我们的现实过程当中有很多，

  比如我们拨打10086，在10086，当10086 接通时，代表我的会话开始，中间我可能发送多次动作交谈，直至挂断，会话结束。整个会话过程当中，我们可能会发送多次请求。由多次请求组成一次会话。

  那什么代表我们的网站会话嘞，我们可以这么理解，打开网站，访问我的网站时会话开始，在这个网站当中我可能发送多次请求，直至关闭浏览器会话结束。这整个过程当中我们可以理解成一次会话.

  http 协议是基于请求响应的，无状态的，一次会话当中包含多个请求，每个请求都是相互独立的，会话当中包含多个请求，我们需要在请求之间共享数据，所以这个时候，我们就需要使用到会话。

  ###session 的使用

  ​    我们可以在一个站点发送两次请求，我们知道每个请求都是独立的，他们是不能共享数据，这个时候我们使用session 会话，让两个请求之间可以共享数据。

  php 服务器端创建会话:

  ```
  session_start();  会话开始
  $_SESSION[]	 往改数组里面保存数据。	
  session 的 默认时间在php 里面是24 分钟。
  ```

  ###session 的原理

  

  ###session 的应用

  用户登录

  

##HTTP服务&AJAX编程

###上次内容复习

- mysql 的存储方式

```
 一个数据库服务器中可以有多个数据库  
 一个数据库当中可以有多张表用来存储数据 
 一个表中可以用来存储多条记录 
```

- 数据库操作

```
创建数据库
CREATE DATABASE [IF **NOT EXISTS**] db_name;
查看数据库
show database;
删除数据库
DROP DATABASE [IF EXISTS] db_name;
选择数据库
USE db_name;
```

- 数据库表

  ```
  我们的数据是面向表存储的，数据库表格式用来存储数据的，这个我们现实当中的表一样，我们首先需要定义表当中有多少列，然后我们可以往表当中添加一条一条的记录。我们在定义一张表的列时，我们需要先根据需求对这张表进行设计，设计一般主要是设计表当中有哪些列，这一列对应的名称是什么，它所存放的数据类型是什么，这个我们也称为表结构的设计。所以在学习表的设计之前，我们需要学习表的一些相关知识.
  ```

  ```
  数据类型,整数类型,日期和时间,字符串和二进制
  ```

  ```
  数据库表的操作
  查看当前库下面所有的表
  show tables;
  查看表结构
  desc table_name;
  查看建表语句
  show create table table_name;
  删除数据表
  DROP TABLE table_name;
  ```

  ```
  表的约束
  为了防止数据表中插入错误的数据，在MySQL中，定义了一些维护数据库完整性的规则，即表的约束。
  约束是用来约束每一列的整个数据的，保证这个数据的完整性。
    约束条件       	说明              
    PRIMARY KEY	主键约束，用于唯一标识对应的记录
    FOREIGN KEY	外键约束            
    NOT NULL   	非空约束            
    UNIQUE     	唯一性约束           
    DEFAULT    	默认值约束，用于设置字段的默认值
  表的约束条件都是针对表中字段进行限制，从而保证数据表中数据的正确性和唯一性。
  ```

  - 增加数据

    ```
    INSERT INTO table_name VALUES(value1,value2,value3...);
    ```

    修改数据

    ```
    UPDATE table_name     SET col_name1=expr1 , col_name2=expr2  where condition;
    UPDATE employee SET username='caidaguanren' WHERE id=2;
    ```

    删除数据

    ```
    delete from** table_name  [WHERE where_definition];
    DELETE FROM employee WHERE id =1;
    ```

    查询数据

    ```
    SELECT [DISTINCT] *|{colum1, colum2, colum3...} FROM table_name;
    SELECT指定查询哪些列的数据
    column指定列名
    * 号表示查询所有列
    FROM 指定查询哪种表
    DISTINCT 可选，指查询结果时，是否去除重复数据
    SELECT COUNT(*) FROM employee; 统计某张表里面的数据的数量
    SELECT * FROM employee
    SELECT * FROM employee  where columnName= value;
    ```

    SQLYong 的介绍

    ```
    它是一个基于图形化界面的mysql 客户端软件，通过此软件，我们可以通过图形化界面的方式去连接数据库，创建表，增删改查数据。整个操作都是基于图形化界面的，避免我们编写大量的sql 语句，提升我们的开发效率。
    ```

### 页面+php+mysql 增删改查

- 前端页面

  ```
  页面通过表单发起登录请求.
  <form action="../api/login.php" method="post">
       登录名：<input type="text" name="loginName"> <br><br>
       密码:<input type="text" name="password"><br><br>
      <input type="submit" value="登录">
  </form>
  ```

- php 后台

  ```
  <?php
  
              header("Content-Type:text/html;charset=utf-8");
              //接收请求，处理请求，完成响应.
              //接收请求
              $loginName=$_POST['loginName'];
              $password=$_POST['password'];
  //处理请求。获取到用户名跟密码，到数据库里面进行查询，有没有这样的一条记录，有就代表登录成功.
  //否则就是用户名或密码错误.建立数据库连接，跟哪个库建立连接，准备sql 语句，发送sql 语句，等待响应的结果，根据结果进行响应.	
              $con = mysql_connect("127.0.0.1","root","");
              if (!$con){
              	die('Could not connect: ' . mysql_error());
              }
  $sql="select * from employee where loginName='$loginName' and password='$password'";
  //连接那个数据库  pdj 数据
  mysql_select_db("huike", $con);
  //查询，响应一个结果。返回的结果都在这个$result
  $result = mysql_query($sql); //
  $item=array();
  //怎么去获取这个结果.
  while($row=mysql_fetch_array($result)){
                      // $row 代表的是一条记录，代表是一行.
                      $item=array(
                           "id"=> $row['id'],
                           "username"=>$row['username'],
                           "password"=> $row['password'],
                           "loginName"=>$row['loginName']
                      );
  }
  //根据结果进行判断,进行输出.
  if(count($item)>0){
      	 echo "登录成功";
  }else{
     		 echo "登录失败，用户名或者密码错误";
  }
  ?>
  ```

- 数据库

  ```
  建表语句，可以通过图形化界面建表，然后使用SHOW CREATE TABLE USER; 查看建表语句。
  CREATE TABLE user (
  
    id int(11) NOT NULL AUTO_INCREMENT,
  
    username varchar(100) COLLATE utf8_bin DEFAULT NULL,
  
    password varchar(100) COLLATE utf8_bin DEFAULT NULL,
  
    PRIMARY KEY (id)
  
  ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin
    			
  ```

### cookie 的使用

####概念 

```
什么是Cookies（“小甜饼”）呢？简单来说，Cookies就是服务器暂时存放在你的电脑里的资料（.txt格式的文本文件），好让服务器用来辨认你的计算机。当你在浏览网站的时候，Web服务器会先送一小小资料放在你的计算机上，Cookies 会把你在网站上所打的文字或是一些选择都记录下来。当下次你再访问同一个网站，Web服务器会先看看有没有它上次留下的Cookies资料，有的话，就会依据Cookie里的内容来判断使用者，送出特定的网页内容给你。
```

#### cookie 的基本使用

```
服务端：怎么发送cookie (setcookie() 函数用于设置 cookie );
setcookie("user", "Alex Porter", time()+3600); 服务端向客户端设置cookie
客户端：怎么获取cookie
 var cookies=document.cookie;
```

####cookie 的生命周期

##### 内存cookie

```
setcookie("user", "zhuwu");  如果不设置时间，默认就是内存cookie ，当浏览器关闭，客户端会把cookie 清空，整个周期在浏览器的内存当中。
```

##### 硬盘cookie

```
header("Content-Type:text/html;charset=utf-8");
//设置当前cookie 的时间为一天。
setcookie("user", "zhuwu",time()+3600*24);
echo "php cookie";
```

##### 追杀cookie

```
把cookie 的value 设置为空，失效时间改成-1 这样即是追杀cookie，把客户端成cookie 清楚。
setcookie("user", "",-1);
```

####具体作用

```
http 协议是基于请求响应的协议，请求-->响应，连接断开。没有办法记录客户端的状态。也就没有办法对用户的行为进行跟踪，我们可以根据cookie 对用户进行状态的跟踪,。
cookie流程：当第一次访问服务器，服务器可以向客户端发送cookie，可以往cookie 当中存入需要的数据。
客户端如果接收到服务器端响应的cookie，会把cookie 自动保存起来。当客户端再次请求服务器的时候，
浏览器会自动把客户端cookie 的数据发送到服务器。
```

### session (session 的概念，使用，原理，案例)

####概念 

```
session  代表的就是一次会话。会话在我们的现实过程当中有很多，
比如我们拨打10086，在10086，当10086 接通时，代表我的会话开始，中间我可能发送多次动作交谈，直至挂断，会话结束。整个会话过程当中，我们可能会发送多次请求。由多次请求组成一次会话。(一个会话由多次请求组成)
web会话 
	那什么代表我们的网站会话嘞，我们可以这么理解，打开网站，访问我的网站时会话开始，在这个网站当中我可能发送多次请求，直至关闭浏览器会话结束。这整个过程当中我们可以理解成一次会话.http 协议是基于请求响应的，无状态的，一次会话当中包含多个请求，每个请求都是相互独立的，会话当中包含多个请求，我们需要在请求之间共享数据，所以这个时候，我们就需要使用到会话。
	一个网站的会话由多次http请求组成，http 请求是无状态的，是基于请求响应的，每个请求又都是相互独立的
一次会话范围内要进行数据的共享，每个请求都是独立，就不能进行数据的共享。
无状态：请求--》响应  连接断开。我要在一个会话范围内进行数据共享，这个时候我们就需要使用session.
```

####php session使用

```
服务器获取一个session   session_start();  会话开始
获取到session 对象    $_SESSION[] 获取到对象，往里面保存数据	
session 的默认存储时间.
```

####原理

![1529754797060](1529754797060.png)

![1529768661703](1529768661703.png)

####实际应用

保存用户登录的状态，当我登录的时候，如果登录成功，服务器把user 保存在session 当中。

#### cookie 与session 对比 

cookie    cookie 是存储在客户端，它是服务器想客户端保存数据。记住用户名。

sessionStroage

客户端的存储，基于html5 ，也是本地存储。生命周期。

localstorage

本地存储，它是实例化到本地的硬盘。

session 

存储在服务器的，依赖cookie。

需求：我要进入到一个页面，这个页面如果是用户已经登录了，我就欢迎欢迎，热烈欢迎。

没有登录，跳转到登录页面。

作业：注销登录。



### ajax

``` 
同步交互：客户端给服务器发送请求，服务器给客户端一个响应，响应回来的数据会把客户端的界面给覆盖，我们把这种交互称为同步交互。
```

```
异步交互:客户端给服务器发送一个请求，服务器给客户端一个响应，响应回来的数据不会把原来的页面覆盖掉，这种我们称为异步交互。
```

ajax 的概念：ajax 就是实现页面不刷新，可以直接获取服务器端数据。

ajax 的原理：利用XMLHttpRequest 发送请求，接收请求的数据.

![1529768837432](1529768837432.png)

ajax 的应用

```
//利用XMLHttpRequest对象去进行交互.
//交互分为四步
//1:创建对象
var xhr=new XMLHttpRequest();
//2:打开连接
//提交方式，提交的地址
xhr.open("get","login.php?username=zhangsan");
//3:发送数据
xhr.send(null);
//4:接收数据，只能通过异步的方式，就是只能通过回调函数的方式.
//时刻监听这服务器端状态的改变. onreadystatechange 也是xhr 的一个属性.
xhr.onreadystatechange=function(){
         //服务器数据响应成功之后会调用这个函数.

        //因为我跟服务器进行交互，服务器会进行处理
        //在处理的过程当中会不断的给我一些状态.  0,1,2,3，4
        //每个状态代表的是不同的含义
        //状态我通过xhr 去获取到试一下.
        //readyState 属性去获取到
        //如果状态等于 4 代表响应完成
        if(xhr.readyState==4){  //响应完成.
                //console.log("响应完成") 如果响应的是200 才代表响应成功
                //我们要获取到服务器端状态吗.
                if(xhr.status==200){
                    //真正的处理.
                    //响应完成的，响应是成功的.
                    //接收服务器端返回的数据.responseText 用来接收服务器响应的数据的
                    var data=xhr.responseText;
                    document.querySelector("span").innerHTML=data;
                }
        }
}

get 交互与post 交互需要注意的细节:
get 注意：请求的参数在地址栏当中，send 方法不能省略
post 注意需要有一个特殊的请求头 Content-Type: application/x-www-form-urlencoded
请求的参数写在send 里面
```

作业：检测用户名是否已经存在






#HTTP服务&AJAX编程

###上次内容复习

####session

```
session 的概念
session 在php 的基本使用
session 的原理  
session 的应用  登录之后把用户的信息保存在后台服务器的sesison 里面。
cookie 与session 的区别
作业：注销登录
```

#### ajax

```
ajax 的概念 
同步交易以及异步交互的概念.
(页面不刷新就可以与服务器进行数据交互)
ajax 的原理 (使用XMLHttpRequest 对象发送http 请求，接收服务器响应的数据) 
ajax 的基本交互流程 (创建对象，打开连接，发送数据，接收数据)
ajax get交互与post 交互
get 交互请求的数据都在地址的后面，send() 方法不能省略
post 方式提交需要设置特殊的请求头 Content-Type:application/form-data
作业:检测用户名是否存在
```

问题：我们做ajax 异步交互，是页面不刷新就可以去获取服务器的数据，我刚刚获取的数据非常的简单，实际开发过程当中，我们去请求的服务器的数据返回的数据是非常复杂的。为了这个服务器返回的数据到客户端方便解析

这个时候就市场上面出现新的数据格式。

xml，必有历史悠久的一个数据格式。早起的这种系统都是使用xml

json，互联网的项目的数据交互都是采用json

有一些大型的公司，它要对外提供接口，让别人去调用，它也要响应数据格式。一般他们都会支持两种数据格式.

### XML 格式数据

####概念 

XML是一种标记语言，很类似HTML，其宗旨是用来传输数据，具有自我描述性（固定的格式的数据）。软件的配置文件。 可扩展标记语言.

![img](wps5310.tmp.jpg)�记�3[C�

1、必须有一个根元素，xml 也是由标签组成。开始标签，结束标签

2、不可有空格、不可以数字或.开头、大小写敏感

3、可以嵌套，不可交叉嵌套

4、属性双引号（浏览器自动修正成双引号了）

5、特殊符号要使用实体

6、注释和HTML一样

虽然可以描述和传输复杂数据，但是其解析过于复杂并且体积较大，所以实现开发已经很少使用了。

#### 使用

#####服务端  服务器怎么去响应xml 格式的数据，

```
怎么去响应xml 格式的数据
设置一个响应头,告诉客户端，服务器返回的是一个xml 格式的文本。
header("Content-Type:text/xml;charset=utf-8");
输出XML格式的数据
echo "";
```

#####客户端 

```
怎么去接收XML格式的数据并解析，
xml 跟 html 的语法非常相似，解析html 的时候我们使用dom 对象，然后调用dom 的api 去进行解析.
xml 假设可以转换成html，就可以按照html 方式去进行解析。

怎么将xml 数据的格式，转换成dom 对象
1:服务器，必须设置一个响应头  Content-Type:text/xml;charset=utf-8
2:客户端接收数据，接收普通文本  responseText，接收的是有格式的xml

使用 xhr.responseXML;
```

### JSON 格式数据

#### 概念

```
即 JavaScript Object Notation，另一种轻量级的文本数据交换格式，独立于语言。
```

#### 语法规则

```
json 的数据格式是以键值对的方式进行存储,key=value,key=value
数据在名称/值对中
数据由逗号分隔(最后一个健/值对不能带逗号)
花括号保存对象方括号保存数组
使用双引号
```

#### 怎么表示数据

```
表示一条记录
{"id":11,"username":"xiaoqin","loginName":"xiaoxuanfeng","password":"111111"}
表示多条记录(数组)
[
    {"id":11,"username":"xiaoqin","loginName":"xiaoxuanfeng","password":"111111"},
    {"id":22,"username":"heixuanfeng","loginName":"heixuanfeng","password":"111111"}
]
表示复杂数据
{
	    response:{
            	rows:[
       		 {"id":11,"username":"xiaoqin","loginName":"xiaoxuanfeng","password":"111111"},
        	 {"id":22,"username":"heixuanfeng","loginName":"heixuanfeng","password":"111111"}
			]
	    },
        "status":200
}

```

json 格式数据使用

```
服务器端怎么发送json 格式的数据
   实际上在开发的过程当中，服务器返回的数据都是从数据库取出来的，取出来的可能是一条记录，也可能是多条记录，我们怎么把这些格式的数据响应到客户端，然后在客户端进行解析。
   
服务端：
	 怎么将数据库的数据获取到转换成json 格式的数据，向客户端输出。
	 header("Content-Type:text/json;charset=utf-8");
客户端：
     怎么接收到服务器端返回的数据并解析.		
	 第一种解析方式:  eval();
     第二种解析方式:  JSON.parse();
```

案例：异步去获取服务器的用户的数据

### ajax 封装



我为什么要封装一个ajax，封装的主要目的，一个页面可能发多次ajax 请求，每次请求的都是4步，创建对象，

打开连接，发送数据，接收数据。调用一次，写一次这样的代码，太累了。所以，我们需要封装到一个方法里面去.在一个页面可能发送多次请求，每次请求的时候时候都需要调用这段代码.这样的话不利于我们去维护代码，以及会有代码冗余。

```
//利用XMLHttpRequest对象去进行交互.
//交互分为四步
//1:创建对象
var xhr=new XMLHttpRequest();
//2:打开连接
//提交方式，提交的地址
xhr.open("get","login.php?username=zhangsan");
//3:发送数据
xhr.send(null);
//4:接收数据，只能通过异步的方式，就是只能通过回调函数的方式.
//时刻监听这服务器端状态的改变. onreadystatechange 也是xhr 的一个属性.
xhr.onreadystatechange=function(){
         //服务器数据响应成功之后会调用这个函数.
         //因为我跟服务器进行交互，服务器会进行处理
        //在处理的过程当中会不断的给我一些状态.  0,1,2,3，4
        //每个状态代表的是不同的含义
        //状态我通过xhr 去获取到试一下.
        //readyState 属性去获取到
        //如果状态等于 4 代表响应完成
        if(xhr.readyState==4){  //响应完成.
                //console.log("响应完成") 如果响应的是200 才代表响应成功
                //我们要获取到服务器端状态吗.
                if(xhr.status==200){
                    //真正的处理.
                    //响应完成的，响应是成功的.
                    //接收服务器端返回的数据.responseText 用来接收服务器响应的数据的
                    var data=xhr.responseText;
                    document.querySelector("span").innerHTML=data;
                }
        }
}
```

  封装第一步，把相同的逻辑提炼到一个方法

```
//这个函数可以实现基本的功能
            //发送请求，接收数据，还可以支持get 发送，以及post 发送
            function ajax(type,url,data,success){
                  var xhr=new XMLHttpRequest();
                  //因为get 方式提交，请求的参数在地址的后面.
                  url=url+"?"+data;
                  xhr.open(type,url);
                  xhr.send(null);
	//这个是一个回调函数，这个函数不会立即执行，这个函数需要等待服务器响应数据的时候才会执行
                  xhr.onreadystatechange=function(){
                       //服务端的数据响应完毕以及响应成功的时候才会执行下面的代码.
                       if(xhr.readyState==4 && xhr.status==200){
                          //响应回来的数据
                          var data1=xhr.responseText;
                         //调用函数.
                          success(data1);
                       }
           }
}
```

封装的这个函数需要支持get 以及post 方式提交.

```
 function ajax(type,url,data,success){
                    var xhr=new XMLHttpRequest();
                    //进行一个处理，用户可能get 方式提交，也可能post方式提交.
                    //要让type 的提交方式支持大小写
                    type=type.toLocaleLowerCase();  //将一个字符串转换为小写.
                    if(type=="get"){
                         url=url+"?"+data;
                         data=null;
                    }
                    xhr.open(type,url);
                    //如果是post 方式提交，需要设置一个请求头
                    if(type=="post"){
                         xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                    }
                    xhr.send(data);
                    xhr.onreadystatechange=function(){
                         if(xhr.readyState==4 && xhr.status==200){
                              var data=xhr.responseText;
                              //请求的数据完成以及成功的时候调用.
                              success(data);
                         }
                    }
            }
```

传递参数太多为了方便维护，把参数封装在一个对象里面。

```
 function ajax(obj){
            var xhr=new XMLHttpRequest();
            //进行一个处理，用户可能get 方式提交，也可能post方式提交.
            //要让type 的提交方式支持大小写
            obj.type=obj.type.toLocaleLowerCase();  //将一个字符串转换为小写.
            if(obj.type=="get"){
                obj.url=obj.url+"?"+obj.data;
                obj.data=null;
            }
            xhr.open(obj.type,obj.url);
            //如果是post 方式提交，需要设置一个请求头
            if(obj.type=="post"){
                xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
            }
            xhr.send(obj.data);
            xhr.onreadystatechange=function(){
                if(xhr.readyState==4 && xhr.status==200){
                    var data=xhr.responseText;
                    //请求的数据完成以及成功的时候调用.
                    obj.success(data);
                }
            }
        }
```

为了避免自己封装的函数跟其它的库不产生冲突，把封装的方法火山属性包装在一个函数里面。

```
//一般我们都是以面向对象的方式去组织页面上面的代码
        //将方法，以及属性包在一个对象里面.
        var $={
             ajax:function(obj){
                 var xhr=new XMLHttpRequest();
                 //进行一个处理，用户可能get 方式提交，也可能post方式提交.
                 //要让type 的提交方式支持大小写
                 obj.type=obj.type.toLocaleLowerCase();  //将一个字符串转换为小写.
                 if(obj.type=="get"){
                     obj.url=obj.url+"?"+obj.data;
                     obj.data=null;
                 }
                 xhr.open(obj.type,obj.url);
                 //如果是post 方式提交，需要设置一个请求头
                 if(obj.type=="post"){
                     xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                 }
                 xhr.send(obj.data);
                 xhr.onreadystatechange=function(){
                     if(xhr.readyState==4 && xhr.status==200){
                         var data=xhr.responseText;
                         //请求的数据完成以及成功的时候调用.
                         obj.success(data);
                     }
                 }
             }
        };
```

封装扩展

```
  var $={
                  //新增的函数，函数的功能，将一个对象转换成字符串
                  params:function(obj){
                        //将对象的key 作为参数名，key 对应的值作为参数值。这个地方怎么编写逻辑.
                        var str="";
                        //username=zhangsan&age=11&sex=nan
                        for(var key in obj){
                             str+=key+"="+obj[key]+"&";
                        }
                        //组装的字符串多了一个&,截取之后返回一个新的字符串
                        str=str.substr(0,str.length-1);
                        return str;//出来是要发送到后台的数据，参数名，参数值.
                  },
                  ajax:function(obj){
                         //1:创建对象
                         var xhr=new XMLHttpRequest();
                         //新增功能1:我要处理，这个data 对应的值支持是一个对象
                         //将 对象={username:"zhangsan",age:11,sex:"nan"}  转换成 字符串的格式  username=zhangsan&age=11&sex=nan

                         //新增功能4：请求发送之前调用. 如果该函数return false ，我就组织改代码继续往下执行.
                         var flag=obj.beforeSend();
                         if(flag==false){
                                return;
                         }
                         //对obj.data 的类型进行判断，如果是对象类型，我才去进行处理.
                         if(typeof obj.data=="object"){
                              //在这里进行处理
                              //提炼一个方法，参数是obj={} 出来的字符串username=zhangsan&age=11&sex=nan
                              //this 现在指向到 $
                               obj.data=this.params(obj.data);
                         }
                         //2:打开对象
                         //注意：如果是get 方式提交，参数在地址的后面
                         if(obj.type.toLowerCase()=="get"){
                             obj.url=obj.url+"?"+obj.data;
                             obj.data=null;
                         }
                         xhr.open(obj.type,obj.url);
                         //注意：处理post 我们需要给一个请求头
                         if(obj.type.toLowerCase()=="post"){
                             xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                         }
                        //3:发送数据
                         xhr.send(obj.data);
                        //4:接收数据
                         xhr.onreadystatechange=function(){
                               if(xhr.readyState==4){  //响应完成
                                      if(xhr.status==200){ //响应成功
                                            var data=xhr.responseText;
                                            obj.success(data);
                                      }else{
                                            //失败的时候去调用error
                                            //新增功能2
                                            obj.error();
                                      }
                                      //新增功能3
                                      //请求完成的时候调用
                                      obj.complete();
                               }
                         }
                  }
            }
```

完整封装

```
var $={
    //新增的函数，函数的功能，将一个对象转换成字符串
    params:function(obj){
        //将对象的key 作为参数名，key 对应的值作为参数值。这个地方怎么编写逻辑.
        var str="";
        //username=zhangsan&age=11&sex=nan
        for(var key in obj){
            str+=key+"="+obj[key]+"&";
        }
        //组装的字符串多了一个&,截取之后返回一个新的字符串
        str=str.substr(0,str.length-1);
        return str;//出来是要发送到后台的数据，参数名，参数值.
    },
    ajax:function(obj){
        //1:创建对象
        var xhr=new XMLHttpRequest();
        //新增功能1:我要处理，这个data 对应的值支持是一个对象
        //将 对象={username:"zhangsan",age:11,sex:"nan"}  转换成 字符串的格式  username=zhangsan&age=11&sex=nan

        //新增功能4：请求发送之前调用. 如果该函数return false ，我就组织改代码继续往下执行.
        //console.log(obj.beforeSend);
        if(obj.beforeSend){ //因为用户在调用的时候，可能没有传递,所以需要进行判断.
            var flag=obj.beforeSend();
            if(flag==false){
                return;
            }
        }
        //对obj.data 的类型进行判断，如果是对象类型，我才去进行处理.
        if(typeof obj.data=="object"){
            //在这里进行处理
            //提炼一个方法，参数是obj={} 出来的字符串username=zhangsan&age=11&sex=nan
            //this 现在指向到 $
            obj.data=this.params(obj.data);
        }
        //2:打开对象
        //注意：如果是get 方式提交，参数在地址的后面
        if(obj.type.toLowerCase()=="get"){
            obj.url=obj.url+"?"+obj.data;
            obj.data=null;
        }
        xhr.open(obj.type,obj.url);
        //注意：处理post 我们需要给一个请求头
        if(obj.type.toLowerCase()=="post"){
            xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
        }
        //3:发送数据
        xhr.send(obj.data);
        //4:接收数据
        xhr.onreadystatechange=function(){
            if(xhr.readyState==4){  //响应完成
                if(xhr.status==200){ //响应成功
                    var data=xhr.responseText;
                    obj.success(data);
                }else{
                    //失败的时候去调用error
                    //新增功能2
                    //等价于
                   /* if(obj.error){
                        obj.error();
                    }*/
                    obj.error && obj.error();

                }
                //新增功能3
                //请求完成的时候调用
                // if(obj.complete){
                //     obj.complete();
                // }
                    obj.complete && obj.complete();

            }
        }
    }
}
```




## HTTP服务&AJAX编程  

###上次内容复习

```
xml数据格式的概念
服务端怎么响应xml
客户端怎么解析xml
json数据格式的概念
json客户端的解析方式
xml,json 只是常见的两种数据格式，开发当中，实际还有其它的数据格式，还可以自定义数据.
需要单独开发客户端，以及单独开发服务端的时候需要使用到自定义的数据格式. 游戏开发过程当中.
ajax封装 底层是封装的 XMLHttpRequest 对象.

作业:

```

#### 上节课作业

```
 	让封装的方法data 的值支持 {} 。
 	//新增的函数，函数的功能，将一个对象转换成字符串
    params:function(obj){
        //将对象的key 作为参数名，key 对应的值作为参数值。这个地方怎么编写逻辑.
        var str="";
        //username=zhangsan&age=11&sex=nan
        for(var key in obj){
            str+=key+"="+obj[key]+"&";
        }
        //组装的字符串多了一个&,截取之后返回一个新的字符串
        str=str.substr(0,str.length-1);
        return str;//出来是要发送到后台的数据，参数名，参数值.
    }
```

###jQuery  ajax 封装

```
$.ajax({
   type: "POST",
   url: "some.php",
   data: "name=John&location=Boston",
   success: function(msg){
       alert( "Data Saved: " + msg );
   }
});
```

table 样式

```
 <style>
        table {
            width: 600px;
            border-collapse: collapse;
        }
        td {
            height: 40px;
            text-align: center;
            border: 1px solid #CCC;
        }
 </style>
```

## 模板引擎

​       模板作用:我们ajax 开发一般都是通过XMLHttpRequest 发送请求，然后服务器返回数据，当我们通过js 得到数据之后，然后通过解析json 的方式去解析数据，解析完json 之后，我们再将数据通过dom 的方式放在页面上面。如果json 的数据格式特别复杂，我们可能要做很多的js 凭借，非常麻烦，性能也非常低下。这个时候我们就需要用到模板：我们可以在模板里面解析json，然后跟html 内容拼接，性能会更好。

###流行模板引擎

**BaiduTemplate**：http://tangram.baidu.com/BaiduTemplate/  b百度

**ArtTemplate：**https://github.com/aui/artTemplate  t腾讯

**velocity.js**：https://github.com/shepherdwind/velocity.js/ a阿里

**Handlebars：**http://handlebarsjs.com/

**参考资料:**

http://blog.jobbole.com/56689/

## 1.3 **artTemplate**

1、引入template-native.js

2、<% 与  %> 符号包裹起来的语句则为模板的逻辑表达式

3、<%= content %>为输出表达式

使用步骤:

- 引入模板文件
- 创建模板
- 将数据跟模板进行绑定
- 在模板里面编写代码解析数据
- 绑定数据和模板之后得到内容
- 将数据内容写到页面上面。

# 同源&跨域

###跨域的概念

从一个站点访问一个资源，然后在这个资源当中又去访问另外的一个站点的资源，这个就是跨域。

### 同源

同源策略是浏览器的一种安全策略，所谓同源是指，域名，协议，端口完全相同。

### 跨域

不同源则跨域

例如http://www.example.com/

| http://api.example.com/detail.html       | 不同源 | 域名不同       |
| ---------------------------------------- | ------ | -------------- |
| https//www.example.com/detail.html       | 不同源 | 协议不同       |
| http://www.example.com:8080/detail.html  | 不同源 | 端口不同       |
| http://api.example.com:8080/detail.html  | 不同源 | 域名、端口不同 |
| https://api.example.com/detail.html      | 不同源 | 协议、域名不同 |
| https://www.example.com:8080/detail.html | 不同源 | 端口、协议不同 |
| http://www.example.com/detail/index.html | 同源   | 只是目录不同   |

1、JSONP 跨域

其本质是利用了<script src=""></script>标签具有可跨域的特性，由服务端返回一个预先定义好的Javascript函数的调用，并且将服务器数据以该函数参数的形式传递过来，此方法需要前后端配合完成。

jQuery 的$.ajax() 方法当中集成了JSONP的实现，可以非常方便的实现跨域数据的访问。

作业:去请求360 搜索接口的数据，通过script 标签。

2·  CORS 跨域（跨域资源共享）

```
通过服务端响应头的方式
通过想客户端输出一个响应头
header("Access-Control-Allow-Origin:*");
```



##HTTP服务&AJAX编程

###上节课知识点回顾

- jquery 的 ajax
  ```
  $.ajax({
     type: "POST",
     url: "some.php",
     data: "name=John&location=Boston",
     success: function(msg){
         alert( "Data Saved: " + msg );
     }
  });
  ```

- 模板的基本使用 

  ​       artTemplate.js 

  ​	1:引入模板文件

  ​	2：创建模板

  ​	3：将数据跟模板进行绑定  template.js

  ​	4: 准备模板内容

  ​	5：在模板里面解析数据  <%%>  <%=%>

  ​	6：template 方法，返回一个字符串，直接将返回的字符串写到页面上面即可

- 跨域的概念

  ​	从一个a 站点获取一个页面，然后在这个页面去访问b 站点的资源，所以就会产生跨域.

  使用XMLHttpRequest 对象去发送请求，就会有跨域的限制，浏览器限制.

  ​	我们使用script 标签发送请求，就不会有跨域限制

- jsonp 跨域解决方案 

  ​       利用script 标签发送请求，在客户端定义一个回调函数，给服务器传递回调函数的名称，服务端返回的是

  一个回调函数的调用。服务端的数据包在函数里面.

### 案例 jsonp 实现360 搜索案例

    function getInfo(obj){
    	var html=template("soId",obj);
    }
     window.onload=function(){
                //把事件进行绑定.
                document.getElementById("keyword").onkeyup=function(){
                   if(this.value.length>0){
                     //发送请求，获取数据，解析数据放在页面对应的位置
                       var script=document.createElement("script");
                       script.src="https://sug.so.360.cn/suggest?callback=getInfo&encodein=utf-8&encodeout=utf-8&format=json&fields=word&word="+this.value;
                           //挂载到页面.
                           document.body.appendChild(script);
                 }else{
                            //隐藏当前元素.
                            document.getElementsByClassName("area")[0].style.display="none";
              }
          }
    }
jsonp 的跨域，它只支持get 方式的请求，因为它是使用script 标签去发送请求，而且服务端需要做处理，客户端也需要做处理。如果跨域的时候传递的数据非常多，jsonp 的方式就不太可取。

### cors 跨域 

跨域资源共享，它的原理就是在请求服务器的时候，服务器给一个响应头，告诉客户端，这些数据可以访问.

```
通过想客户端输出一个响应头
header("Access-Control-Allow-Origin:*");  跨域资源共享
```

这种方式是服务器直接可一个给定一个响应头Access-Control-Allow-Origin，告诉客户端浏览器，这些数据可以获取。这个Access-Control-Allow-Origin也是属于http 协议规定的.

###jsonp 与 cors 的区别

jsonp 是最早期的这种跨域解决方案，因为是使用script 标签发送请求，所以兼容性会比较好，只支持get 方式.

cors 是后期的一种解决方案. 它只需要改服务器的配置，客户端不需要做任何的处理。一个响应. ,兼容性稍微差一些，因为Access-Control-Allow-Origin 是后期http 协议规定的，如果浏览器不支持这个响应头,支持get ，以及post。

其它方式:  通过后台服务器转发，通过设置代理服务器。

### 文件上传案例

```
页面代码
<input type="file"   id="fileuploadId" name="lifePhoto" data-url="../api/fileupload.php">
/*文件上传的代码*/
 $("#fileuploadId").fileupload({
     autoLoad:true,
     done:function(e,data){
     	//imageViewId
        var img=document.createElement("img");
        //i响应的地址是一个这样的地址.images/circle.png
        img.src="../"+data.result;
        //images/circle.png
        imageSrc=data.result;
        img.width="100";
        //往对应的位置追加
        $("#imageViewId").append(img);
        //执行动画.
        $("#imageViewId").animate({opacity:1,marginLeft:100},2000);
    }
})
```

### 案例 讲师管理小系统.

需求：后台可以对讲师讲师进行添加，有分页的功能。

![1530358214460](1530358214460.png)

移动端展示:

用户可以在pc 端获取到讲师的信息，并且能够下拉刷新，滚动的加载讲师的数据。

pc 端展示:

用户可以获取到讲师的数据，滚动加载。

系统架构：前后端分离

```
为什么选择前后端分离
在以前传统的网站开发中，前端一般扮演的只是切图的工作，只是简单地将UI设计师提供的原型图实现成静态的HTML页面，而具体的页面交互逻辑，比如与后台的数据交互工作等，可能都是由后台的开发人员来实现的，或者是前端是紧紧的耦合后台。比如，以前淘宝的Web基本上都是基于MVC框架webx，架构决定了前端只能依赖后端。所以他们的开发模式依然是，前端写好静态demo，后端翻译成VM模版，这种模式的问题就不说了，被吐槽了很久。
而且更有可能后台人员直接兼顾前端的工作，一边实现API接口，一边开发页面，两者互相切换着做，而且根据不同的url动态拼接页面，这也导致后台的开发压力大大增加。前后端工作分配不均。不仅仅开发效率慢，而且代码难以维护。而前后端分离的话，则可以很好的解决前后端分工不均的问题，将更多的交互逻辑分配给前端来处理，而后端则可以专注于其本职工作，比如提供API接口，进行权限控制以及进行运算工作。而前端开发人员则可以利用nodejs来搭建自己的本地服务器，直接在本地开发，然后通过一些插件来将api请求转发到后台，这样就可以完全模拟线上的场景，并且与后台解耦。前端可以独立完成与用户交互的整一个过程，两者都可以同时开工，不互相依赖，开发效率更快，而且分工比较均衡。
```

前后端分离接口安全问题

基于session 的验证

![1530372105332](1530372105332.png)

基于token 的验证

![1530372136133](1530372136133.png)





## Http Ajax 服务器

### 上节课内容回顾

- 360 搜索案例 

  这个是基于跨域去做的，然后使用底层的script 标签去发送请求. 带src 的标签都可以发送请求.

- cors 跨域的原理

  script 标签

- jsonp 跨域 与 cors 跨域的区别

- 前后端分离的优缺点  好好理解的

- session 验证与 token验证的区别

  ![1530631835242](1530631835242.png)

### 数据库环境搭建以及表结构

### php 后台环境搭建

#### queryTeacher.php

```
<?php
                //我需要把所有的employee 数据都获取到，然后通过一个表格输出到客户端.
                header("Content-Type:text/html;charset=utf-8");
                $con = mysql_connect("127.0.0.1","root","");

                /*
                   客户端必须给两个参数
                   一个参数 page 当前页
                   一个参数 pageSize 每页显示多少条.
                */

                $pageNum=$_GET['page']; //3
                $pageSize=$_GET['pageSize']; //10
                $startIndex=($pageNum-1)*$pageSize;
                $endIndex=$pageSize;
                if (!$con){
                    die('Could not connect: ' . mysql_error());
                }
                $sql="select * from teacher limit ".$startIndex.",".$endIndex;
                //连接那个数据库  pdj 数据
                mysql_select_db("huike", $con);

                //查询，响应一个结果。返回的结果都在这个$result
                $result = mysql_query($sql);
                $list=array();
                //怎么去获取这个结果.
                while($row=mysql_fetch_array($result)){
                        // $row 代表的是一条记录，代表是一行.
                        $item=array(
                             "id"=> $row['id'],
                             "username"=>$row['username'],
                             "age"=> $row['age'],
                             "lesson"=> $row['lesson'],
                             "lifePhoto"=> $row['lifePhoto'],
                             "teadesc"=>$row['teadesc']
                        );
                        array_push($list,$item);
                }

                //如果是分页的数据. 我们传递到客户端的数据格式必须
               /* {
                     "rows":[具体的记录],
                     "total":8
                }*/

               $json=array("rows"=>$list,"total"=>15);
               echo json_encode($json);
?>
```



#### addTeacher.php

```
<?php

        header("Content-Type:text/html;charset=utf-8");
         /*   //接收请求，处理请求，完成响应*/
        $username=$_POST['username'];
        $age=$_POST['age'];
        $lesson=$_POST['lesson'];
        $lifePhoto=$_POST['lifePhoto'];
        $desc=$_POST['desc'];
        //处理请求 把客户端的数据往数据库里面存放.
        //建立连接
        $con = mysql_connect("127.0.0.1","root","");
        //判断是已经建立连接.
        if (!$con){
        	die('Could not connect: ' . mysql_error());
        }
        //连接具体的那个数据库
        mysql_select_db("huike", $con);
        $sql="insert into teacher (username,age,lesson,lifePhoto,teadesc) values('$username','$age','$lesson','$lifePhoto','$desc')";

        //使用mysql_query  函数 通过$con 连接 把$sql 发送到数据库.
        if (!mysql_query($sql,$con)){
         	die('Error: ' . mysql_error());
        };
        mysql_close($con);
        echo '{"status":"ok","code":200}'
?>
```



#### removeTeacher.php

#### uploadTeacher.php

### 前端界面环境搭建 

#### pc 端 后台 管理系统

 环境搭建，jquery+bootstrap+jquery.fileupload.js+bootstrap-table.js

#### pc 端前台瀑布流环境

 jquery+artTemplate.js

#### 移动端数据展示环境搭建

zepto.js+iscroll.js+artTemplate.js







​	  

​		   	

  

  

  

  

  ​		

  ​	

  ​		

  

  

  

  

  

  

  

  

  







































