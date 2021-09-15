// pages/forum/forum.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    element: [
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      }
    ],
    element2: [
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      },
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      }
    ],
    element3: [
      {
        images: "../image/touxiang.jpg",
        number: 142,
        price: 44
      }
    ],
    left1: '37rpx',
    left2: '750rpx',
    left3: '1500rpx',
    isLeft: '90rpx'
  },
  transfrom1(){
    this.setData({
      left1: '37rpx',
      left2: '750rpx',
      left3: '1500rpx',
      isLeft: '90rpx'
    })
  },
  transfrom2(){
    this.setData({
      left1: '-750rpx',
      left2: '37rpx',
      left3: '750rpx',
      isLeft: '329rpx'
    })
  },
  transfrom3(){
    this.setData({
      left1: '-1500rpx',
      left2: '-750rpx',
      left3: '37rpx',
      isLeft: '560rpx'
    })
  },
  switchTo(){
    wx.navigateTo({
      url: '/pages/switchto/switchto',
      success: function(res){
        console.log(res)
      }
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