[js,css,html]mdn
[cubeui](https://didi.github.io/cube-ui/#/zh-CN)
[elementui](https://element.eleme.cn/#/zh-CN)
[bug](http://tool.chinaz.com/tools/diff/)
[百度翻译](https://fanyi.baidu.com/)      
[懒加载与预加载](https://juejin.im/post/6844903614138286094)
[产品原型工具-xiaoPiu](https://www.xiaopiu.com/)
[npm包](npmjs.com)
[bootCDN](https://www.bootcdn.cn/)
[fileSeek工具]
[snipaste](截图软件)
[antUi](https://2x.antdv.com/docs/vue/introduce-cn/)

[](https://github.com/AlloyTeam/AlloyFinger)
[](https://www.cnblogs.com/imwtr/p/5884484.html)


### vue
    - 满足各种移动端优雅的滚动插件 [better-scroll]: (https://ustbhuangyi.github.io/better-scroll/#/)



### typescript
    1.npm install -g typescript 
    2.初始化: tsc init
    3.编辑 tsconfig.json

- 定义类型
    const idLoading(: boolean) = false
    <!-- 原始 -->
    boolean, number, string, void, null, undefined, symbol, bigint, any
    





### Go language 
    标配: js +　go
https://www.runoob.com/go/go-range.html
https://www.runoob.com/go/go-arrays.html



### vant weApp
    https://youzan.github.io/vant-weapp/#/intro
    https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/capabilities.html#%E6%95%B0%E6%8D%AE%E5%BA%93
    serverless
        - wx.cloud.database()
        - db.collection('production')
        - productsCollection.get()

















    


    三元：https://sanyuan0704.github.io/


### github仓库上传说明
    1.git status
    2.git add .    or    git add index.html     //添加到了缓存区
    3.git commit -m 'str'                       //缓存 => 主干
    如果有问题请先执行：git pull --rebase origin master
    4.git push origin master
    
    git diff: 查看新增内容
    git log: 查看历史提交记录 //git log --pretty=oneline     HEAD表示当前版本，HEAD^代表上一个版本
    qa结束command




    版本回退：
    git reset --hard HEAD^: 退回上一个版本      //HEAD^^ 上上个版本
    git reset --hard 版本id: 退回到特定版本
    git reflog: 查看所有的版本记录

    cat file-name: 查看文件内容

    创建分支：
        git branch: 查看分支
        git checkout -b dev: 本地创建分支dev
        add     commit
        git checkout master: 切回master
        git merge dev: 版本合并
        push
        git branch -d dev: delete local dev
    

    git push origin dev: 提交







### spa single page application                                 
    http://47.98.159.95:8010/#/recommend
    protocol 协议
    ip 域名 阿里云服务器
    / 路径
    #/recommend  锚链接

    方法
        移动网站 html + css 用来借鉴
        小程序组件 

    数据来源：
        - 开源接口,
            banner
            personalized
        - 假数据























### js
    类型转换："2000" - 0;  +"2000";  +new Date();  [] + [] //"";
    强制类型转换：
        string转number：parseInt("str");      parseFloat("str可以识别小数点");    
                        Math.round("str");    number("str可以识别小数点")  出现非字符NaN
        number转string: number.toString();    number.toFix(保留几位小数)
        转Boolean类型:  Boolean(str); (除了null，undefined，空字符串，0，NaN为false)
        隐式转换：+字符串拼接， -0 *1 /1自动转为number， if（都转为Boolean）

        对象转字符串和数字和boolea值
            Boolean()  [toString()  valueOf()]
            时间戳：1970.0.0.0.0.0 ==> now 的秒数　　　new Date().valueOf()       
        Object.prototype.toString.call()
















### 微信小程序：
    项目：https://github.com/kezhenxu94/mini-github/blob/master/miniprogram/api/github.js
    小程序ID：wx49611b5069435af2
    Mdn：JavaScript
    官方文档：https://developers.weixin.qq.com/miniprogram/dev/framework/
    微信小程序开发文档：https://www.w3cschool.cn/weixinapp/
    icofont阿里巴巴矢量图     蓝湖修图     bootcdn网站     weui网站
    wx官方文档Weui组件库: https://developers.weixin.qq.com/miniprogram/dev/extended/weui/
    百度地图jsAPI：https://lbsyun.baidu.com/index.php?title=jspopularGL/guide/getkey
    -小程序的项目架构
      app.json
      应用的全局配置
      -pages 项目的基础页面
      切页面

    -小程序里css 单位rpx 尽量不使用px

### Precompile
+   precompile  happen before function open     four steps
    one: create AO object (Activation Object)
    two: find 形参和变量声明，将变量声明和形参作为AO的属性名，值为undefined 
    three: 将实参和形参值统一
    four: 在函数体里找函数声明，将函数名作为AO对象的属性名，值赋予函数体
    five: 执行

+   precompile happen in 全局
    one: create GO object
    two: find 变量声明，将变量声明GO的属性名，值为undefined
    three: 在全局里面找函数声明，将函数名作为GO对象的属性名，值赋予函数体
    four: 执行


### Error:
    1.屏幕形成滚轮难看出缩放效果


### css3: 
    background-origin(图片左上角对齐方式)
    background: pink url() no-repeat;
    background-clip(图片在内边距等区域显示)
    块级容器换行会有1px的偏差，可以在父容器上设置font-size： 0
    媒体查询：@media screen and（min-width：xxx）
    设备物理像素比 / 逻辑像素(1px)屏幕上的 = DPR
    rem单位：依据*根*字体的大小(font-size)来确定，一个rem为一个根字体的像素
    em单位：依据父容器字体大小

#### 弹性布局：设置父display：flex (jc,ai);  行内元素居中父:text-align;


### 自执行函数
    (function(parm){})(parm)
    !function(){}()              () => 运行
    img标签内置构造函数 Image()

      
### 词法作用域

    代码在执行之前需要执行编译，编译的过程分为:
+       词法化
            - 父级作用域不能取子级作用域中的字符，而子级可以取父级的
            - 执行阶段作用域的查找工作，由内到外，(只要找到第一个相应的标识符之后就会停止)
            - 全局变量会变成全局对象  var a = 10  ==> window.a = 10 

+       欺骗词法作用域
            - eval(): 函数会将传入的字符串当做 JavaScript 代码进行执行。会修改作用域
                严格模式下将会失效
                通常用来执行动态创建的代码

                console.log(eval('2 + 2'));// expected output: 4
                console.log(eval(new String('2 + 2')));// expected output: 2 + 2
                console.log(eval('2 + 2') === eval('4'));// expected output: true
                console.log(eval('2 + 2') === eval(new String('2 + 2')));// expected output: false

            - with() 更简便的对象属性赋值
                当一个对象不具备某个属性时却依然用with() 去修改该属性，那么with() 会将这个对象处理成为一个完全独立隔离的作用域,该属性也会变成该作用域中的一个词法标识符。








### es6: 
    babel:将新版本的es转换成旧版本的es
    1.var定义的变量会存在 变量提升。定义一个全局变量     "var i"
    2.let定义的变量是块级变量（声明的作用域中起作用而且块级作用域会被保留的）
        不允许重复声明变量
        声名为let i的时候，i每次使用的时候都会重新定义一个块级变量i，但是之前给i赋的值会有一个标记。
    3.const定义常量，一旦定义不可改变，且不能重复声明变量

    * es6当中的独特的数据类型
        map: (1)添加对象method()   map.set(obj,'content')

    * 正则表达式
        表达式：new RegExp('hello');  /hello/
        method:      
            检测方法: pat.test(str);    
            检索指定值并返回否则null：pat.exec(str);  
            字符串查找: str.serarch(//);            
            字符串匹配方法: str.match(/\d+/);         
            字符串替换方法: zfc2.replace(/hungry/,'snail')
                     

        [a-z]：a-z之间的字符
        [A-Z]：
        [A-z]：
        [adgk]：查找adgk四个字符
        [^adgk]：查找^除了adgk四个字符
        red|blue|green： 查找指定的选项
        . 查找单个字符，除了换行和行结束符
        \w 查找单词字符
        \W 查找非单词字符
        \d: 查找数字。
        \D: 
        \s:空格
        \S:
        \b: 匹配单词边界
        \B:
        \n:
        n+: 匹配包含至少一个n的字符串
        n*: 匹配任何包含0个或多个n的字符串
        n?: 匹配任何包含 0个或1 个n的字符串
        n{x}：匹配包含x个n的序列的字符串
        n{x, y}: 匹配包含 x个或y个 n的序列的字符串
        n$: 匹配任何结尾为n的字符串
        ^n 匹配任何开头为n的字符串















### 数组常用method()
    1.Array.map()   let arr = [1, 2, 3, 4, 5]  let newArr = arr.map(x => x*2)  
    //arr= [1, 2, 3, 4, 5]   原数组保持不变  //newArr = [2, 4, 6, 8, 10] 返回新数组
    2.强行将类数组转换成数组: Array.from([])


























## css类名命名词汇量

container 容器    960 0 auto
wrapper 容器   content
fl  float: left
p0-36rpx10rpx36rpx      padding: 0 36rpx 10rpx 36rpx;



### 结构层级

.group
    .group-bar
        .group-title   
    .group-contetn
        .group-content-item
            .group-content-item-desc
            .wrapper .group-content-item-img





### node -v
    安装live-server             
    npm i -g live-server     
    live-server --version     
    npm 包管理器
        所有设置
    npm config list
    C:\Users\ZHAMINGGUO\AppData\Roaming\npm




### 给小程序配上后端接口
    1.npm init -y  项目描述文件  .json
        GO
    2.npm run dev
    3.node index.js 入口文件
    4.npm i -g yarn   安装yarn
    5.yarn --version
    6.yarn global add nodemon 全局安装
        yarn    facebook包管理器
    * yarn global bin 添加全局path路径
    * nodemon

    * yarn global add nodemon
    * npm i -g nodemon

    yarn dev 运行
    yarn add express 安装express
    yarn add mocker-api  安装mocker-api



    **  HTTP协议  GET / banners?a=1 data
        后端  接口的形式
        1.看页面，抽象出状态数据 放在data里面
        2.onLoad 生命周期与后端交流，取出数据
        3.AppData 调试工具看是否正常显示
        4.wxml 显示数据







### ES：
    initial-scale      初始比例尺
    device-width   设备宽度
    repository        存储库
    Cyan                青色
    orange             橙色
    blod                 加粗
    animation         动画
    ease                  缓解
    requestAnimationFrame         请求动画帧
    canvas             帆布
    Identifier         标识符



### 简历
    [猛哥推荐1]:(https://github.com/SyMind/resume)
    


























   




