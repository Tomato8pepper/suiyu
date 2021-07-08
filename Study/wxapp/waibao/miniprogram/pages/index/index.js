//index.js
const app = getApp()

// 数据库
// 获得数据库对象
const db = wx.cloud.database()
// 获得projects表中photos属性
// const photos = db.collection('project')
const project = db.collection('project')

Page({
  data: {
    title: " ",
    images: []
  },
  changeTitle(event){
    console.log(event.detail)
    this.setData({
      title: event.detail
    })
  },
  upload() {
    wx.chooseImage({
      count: 9,
      sizeType: ['original', 'compressed'],
      sourceType: ['album', 'camera'],
      success: (res) =>{
        // 1.本地地址
        // 2.云端
        // 3.this.data.images []
        const images = []
        let idx = 0;
        const tempFilePaths = res.tempFilePaths
        for(let filePath of tempFilePaths){
          let tempFileName = (+　new Date() + Math.floor (Math.random () * 1000)) + '.png'
          console.log(tempFileName)
          // 云存储更新
          wx.cloud.uploadFile({
            cloudPath: tempFileName,
            filePath: filePath,
            fail: error =>{
              idx++
              console.log("上传失败！！！")
            },
            success: (res) =>{
              idx++
              images.push(res.fileID)
              if(idx == tempFilePaths.length){
                console.log('上传成功')
                this.setData({
                  images
                })
              }
            }
          })
        }
      }
    })
  },
  createProject() {
    project.add({
      data: {
        title: this.data.title,
        images: this.data.images,

      }
    }).then(res =>{
      wx.showToast({
        title: "发布项目成功",
        icon: 'success'
      })
    }).catch(err =>{
      wx.showToast({
        title: '发布项目失败',
        icon:'error'
      })
    })
  }
})