// pages/break/break.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isMl: true,
    isLeft: true,
    isLeft1: true,
    colorChange: true,
    colorChange1: true,
    study1: [
      {
        title: '打卡 | 丁奇带你60天重学MySQL',
        content: '33333次围观 · 45128次参与',
        commentOne: '打卡day2：今日收获 更新语句会清除缓...',
        commentTwo: '自增主键用完会停留在最后一个，报错主...'
      },
      {
        title: '7天面试集训营',
        content: '56347次围观 · 14849次参与',
        commentOne: '你准备面试了吗...',
        commentTwo: '1.遇到问题打不出来了怎么办？ 答：一...'
      },
      {
        title: '60天攻克数据结构与算法行动',
        content: '31553次围观 · 47812次参与',
        commentOne: '这段时间正好自己在看数据结构与算法...',
        commentTwo: 'Day4数组思考题2019.11.24 1.标记...'
      },
      {
        title: '左耳朵耗子带你重学《左耳听风》',
        content: '38883次围观 · 12245次参与',
        commentOne: '今天学习了分布式架构的冰与火，了解到...',
        commentTwo: '专栏《左耳听风》学习了有一部分了，正好...'
      },
      {
        title: '打卡 | 丁奇带你60天重学MySQL',
        content: '33333次围观 · 45128次参与',
        commentOne: '打卡day2：今日收获 更新语句会清除缓...',
        commentTwo: '自增主键用完会停留在最后一个，报错主...'
      },
      {
        title: '7天面试集训营',
        content: '56347次围观 · 14849次参与',
        commentOne: '你准备面试了吗...',
        commentTwo: '1.遇到问题打不出来了怎么办？ 答：一...'
      },
      {
        title: '60天攻克数据结构与算法行动',
        content: '31553次围观 · 47812次参与',
        commentOne: '这段时间正好自己在看数据结构与算法...',
        commentTwo: 'Day4数组思考题2019.11.24 1.标记...'
      },
      {
        title: '左耳朵耗子带你重学《左耳听风》',
        content: '38883次围观 · 12245次参与',
        commentOne: '今天学习了分布式架构的冰与火，了解到...',
        commentTwo: '专栏《左耳听风》学习了有一部分了，正好...'
      },
      {
        title: '8个月，攻克设计模式打卡召集令',
        content: '31823次围观 · 72469次参与',
        commentOne: '打卡第一天。设计模式的重要性当然是不...',
        commentTwo: 'day1.加班回来过完开篇词，深夜有感。...'
      }
    ],
    study: [
      {
        title: '和郭忆一起，落地数据中台！',
        content: '3183次围观 · 548次参与',
        commentOne: '落地数据中台，先把数据能力抽象出来...',
        commentTwo: '打卡'
      },
      {
        title: '21天打卡行动',
        content: '20428次围观 · 4060次参与',
        commentOne: '打卡Day16：课程：《linux性能优化实战...',
        commentTwo: '打卡Day15：课程：《linux性能优化实战...'
      },
      {
        title: '日积跬步，攻克算法 | 7天算法训练营',
        content: '31083次围观 · 5148次参与',
        commentOne: '第一天，时间空间复杂度学习心得。通过...',
        commentTwo: 'D1: 时间复杂度和空间复杂度分析 视频看...'
      },
      {
        title: '和朱晔一起，攻克java业务开发！',
        content: '35683次围观 · 51048次参与',
        commentOne: 'Day 50:今天学习了《加餐4|分析定位ja...',
        commentTwo: 'Day 10：今天学习了《04|连接池：别让...'
      },
      {
        title: '打卡 | 丁奇带你60天重学MySQL',
        content: '33333次围观 · 45128次参与',
        commentOne: '打卡day2：今日收获 更新语句会清除缓...',
        commentTwo: '自增主键用完会停留在最后一个，报错主...'
      },
      {
        title: '7天面试集训营',
        content: '56347次围观 · 14849次参与',
        commentOne: '你准备面试了吗...',
        commentTwo: '1.遇到问题打不出来了怎么办？ 答：一...'
      },
      {
        title: '60天攻克数据结构与算法行动',
        content: '31553次围观 · 47812次参与',
        commentOne: '这段时间正好自己在看数据结构与算法...',
        commentTwo: 'Day4数组思考题2019.11.24 1.标记...'
      },
      {
        title: '左耳朵耗子带你重学《左耳听风》',
        content: '38883次围观 · 12245次参与',
        commentOne: '今天学习了分布式架构的冰与火，了解到...',
        commentTwo: '专栏《左耳听风》学习了有一部分了，正好...'
      },
      {
        title: '8个月，攻克设计模式打卡召集令',
        content: '31823次围观 · 72469次参与',
        commentOne: '打卡第一天。设计模式的重要性当然是不...',
        commentTwo: 'day1.加班回来过完开篇词，深夜有感。...'
      },
      {
        title: '20年架构老兵邀你一起打卡，带你进阶资深架构师',
        content: '36545次围观 · 16458次参与',
        commentOne: '好...',
        commentTwo: '订单服务功能的划分...'
      },
      {
        title: '打卡10天，带你从原理到实战落地敏捷',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '打卡学习，成为真正的性能测试高手',
        content: '283次围观 · 7855次参与',
        commentOne: '打卡1：今天学习，收获了啥？当我把性...',
        commentTwo: '第一天，持续补课中......已完成30%一定...'
      },
      {
        title: '来参加打卡，攻克工作中80%的安全问题',
        content: '3123次围观 · 78775次参与',
        commentOne: '今天开始跟着老师学习安全，安全在系统...',
        commentTwo: '今天学习了四中访问控制（授权）及各自...'
      },
      {
        title: '21天打卡，Facebook工程师带你攻克性能工程',
        content: '312次围观 · 7855次参与',
        commentOne: '今天学习性能02课，收获了：对代码和程...',
        commentTwo: 'day2 nginx100讲 负载均衡Nginx提供...'
      },
      {
        title: '打卡学习C++，拒绝从入门到放弃',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '一起来参加21天打卡计划，搞定后段技术基础',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '为了让你精通MongoDB，我发起了这次打卡',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '打卡46天，彻底搞定JavaScript',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '每天早起运动，坚持一个月会发生什么',
        content: '31283次围观 · 78565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      },
      {
        title: '《左耳听风》ARTS学习打卡',
        content: '3123次围观 · 7565次参与',
        commentOne: '敏捷，从今天开始...',
        commentTwo: '加油 第一天...'
      }
    ]
  },
  transplan() {
    this.setData({
      isMl: true,
      isLeft:true,
      isLeft1:true
    })
  },
  transplan1() {
    this.setData({
      isMl: false,
      isLeft: false,
      isLeft: false
    })
  },













  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})