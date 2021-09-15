const db = require('./db.js')
module.exports = {
    //xxx: () => db.q('xxx')
    getlunbo() {
        let message = [
            {
                src: "http://localhost:3000/img/1.jpg",
            },
            {
                src: "http://localhost:3000/img/2.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/5.jpg",
            },
            {
                src: "http://localhost:3000/img/6.jpg",
            },
            {
                src: "http://localhost:3000/img/7.jpg",
            },
            {
                src: "http://localhost:3000/img/8.jpg",
            },
        ]
        return message
    },
    getnewslist() {
        let message = [
            {
                id: 01,
                title: '从CSS 样式代码插入的形式来看基本可以分为以下3种',
                add_time: '2020-04-27',
                zhaiyao: '从CSS 样式代码插入的形式来看基本可以分为以下3种',
                click: 2,
                img_url: "http://localhost:3000/img/1.jpg",
            },
            {
                id: 02,
                title: '选择器种类',
                add_time: '2020-04-28',
                zhaiyao: '选择器种类',
                click: 6,
                img_url: "http://localhost:3000/img/2.jpg",
            },
            {
                id: 03,
                title: '继承',
                add_time: '2020-04-28',
                zhaiyao: '继承',
                click: 6,
                img_url: "http://localhost:3000/img/3.jpg",
            },
            {
                id: 04,
                title: '选择器的优先级',
                add_time: '2020-04-28',
                zhaiyao: '选择器的优先级',
                click: 6,
                img_url: "http://localhost:3000/img/4.jpg",
            },
            {
                id: 05,
                title: 'font-family、font-size、font-weight、font-style、line-height',
                add_time: '2020-04-28',
                zhaiyao: 'font-family、font-size、font-weight、font-style、line-height',
                click: 6,
                img_url: "http://localhost:3000/img/5.jpg",
            },
        ]
        return message
    },
    getnew(id) {
        let message1 = [
            {
                id: 01,
                title: '从CSS 样式代码插入的形式来看基本可以分为以下3种',
                add_time: '2020-04-27',
                click: 2,
                content: `<p>1. 内联式</br>
                2. 嵌入式</br>
                3. 外部式</br>
                css样式是在的相同权值的情况下:内联式 》 嵌入式 》 外部式</p>`,
            },
            {
                id: 02,
                title: 'CSS3包含3种基本的布局模型',
                add_time: '2020-04-28',
                click: 6,
                content: `1、流动模型（Flow）</br>（1）块状元素自上而下 </br>（2）内联元素从左往右</br>
                2、浮动模型 (Float)</br>
                3、层模型（Layer）</br>
                    层模型有三种形式：</br>
                    1、绝对定位(position: absolute)</br>
                    2、相对定位(position: relative)</br>
                    3、固定定位(position: fixed)</br>,`
            },
            {
                id: 03,
                title: '弹性盒模型 - 弹性盒模型之flex属性 ',
                add_time: '2020-04-28',
                click: 6,
                content: `1、设置display: flex属性可以把块级元素在一排显示。</br>
                2、flex需要添加在父元素上，改变子元素的排列顺序。</br>
                3、默认为从左往右依次排列,且和父元素左边没有间隙。</br>
            
            操作一下横轴- 使用justify-content属性设置横轴排列方式</br>
                justify-content: flex-start | flex-end | center | space-between | space-around;</br>
            
            操作一下竖轴- 使用align-items属性设置纵轴排列方式</br>
                align-items: flex-start | flex-end | center | baseline | stretch;,</br>`
            },
            {
                id: 04,
                title: '水平居中设置-行内元素',
                add_time: '2020-04-28',
                click: 6,
                content: `如果被设置元素为文本、图片等行内元素时，水平居中是通过给父元素设置 text-align:center 来实现的。</br>
                水平居中设置-定宽块状元素:        (1)width:200px;</br>
                                                (2)margin:30px auto;,</br>`
            },
            {
                id: 05,
                title: 'background-size 属性',
                add_time: '2020-04-28',
                click: 6,
                content: `1、定义：</br>
                background-size 用来调整背景图像的尺寸大小。</br>
        
            2、语法：</br>
                以下为引用内容：</br>
                background-size : contain | cover | 100px 100px | 50% 100%;</br>
        
            3、参数：</br>
                background-size：contain; // 缩小图片来适应元素的尺寸（保持像素的长宽比）；</br>
                background-size ：cover; // 扩展图片来填满元素（保持像素的长宽比）；</br>
                background-size ：100px 100px; // 调整图片到指定大小；</br>
                background-size ：50% 100%; // 调整图片到指定大小，百分比相对于包含元素的尺寸。</br>`,
            },
        ]
        let message = []
        message1.forEach((item, index) => {
            if (item.id === id - 0) {
                console.log(item);
                message[0] = item
            }
        })
        return message
    },
    getimages(cateid) {
        let message = [
            [{
                id: 0,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/3.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 1,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 2,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 3,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 4,
                title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 5,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            },
            {
                id: 6,
                title: '好好学习，天天向上',
                img_url: 'http://localhost:3000/img/5.jpg',
                zhaiyao: '这个小姐姐好漂亮哦，别看好好学习'
            }],
            [
                {
                    id: 0,
                    title: '好好学习，天天向上',
                    img_url: 'http://localhost:3000/img/4.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 1,
                    title: '好好学习，天天向上',
                    img_url: 'http://localhost:3000/img/4.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                }
            ],
            [
                {
                    id: 0,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/5.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 1,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/5.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id:2,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/5.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 3,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/5.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                }
            ],
            [
                {
                    id: 0,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/6.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 1,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/6.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 2,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/6.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 3,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/6.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                }
            ],
            [
                {
                    id: 0,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/7.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 1,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/7.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 2,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/7.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 3,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/7.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                }
            ],
            [
                {
                    id: 0,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/8.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 1,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/8.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 2,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/8.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                },
                {
                    id: 3,
                    title: '法律焚膏继晷风格很反恢复规划水来得及啊',
                    img_url: 'http://localhost:3000/img/8.jpg',
                    zhaiyao: '解放路开始的减肥士大夫士大夫是大法官电话费'
                }
            ]

        ]
        
        return message[cateid]
    },
    getimgcategory() {
        let message = [
            {
                title: '家居生活',
                id: 1
            },
            {
                title: '摄影设计',
                id: 2
            },
            {
                title: '青春靓丽',
                id: 3
            },
            {
                title: '好好学习',
                id: 4
            },
            {
                title: '天天向上',
                id: 5
            }
        ]
        return message
    },
    getthumimages(imgid) {
        let message = [
            [{
                src: "http://localhost:3000/img/8.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            },
            {
                src: "http://localhost:3000/img/6.jpg",
            }],
            [{
                src: "http://localhost:3000/img/1.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/7.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/2.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/6.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/3.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/7.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/7.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/8.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/3.jpg",
            }],
            [{
                src: "http://localhost:3000/img/7.jpg",
                name: "title",
            },
            {
                src: "http://localhost:3000/img/4.jpg",
            },
            {
                src: "http://localhost:3000/img/2.jpg",
            }],
        ]
        return message[imgid]
    },
    getimageInfo(imgid) {
        let message = [
            {
                title: '房价要跌了，大伙赶紧准备去买房呀，噜啦噜啦给对方感受到颠大范甘迪分工嘞绿绿绿绿',
                add_time: '2020-04-27',
                click: 2,
                content: "<p>福利局阿萨德连放假啦的酸辣粉记录上的解放啦圣诞节放假伤的肺类设计色发色肤水机的酸辣粉橘色金佛山塑料袋副教授乐福酸辣粉双丰收了佛</p>",
            },
            {
                title: '及分类撒旦教弗兰克，噜啦噜的鬼地方个冬瓜豆腐啦嘞绿绿绿绿',
                add_time: '2020-04-28',
                click: 6,
                content: "<p>福利局阿萨德连放假啦的酸辣粉记录上的解放啦圣诞节放假伤的肺类设计色发色肤水机的酸辣粉橘色金佛山塑料袋副教授乐福酸辣粉双丰收了佛</p>",
            },
            {
                title: '及分类撒旦教弗兰克，噜啦噜大哥电饭锅电饭锅啦嘞绿绿绿绿',
                add_time: '2020-04-28',
                click: 6,
                content: "<p>福利局阿萨德连放假啦的酸辣粉记录上的解放啦圣诞节放假伤的肺类设计色发色肤水机的酸辣粉橘色金佛山塑料袋副教授乐福酸辣粉双丰收了佛</p>",
            },
            {
                title: '发送到发送到的所发生的啦噜啦嘞绿绿绿绿',
                add_time: '2020-04-28',
                click: 6,
                content: "<p>福利局阿萨德连放假啦的酸辣粉记录上的解放啦圣诞节放假伤的肺类设计色发色肤水机的酸辣粉橘色金佛山塑料袋副教授乐福酸辣粉双丰收了佛</p>",
            },
            {
                title: '及分类还让他海富通海富通嘞绿绿绿绿',
                add_time: '2020-04-28',
                click: 6,
                content: "<p>福利局阿萨德连放假啦的酸辣粉记录上的解放啦圣诞节放假伤的肺类设计色发色肤水机的酸辣粉橘色金佛山塑料袋副教授乐福酸辣粉双丰收了佛</p>",
            },
        ]
        return message
    },
    getgoods() {
        let message = [
            {
                id: 1,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/1.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 2,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/5.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 3,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/2.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 4,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/3.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 5,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/4.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 6,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/4.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 7,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/5.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 8,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/6.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 9,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/7.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            },
            {
                id: 10,
                title: 'xxxx',
                add_time: '1224-10-23',
                zhaiyao: 'xxx',
                click: 0,
                img_url: 'http://localhost:3000/img/8.jpg',
                sell_price: 1111,
                market_price: 2354,
                stock_quantity: 60
            }
        ]
        return message
    },
    getinfo (imgid) {
        let message = [
            {
                id: 0,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 1,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id:2,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id:3,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 4,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 5,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 6,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 7,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 8,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 9,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 10,
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            }
        ]
        return message[imgid]
    },
    getshopcarlist (idArr) {
        let message = [
            {
                id: 0,
                thumb_path: 'http://localhost:3000/img/1.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 1,
                thumb_path: 'http://localhost:3000/img/7.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id:2,
                thumb_path: 'http://localhost:3000/img/2.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 3,
                thumb_path: 'http://localhost:3000/img/3.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 4,
                thumb_path: 'http://localhost:3000/img/4.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 5,
                thumb_path: 'http://localhost:3000/img/5.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 6,
                thumb_path: 'http://localhost:3000/img/6.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 7,
                thumb_path: 'http://localhost:3000/img/6.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 8,
                thumb_path: 'http://localhost:3000/img/6.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 9,
                thumb_path: 'http://localhost:3000/img/6.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            },
            {
                id: 10,
                thumb_path: 'http://localhost:3000/img/6.jpg',
                title: '好好学习，天天向上',
                market_price: 3333,
                sell_price: 2355,
                goods_no: 23453325,
                stock_quantity: 33,
                add_time: 2020-06-02,
            }
        ]
        let message1 = []
        for (let i = 0; i < idArr.length; i++) {
            let j = idArr[i]
            message1[i] = message[j]
        }
        return message1
    }

}