[找点事做别让空闲毁了你](www.w3school.com.cn)
☆ getElementById和querySelector的区别
    1.getXXXByXXX 获取的是动态集合，querySelector获取的是静态集合。（往一个ul中添加新的li）

☆ 你所知道的浏览器的内核
    浏览器最重要或者说核心的部分是“Rendering Engine”，可大概译为“渲染引擎”，不过我们一般习惯将之称为“浏览器内核”。
    IE：Trident。 Chrome：Blink

☆ [前端大全冒泡]:https://blog.csdn.net/jingerh126/article/details/103428354

☆ [匿名函数this指向](https://www.cnblogs.com/flawlessBlithe/p/8529536.html)

☆ 浏览器的私有属性
    -moz代表firefox浏览器私有属性;
    -ms代表IE浏览器私有属性;
    -webkit代表chrome、safari私有属性;
    -o代表Opera私有属性;

☆ 如何获取智能表单中的值

☆ 元素的事件有几种调用形式

☆ 图片懒加载

☆ cookie、sessionStorage、localStorage、token、session

☆ v-if和v-show的区别

☆ [px em rem rpx]:(https://blog.csdn.net/function__/article/details/84950897)
                  :(https://juejin.cn/post/6844903630655471624) 

☆ Less 是一种动态样式语言. 将CSS赋予了动态语言的特性，如变量，继承，运算，函数

☆ [懒加载与预加载](https://juejin.im/post/6844903614138286094)

☆ background: color url repeat attachment position  3

☆ 


# HTML5基础

## 了解HTML5

```tex
 ☞HTML5属于上一代HTML的新迭代语言，设计HTML5最主要的目的是为了在移动设备上支持多媒体！！！
   例如： video 标签和 audio 及 canvas 标记
 
 ☞ 新特性：
	  1. 取消了过时的显示效果标记  <font></font> 和 <center></center> ...
	  2. 新表单元素引入
	  3. 新语义标签的引入  
	  4. canvas标签（图形设计）
	  5. 本地数据库（本地存储）
	  6. 一些API
 ☞ 好处：
	  1. 跨平台
	  	  例如：比如你开发了一款HTML5的游戏，你可以很轻易地移植到UC的开放平台、Opera的游戏中心、Facebook应用平台，甚至可以通过封装的技术发放到App Store或Google Play上，所以它的跨平台性非常强大，这也是大多数人对HTML5有兴趣的主要原因。

 ☞ 缺点：
	  1. pc端浏览器支持不是特别友好，造成用户体验不佳
```


## 新语义标签

### 网页布局结构标签及兼容处理

```html
  <header></header>
  <footer></footer>
  <article></article>
  <aside></aside>
  <nav></nav>
  <section></section>
  ....
  http://www.w3school.com.cn/html/html5_semantic_elements.asp
```

### 多媒体标签及属性介绍

```html
 ☞ <video></video> 视频
	  属性：controls 显示控制栏
	  属性：autoplay 自动播放	
	 属性：loop  设置循环播放
 ☞ <audio></audio>  音频
	  属性：controls 显示控制栏
	  属性：autoplay 自动播放	
	 属性：loop  设置循环播放
 ☞ video标签支持的格式    http://www.w3school.com.cn/html5/html_5_video.asp
 ☞ 多媒体标签在网页中的兼容效果方式

	 <video>
		<source src="code/多媒体标签/trailer.mp4">
		<source src="trailer.ogg">
		<source src="trailer.WebM">
	</video>
```

## 新表单元素及属性

### 智能表单控件

```html
 
<input  type="email">
 email: 输入合法的邮箱地址
 url：  输入合法的网址
 number： 只能输入数字
 range： 滑块
 color： 拾色器
 date： 显示日期
 month： 显示月份
 week ： 显示第几周
 time：  显示时间
```

### 表单属性

```html
 ◆form属性：	
	autocomplete=on | off          自动完成
	novalidate=true | false        是否关闭校验

  ◆ input属性：
    *autofocus  ： 自动获取焦点
    form：		
    list：
	   <input type="text" list="abc"/>
	 	 <datalist id="abc">
	 	 	<option value="123">12312</option>
	 	 	<option value="123">12312</option>
	 	 	<option value="123">12312</option>
	 	 	<option value="123">12312</option>
	 	</datalist>
    multiple：	 实现多选效果
    *placeholder ： 占位符  （提示信息）
    *required：    必填项




  required自定义提示信息：
	◆ 如何修改表单控件中的默认提示信息 
		 1. 表单验证触发oninvalid事件
		 2. 通过setCustomValidity方法设置修改内容
```

## HTMl5中的API

### 获取页面元素及类名操作和自定义属性

```js
  ☞ document.querySelector("选择器")；
	 备注：
	    选择器： 可以是css中的任意一种选择器
         通过该选择器只能选中第一个元素。

  ☞ document.querySelectorAll("选择器");
	   备注：
	      与document.querySelector区别： querySelectorAll 可以选中所有符合选择器规则的元素，返回的是一个列表。querySelector返回的只是单独的一个元素
	  

  ☞ Dom.classList.add("类名"): 给当前dom元素添加类样式

  ☞ Dom.classList.remove("类名"); 给当前dom元素移除类样式

  ☞ classList.contains("类名"); 检测是否包含类样式

  ☞ classList.toggle("active");  切换类样式（有就删除，没有就添加）




  ☞ 自定义属性  			（小案例分析体验自定义属性）
  
	 data-自定义属性名
	 备注：
		 在标签中，以data-自定义名称  
	 

	 1. 获取自定义属性   Dom.dataset   返回的是一个对象
	    Dom.dataset.属性名  或者  Dom.dataset[属性名]
	   
  	    注意： 
        		属性名是不包含data-

	 2. 设置自定义属性
	    Dom.dataset.自定义属性名=值  或者  Dom.dataset[自定义属性名]=值；
```

### 文件读取

```html
  ☞  FileReader
	  FileReader			 接口有3个用来读取文件方法返回结果在result中
	  readAsBinaryString    ---将文件读取为二进制编码
	  readAsText		   ---将文件读取为文本
	  readAsDataURL		   ---将文件读取为DataURL

 ☞  FileReader 提供的事件模型
	   onabort	    中断时触发
     onerror	    出错时触发
     onload	    文件读取成功完成时触发
     onloadend	读取完成触发，无论成功或失败
     onloadstart	读取开始时触发
     onprogress	读取中

 ☞ 分析读取图片小案例
```

### 获取网络状态

```html
  ☞ 获取当前网络状态
		 window.navigator.onLine 返回一个布尔值

  ☞ 网络状态事件
		 1. window.ononline
		 2. window.onoffline
```

### 获取地理定位

```javascript
  ☞  获取一次当前位置
	  window.navigator.geolocation.getCurrentPosition(success,error);

	   1. coords.latitude   维度
       2. coords.longitude   经度

  ☞  实时获取当前位置
  	  window.navigator.geolocation.watchPosition(success,error);

  ☞ 分析地理定位小案例
```

### 本地存储

```javascript
   ☞发展：
      随着互联网的快速发展，基于网页的应用越来越普遍，同时也变的越来越复杂，为了满足各种各样的需求，会经常性在本地存储大量的数据，传统方式我们以document.cookie来进行存储的，但是由于其存储大小只有4k左右，并且解析也相当的复杂，给开发带来诸多不便，HTML5规范则提出解决方案，使用sessionStorage和localStorage存储数据。 

    ☞  localStorage：
    	1. 永久生效
        2. 多窗口共享
        3. 容量大约为20M
        
        ◆window.localStorage.setItem(key,value)  设置存储内容
        ◆window.localStorage.getItem(key)  		 获取内容
        ◆window.localStorage.removeItem(key)	 删除内容
        ◆window.localStorage.clear()			清空内容
        
    ☞ sessionStorage：
		  1. 生命周期为关闭当前浏览器窗口
           2. 可以在同一个窗口下访问
           3. 数据大小为5M左右
           
         ◆window.sessionStorage.setItem(key,value)
		◆window.sessionStorage.getItem(key)
		◆window.sessionStorage.removeItem(key)
		◆window.sessionStorage.clear()
```

### 操作多媒体

```html
http://www.w3school.com.cn/html5/html5_ref_audio_video_dom.asp

作业：
	 完成一个在线音乐播放器或者视频播放器
```

## Canvas画布

### 绘图工具

```js
  ☞ 介绍canvas画布
  ☞ 设置画布大小： 使用属性方式设置
  ☞ 解决画布重绘问题
  	   1. 设置一次描边
       2. 开启新的图层
```

### 绘图方法

```html
ctx.moveTo(x,y)    落笔
ctx.lineTo(x,y)    连线
ctx.stroke()	   描边

ctx.beginPath()；   开启新的图层

演示： strokeStyle="值"
线宽： linewidth="值"   备注：不需要带单位

线连接方式：   lineJoin: round | bevel | miter (默认)

线帽（线两端的结束方式）：  lineCap: butt(默认值) | round | square 

闭合路径： ctx.closePath()


--绘制一条直线演示代码

--作业：
	   1. 从200,100的位置绘制宽为200高为150的矩形
        2. 准备一个600*400的画布，三等分这个画布，分别绘制正方形。直角三角形，梯形
```

### 渐变方案

```
  ☞ 线性渐变
  	 var grd=ctx.createLinearGradient(x0,y0,x1,y1);
  	 	  x0-->渐变开始的x坐标
          y0-->渐变开始的y坐标
          x1-->渐变结束的x坐标
          y1-->渐变结束的y坐标
          
      grd.addColorStop(0,"black");      设置渐变的开始颜色
      grd.addColorStop(0.1,"yellow");   设置渐变的中间颜色
      grd.addColorStop(1,"red");        设置渐变的结束颜色

  	  ctx.strokeStyle=grd;
      ctx.stroke();
      
      备注：
         addColorStop(offse,color);
         中渐变的开始位置和结束位置介于0-1之间，0代表开始，1代表结束。中间可以设置任何小数
         
  ☞ 径向渐变
  
  	        ctx.createradialGradient(x0,y0,r0,x1,y1,r1);

            (x0,y0)：渐变的开始圆的 x,y 坐标

            r0：开始圆的半径

            (x1,y1)：渐变的结束圆的 x,y 坐标

            r1：结束圆的半径
```

### 填充效果

```
  ctx.fill();	      设置填充效果
  ctx.fillstyle="值"; 设置填充颜色
```

### 非零环绕原则

```
 ☞ 绘制一个如下图形
```

![52647078286](assets/1526470782861.png)

```
 ☞ 非零环绕原则：
	  1. 任意找一点，越简单越好
	  2. 以点为圆心，绘制一条射线，越简单越好（相交的边越少越好）
	  3. 以射线为半径顺时针旋转，相交的边同向记为+1，反方向记为-1，如果相加的区域等于0，则不填充。
	  4. 非零区域填充
	  
 ☞ 非零环绕原则案例：
```



### 绘制虚线

```js
	原理：

     设置虚线其实就是设置实线与空白部分直接的距离,利用数组描述其中的关系

     例如： [10,10]  实线部分10px 空白部分10px

     例如： [10,5]  实线部分10px 空白部分5px

     例如： [10,5,20]  实线部分10px  空白5px  实线20px  空白部分10px 实线5px 空白20px....

    绘制：
     ctx.setLineDash(数组);
     ctx.stroke();
     
     例如：
     	 ctx.moveTo(100, 100);
	 	 ctx.lineTo(300, 100);
	 	 ctx.setLineDash([2,4]);
	 	 ctx.stroke();

    注意：
        如果要将虚线改为实线，只要将数组改为空数组即可。
```

### 绘制动画效果

```
   ☞ 绘制一个描边矩形： content.strokeRect(x,y,width,height) 
   ☞ 绘制一个填充矩形： content.fillRect(x,y,width,height)  
   ☞ 清除：		   content.clearRect(x,y,width,height)  
   
   
   ☞ 实现动画效果： 
   	      1. 先清屏
   	      2. 绘制图形
   	      3. 处理变量
```

### 绘制文本

```
  ☞ 绘制填充文本
  	  content.fillText(文本的内容,x,y)
  
  ☞ 绘制镂空文本
  	   content.strokeText();
  	   
  ☞ 设置文字大小：
  	   content.font="20px 微软雅黑"
  	   备注： 该属性设置文字大小，必须按照cssfont属性的方式设置
  	   
  ☞ 文字水平对齐方式【文字在圆心点位置的对齐方式】
  		content.textalign="left | right | center"
  
  ☞文字垂直对齐方式
  		 content.textBaseline="top | middle | bottom | alphabetic(默认)"
  
  ☞文字阴影效果
  		 ctx.shadowColor="red";  设置文字阴影的颜色

         ctx.ShadowOffsetX=值;   设置文字阴影的水平偏移量

         ctx.shadowOffsetY=值;   设置文字阴影的垂直偏移量

         ctx.shadowBlur=值;      设置文字阴影的模糊度
```

### 绘制图片

```
  ☞    
      //将图片绘制到画布的指定位置
     content.drawImage(图片对象,x,y);

  ☞ 
  	 //将图片绘制到指定区域大小的位置  x,y指的是矩形区域的位置，width和height指的是矩形区域的大小
     content.drawImage(图片对象,x,y,width,height);
     
  ☞ 
  	 //将图片的指定区域绘制到指定矩形区域内
     content.drawImage(图片对象,sx,sy,swidth,sheight,dx,dy,dwidth,dheight);
     
     sx,sy 指的是要从图片哪块区域开始绘制，swidth，sheight 是值 截取图片区域的大小
     dx,dy 是指矩形区域的位置，dwidth,dheight是值矩形区域的大小
     

   ☞ 
   	  解决图片绘制到某一个区域的按原比例缩放绘制：
        绘制宽：绘制高==原始宽：原始高
```

### 绘制圆弧

```
   ☞
   	 content.arc(x,y,radius,startradian,endradian[,direct]);
   	 
   	   		x,y    圆心的坐标

             radius 半径

             startradian   开始弧度

             endradian     结束弧度
        
             direct        方向（默认顺时针 false）   true 代表逆时针
             
   ☞ 0度角在哪？
		  以圆心为中心向右为0角 顺时针为正，逆时针为负
             
   ☞ 备注：
   	    角度 和 弧度的关系： 角度:弧度= 180:pi
   	    
   	     特殊值

           0度 = 0弧度

           30度 = π/6   (180度的六分之一)

           45度 = π/4   

           60度 = π/3

           90度 = π/2

           180度 = π

           360度 = 2π
           
           
    ☞ 绘制圆上任意点：	
    	公式：
           x=ox+r*cos( 弧度 )

           y=oy+r*sin( 弧度 )


         ox: 圆心的横坐标

         oy: 圆心的纵坐标

         r： 圆的半径
```

### 平移【坐标系圆点的平移】

```
ctx.translate(x,y);

   特点：
      通过该方法可以将原点的位置进行重新设置。

   注意：
       1. translate(x,y) 中不能设置一个值

       2. 与moveTo(x,y) 的区别：

            moveTo(x,y) 指的是将画笔的落笔点的位置改变，而坐标系中的原点位置并没有发生改变

            translate(x,y) 是将坐标系中的原点位置发生改变
```

### 旋转【坐标系旋转】

```
ctx.rotate(弧度)
```

### 伸缩

```
 ctx.scale(x,y)

   备注：
       沿着x轴和y轴缩放

       x,y 为倍数  例如： 0.5  1
```

## 作业

1. 制作一个在线播放器（视频，音乐）
2. 练习Canvas中的api
3. H5中的API熟练一下


# day03-CSS3【控制样式，网页布局】

## CSS3中新特性样式篇

### 背景

```css
background-origin：   规定背景图片的定位区域。
	☞ padding-box    背景图像相对内边距定位（默认值）
	☞ border-box	 背景图像相对边框定位【以边框左上角为参照进行位置设置】
	☞ content-box    背景图像相对内容区域定位【以内容区域左上角为参照进行位置设置】

   备注：
		1. 默认盒子的背景图片是在盒子的内边距左上角对齐设置。


background-clip：  	 规定背景的绘制区域。
	☞ border-box	 背景被裁切到边框盒子位置 【将背景图片在整个容器中显示】
	☞ padding-box	 背景被裁切到内边距区域【将背景图片在内边距区域（包含内容区域）显示】
	☞ content-box	 背景被裁切到内容区域【将背景图片在内容区域显示】


background-size：     规定背景图片的尺寸。
	☞ cover
	☞ contain
```

### 边框

```css
 box-shadow：      盒子阴影
 border-radius：   边框圆角
 border-image:	  边框图片

	 
			 /* 设置边框图片 */
			 border-image-source: url("2.png");

			 /* 边框图片裁切 : 不需要带单位*/
			 border-image-slice: 20;

			 /* 设置边框图片的平铺方式 */
			 /* border-image-repeat: stretch; */
			 border-image-repeat: round;
			/*  border-image-repeat: repeat; */

			border-image-width: 20px;
```

### 文本

```css
  ☞text-shadow： 设置文本阴影		
```

## CSS3新特性之选择器篇

```css
☞ 属性选择器： 
		[属性名=值] {}
		[属性名] {}	   匹配对应的属性即可
		[属性名^=值] {}    以值开头
		[属性名*=值] {}    包含
		[属性名$=值] {}	   以值结束
	
☞ 结构伪类选择器：
	  :first-child {}     选中父元素中第一个子元素
	  :last-child {}	  选中父元素中最后一个子元素
	  :nth-child(n) {}    选中父元素中正数第n个子元素
	  :nth-last-child(n) {}    选中父元素中倒数第n个子元素

	  备注；
		 n 的取值大于等于0
	     n 可以设置预定义的值
			odd[选中奇数位置的元素]  
			even【选中偶数位置的元素】

	     n 可以是一个表达式：
			 an+b的格式

☞ 其他选择器：
	:target          被锚链接指向的时候会触发该选择器
	::selection	     当被鼠标选中的时候的样式
	::first-line	 选中第一行
	::first-letter	 选中第一个字符
```

## CSS3新特性之颜色渐变

```CSS
  ☞ 线性渐变：
		 1. 开始颜色和结束颜色
		 2. 渐变的方向
	     3. 渐变的范围

	   background-image:  linear-gradient(
                to right,
                red,
                blue
		);

	备注：
	 	表示方向：
			 1. to + right | top | bottom | left 
			 2. 通过角度表示一个方向
			   0deg [从下向上渐变] 
			   90deg【从左向右】
  
  ☞ 径向渐变：
		   /* 径向渐变 */
			background-image: radial-gradient(
				 100px at center,
				 red,
				 blue
			);
```

## 2D转换

```css
  ☞ 位移
	   transform: translate(100px,100px);
		
	   备注：
	 	   位移是相对元素自身的位置发生位置改变

  ☞ 旋转
		transform: rotate(60deg);
	   备注：
		   取值为角度
  ☞ 缩放
	    transform: scale(0.5,1);
		备注：
			 取值为倍数关系，缩小大于0小于1，放大设置大于1
	
  ☞ 倾斜
	   transform: skew(30deg,30deg);
   	   备注：
		  第一个值代表沿着x轴方向倾斜
		  第二个值代表沿着y轴方向倾斜
```

## 3D转换

```css
  ☞ 位移
	transform: translateX()  translateY()   translateZ()

  ☞ 旋转
	 transform: rotateX(60deg)  rotateY(60deg)  rotateZ(60deg);

  ☞ 缩放
	  transform: scaleX(0.5)  scaleY(1)  scaleZ(1);
  ☞ 倾斜
      transform: skewX(30deg) skewY();

  ☞ transform-style: preserve-3d;
	 将平面图形转换为立体图形
```


## CSS3新特性之动画篇

### 过渡

```css
 https://www.cnblogs.com/afighter/p/5731293.html

 补间动画

			/* 设置哪些属性要参与到过渡动画效果中： all */
			transition-property: all;

			/* 设置过渡执行时间 */
			
			transition-duration: 1s;

			/* 设置过渡延时执行时间 */
			transition-delay: 1s;

			/* 设置过渡的速度类型 */

			transition-timing-function: linear;
```

### 动画

```css
  
	/* 1定义动画集 */
		@keyframes  rotate {

			/* 定义开始状态  0%*/
			from {
				transform: rotateZ(0deg);
			}

			/* 结束状态 100%*/
			to {
			   transform: rotateZ(360deg);
			}
		}



    注意：
		 1. 如果设置动画集使用的是百分比，那么记住百分比是相对整个动画执行时间的。
```


## CSS3新特性之网页布局篇

### 伸缩布局或者弹性布局【响应式布局】

```css
  ☞ 设置父元素为伸缩盒子【直接父元素】
	    display： flex
	
      为什么在伸缩盒子中，子元素会在一行上显示？
			 1. 子元素是按照伸缩盒子中主轴方向显示
			 2. 只有伸缩盒子才有主轴和侧轴
			 3. 主轴： 默认水平从左向右显示
			 4。 侧轴： 始终要垂直于主轴

  ☞ 设置伸缩盒子主轴方向（flex-direction）
		   	flex-direction: row; 【默认值】
			flex-direction: row-reverse;
			flex-direction: column;
			flex-direction: column-reverse;
  ☞ 设置元素在主轴的对齐方式( justify-content)
		/* 设置子元素在主轴方向的对齐方式 */
			justify-content: flex-start;
			justify-content: flex-end;
			justify-content: center;
			justify-content: space-between;
			justify-content: space-around;

  ☞ 设置元素在侧轴的对齐方式 （align-items）
			align-items: flex-start;
			align-items: flex-end;
			align-items: center;

			/* 默认值 */
			align-items: stretch;

  ☞ 设置元素是否换行显示（flex-wrap）
		  1. 在伸缩盒子中所有的元素默认都会在一行上显示
		  2. 如果希望换行：
			flex-wrap: wrap | nowrap;

  ☞ 设置元素换行后的对齐方式（ align-content）
		    align-content: flex-start;
			align-content: flex-end;
			align-content: center;
			align-content: space-around;
			align-content: space-between;
			/* 换行后的默认值 */
			align-content: stretch;
```

# CSS
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





