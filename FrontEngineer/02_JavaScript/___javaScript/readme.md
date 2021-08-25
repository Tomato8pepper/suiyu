### javaScript

1.引用JS外部文件
    <script src="script.js"></script>

2.JavaScript-什么是变量
    定义变量使用关键字var,语法如下：
        var 变量名
    变量名可以任意取名，但要遵循命名规则:
        1.变量必须使用字母、下划线(_)或者美元符($)开始。
        2.然后可以使用任意多个英文字母、数字、下划线(_)或者美元符($)组成。
        3.不能使用JavaScript关键词与JavaScript保留字。
    注意:
        1. 在JS中区分大小写，如变量mychar与myChar是不一样的，表示是两个变量。
        2. 变量虽然也可以不声明，直接使用，但不规范，需要先声明，后使用。

3.JavaScript-判断语句（if...else）
    if(条件)
    { 条件成立时执行的代码 }
    else
    { 条件不成立时执行的代码 }

4.JavaScript-什么是函数 
    如何定义一个函数呢？基本语法如下:
        function 函数名()
        {  函数代码;  }
    函数调用:
        函数定义好后，是不能自动执行的，所以需调用它,只需直接在需要的位置写函数就ok了

5.JavaScript-输出内容（document.write）
6.JavaScript-警告（alert 消息对话框）:alert(字符串或变量);
7.JavaScript-确认（confirm 消息对话框）
    语法:confirm(str);
    参数说明:
        str：在消息对话框中要显示的文本
        返回值: Boolean值

8.JavaScript-提问（prompt 消息对话框）
    语法:prompt(str1, str2);
        str1: 要显示在消息对话框中的文本，不可修改
        str2：文本框中的内容，可以修改
    返回值:
        1. 点击确定按钮，文本框中的内容将作为函数返回值
        2. 点击取消按钮，将返回null

9.JavaScript-打开新窗口（window.open）
    语法：window.open([URL], [窗口名称], [参数字符串])
    例如:打开http://www.imooc.com网站，大小为300px * 200px，无菜单，无工具栏，无状态栏，有滚动条窗口：
    <script type="text/javascript"> window.open('http://www.imooc.com','_blank','width=300,height=200,menubar=no,toolbar=no, status=no,scrollbars=yes')
    </script>

10.JavaScript-关闭窗口（window.close)
    用法：window.close();   //关闭本窗口
          <窗口对象>.close();   //关闭指定的窗口

11.认识DOM 
    通过ID获取元素 ：语法:document.getElementById("id") 
    注:获取的元素是一个对象，如想对元素进行操作，我们要通过它的属性或方法。

    innerHTML属性    innerHTML 属性用于获取或替换 HTML 元素的内容。
        语法:Object.innerHTML
        注意:   1.Object是获取的元素对象，如通过document.getElementById("ID")获取的元素。
                2.注意书写，innerHTML区分大小写

    改变 HTML 样式:  语法:Object.style.property=new style;
        注意:Object是获取的元素对象，如通过document.getElementById("id")获取的元素。

    显示和隐藏（display属性）语法：Object.style.display = value
        注意:Object是获取的元素对象，如通过document.getElementById("id")获取的元素。

    控制类名（className 属性)
        语法：object.className = classname
        作用:
            1.获取元素的class 属性
            2. 为网页内的某个元素指定一个css样式来更改该元素的外观



### js advanced

1.数据类型：object(Function Array Date)  number  string  boolean null  undefined
2.str与整型：  "32"+32="3232"; "32"-32=0;
3.隐式转换："1.23"==1.23     0==false   null==undefined  new Object==Object   [1,2]==[1,2]
    严格等于：a===b