### px em rem rpx https://blog.csdn.net/function__/article/details/84950897

### CSS
1.从CSS 样式代码插入的形式来看基本可以分为以下3种：
    内联式:<p style="color:red;font-size:12px">这里文字是红色。</p>
    嵌入式:<style type="text/css">span{   color:red;  }</style>
    外部式:在<head>内<link href="base.css" rel="stylesheet" type="text/css" />
    css样式是在的相同权值的情况下:内联式 》 嵌入式 》 外部式

2.选择器种类：
    标签选择器：p{font-size:12px;line-height:1.6em;}
    类选择器：.类选器名称{css样式代码;}
    ID选择器：#名称{css样式代码;}
    类和ID选择器的区别：1、ID选择器只能在文档中使用一次。与类选择器不同，在一个HTML文
                        档中，ID选择器只能使用一次，而且仅一次。而类选择器可以使用多次。
                      2、可以使用类选择器词列表方法为一个元素同时设置多个样式。我们可以为一个元素同时设多个样式，但只可以用类选择器的方法实现，ID选择器是不可以的
    子选择器：food>li{border:1px solid red;}
    后代选择器：而后代选择器是作用于所有子后代元素。后代选择器通过空格来进行选择，
                .first  span{color:red;}
    通用选择器：* {color:red;}
    伪类选择器：它允许给html不存在的标签（标签的某种状态）设置样式，比如说我们给html中一个
               标签元素的鼠标滑过的状态来设置字体颜色：a:hover{color:red;}
    分组选择器：当你想为html中多个标签元素设置同一个样式时，可以使用分组选择符（，）
               h1,span{color:red;}

3.继承：p{color:red;}<p>三年级时，我还是一个<span>胆小如鼠</span>的小女孩。</p>
        这个颜色设置不仅应用p标签，还应用于p标签中的所有子元素文本，这里子元素为span标签。

4.选择器的优先级：1、如果一个元素使用了多个选择器,则会按照选择器的优先级来给定样式。
                 2、选择器的优先级依次是: 内联样式 > id选择器 > 类选择器 > 标签选择器 > 通配符选择器

5.font-family  font-size  font-weight  font-style line-height
  text-decoration  text-indent  letter/word-spacing  text-align(块状元素中文本图片居中)

6.在CSS中，html中的标签元素大体被分为三种不同的类型：块状元素、内联元素(又叫行内元素)和内联块状元素。
    常用的块状元素有：
        <div>、<p>、<h1>...<h6>、<ol>、<ul>、<dl>、<table>、<address>、<blockquote> 、<form>
        当然块状元素也可以通过代码将元素设置为内联元素。
        div{    display:inline;   }
    常用的内联元素有：
        <a>、<span>、<br>、<i>、<em>、<strong>、<label>、<q>、<var>、<cite>、<code>
        如下代码就是将内联元素a转换为块状元素，从而使a元素具有块状元素特点。
        a{display:block;}
    常用的内联块状元素有：
        <img>、<input>
        代码就是将元素设置为内联块状元素。
        a{ display:inline-block;  }

7.盒模型宽度和高度和我们平常所说的物体的宽度和高度理解是不一样的，css内定义的宽（width）和
    高（height），指的是填充以里的内容的范围:一个元素实际宽度（盒子的宽度）=左边界+左边框+左填充+内容宽度+右填充+右边框+右边界。
    div{
        width:200px;        //里面宽度
        padding:20px;           //里面的边距
        border:1px solid red;   //边界宽度
        margin:10px;            //外边距
    }

8.网页中的标签不论是行内元素还是块状元素都可以给它设置一个背景色。为标签设置背景颜色可以使background-color:颜色值来
    实现。
    例子如下：
    div{background-color:red;}//为块状元素设置
    a{background-color:green;}//为行内元素设置

9.盒子模型的边框就是围绕着内容及补白的线，这条线你可以设置它的粗细、样式和颜色(边框三个属性)。
    div{
    border-width:2px;
    border-style:solid;
    border-color:red;}

10.现在有一个问题，如果有想为 p 标签单独设置下边框，而其它三边都不设置边框样式怎么办呢？css 样式中允许只为一个方向的边
    框设置样式：
    div{border-bottom:1px solid red;}
    border-top:1px solid red;
    border-right:1px solid red; 
    border-left:1px solid red;

11.给边框加圆角(顺时针）：当设置效果值为元素宽度的一半时，显示效果为圆形。
12.padding为盒子设置内边距（顺时针）：div{padding：20px 10px 15px 30px; }
  margin为外边距

13.CSS3包含3种基本的布局模型：  
    1、流动模型（Flow）（1）块状元素自上而下 （2）内联元素从左往右
    2、浮动模型 (Float)
    3、层模型（Layer）
        层模型有三种形式：
        1、绝对定位(position: absolute)
        2、相对定位(position: relative)
        3、固定定位(position: fixed)

14.  弹性盒模型 - 弹性盒模型之flex属性 
        1、设置display: flex属性可以把块级元素在一排显示。
        2、flex需要添加在父元素上，改变子元素的排列顺序。
        3、默认为从左往右依次排列,且和父元素左边没有间隙。
    
    操作一下横轴- 使用justify-content属性设置横轴排列方式
        justify-content: flex-start | flex-end | center | space-between | space-around;
    
    操作一下竖轴- 使用align-items属性设置纵轴排列方式
        align-items: flex-start | flex-end | center | baseline | stretch;

15. 水平居中设置-行内元素
        如果被设置元素为文本、图片等行内元素时，水平居中是通过给父元素设置 text-align:center 来实现的。
        水平居中设置-定宽块状元素:        (1)width:200px;
                                        (2)margin:30px auto;
    


### padding

1.box-sizing: content-box默认值，增加的边框和内边距会增加到最后绘制的元素的宽度中
              当width为：auto或者border-box:告诉浏览器，边框和内边距和内容区共享width

2.padding：0 15px;(上下 ， 左右)     padding：0 5px 15px;(上， 左右， 下)

3.对于block水平元素：
    padding值暴走，一定会影响元素尺寸；
    width非auto， padding影响尺寸
    width为auto，或者box-sizing为border-box，同时padding值没有暴走，不影响尺寸。

    对于inline水平元素：
        水平padding影响尺寸，垂直padding不影响尺寸，但是会影响背景色（占据空间）；

4.clientHeight：当前可见元素的的高度不包括边框，滚动条；      scrollHight：还包括不可见的内容的高度直到padding-top--padding-bottom

5.padding不支持负值
  margin和padding百分比均是依据父级宽度进行计算的。

6.background-size 属性
    1、定义：
        background-size 用来调整背景图像的尺寸大小。

    2、语法：
        以下为引用内容：
        background-size : contain | cover | 100px 100px | 50% 100%;

    3、参数：
        background-size：contain; // 缩小图片来适应元素的尺寸（保持像素的长宽比）；
        background-size ：cover; // 扩展图片来填满元素（保持像素的长宽比）；
        background-size ：100px 100px; // 调整图片到指定大小；
        background-size ：50% 100%; // 调整图片到指定大小，百分比相对于包含元素的尺寸。

文字一般是12 14px    padding设置成22px

### position
1.盒子定位
    子类以父类的左上角为原点
2.position
    relative：以右上角为原点，
    absolute：以四个角为顶点
    fixed：固定在屏幕上
    inherit：继承父类的层级
    z-index：越高可以覆盖低的，子类层级与父类相同

    注意：当子级设置了position：absolute属性时父级必须设置position属性。



### html
1.语义化标签
    <p> <span> <hx> <div> <header> <footer> <section> <aside> <br/> &nbsp
    <hr> <ul><li> <ol><li> <img> <a> <table><thead><tbody><tfoot>   <form><input><label><select><option>   <textarea>


