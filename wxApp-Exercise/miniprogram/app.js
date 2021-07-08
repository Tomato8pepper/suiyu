//app.js
import util from './utils/index';
App({
  onLaunch: function () {
    
    if (!wx.cloud) {
      console.error('请使用 2.2.3 或以上的基础库以使用云能力')
    } else {
      wx.cloud.init({
        // env 参数说明：
        //   env 参数决定接下来小程序发起的云开发调用（wx.cloud.xxx）会默认请求到哪个云环境的资源
        //   此处请填入环境 ID, 环境 ID 可打开云控制台查看
        //   如不填则使用默认环境（第一个创建的环境）
        // env: 'my-env-id',
        traceUser: true,
      })
    }

    wx.db = {}
    wx.db.url = (url) => {
      return `https://api.douban.com${url}`
    }
    // 用户设备info
    let info = wx.getSystemInfoSync()
    wx.db.statusBarHeight = info.statusBarHeight

    if(info.platform === 'android') {
      wx.db.navBarHeight = 48
    }
    else{
      wx.db.navBarHeight = 44
    }

    util.getStorageData('visited', (data) => {
      this.globalData.visitedArticles = data;
    })
    wx.getSetting({
      success: (res)=>{
        if(res.authSetting['scope.userInfo']) {
          wx.getUserInfo({
            success: (res)=>{
              console.log(res);
            },
          });        
        }
      },
    });
    this.globalData = {
      user: {
        name: '',
        avator: ''
      },
      visitedArticles: ''
    }
  }
})
