// pages/main/main.js
Page({
  /**
   * 页面的初始数据
   */
  data: {
    isLeft: true,
    indicatorDots: true,
    autoplay: true,
    interval: 2000,
    duration: 1000,
    circular: true,
    imgUrls: [
      'https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1313942587,2661284413&fm=26&gp=0.jpg',
      'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1999921673,816131569&fm=26&gp=0.jpg',
      'https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1963304009,2816364381&fm=26&gp=0.jpg'
    ],
    movieList: [
      {
        isShow: 0,
        name: "第一次的离别",
        imgUrl: "https://p1.meituan.net/moviemachine/4ea68a0de8949d99fd7ff426b84d3c381761878.jpg@1l_1e_1c_128w_180h",
        actor: "艾萨·亚森,凯丽比努尔·热合米图力,艾力乃孜·热合米图力",
        time: "2020-07-20",
        wantSee: '9745'
      },
      {
        isShow: 1,
        name: "璀璨薪火3D",
        imgUrl: "https://p0.meituan.net/moviemachine/1b6ca45db703c6df1c1ad8412ad0639a633073.jpg@1l_1e_1c_128w_180h",
        actor: "泰勒斯威夫特, 牛津",
        time: "2020-07-20",
        wantSee: '1248'
      }
    ]
  },
  tabChangeWaiting() {   //function tabChangeWaiting() {}
    // console.log('点击了即将上映')
    this.setData({      //this.setData.isLeft = false无效
      isLeft: false
    })
  },
  tabChangeWaiting1() {
    this.setData({
      isLeft: true
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