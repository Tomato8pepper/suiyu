const STAR_ON = "/assets/img/rating_star_small_on.png"
const STAR_OFF = "/assets/img/rating_star_small_off.png"
const STAR_HALF = "/assets/img/rating_star_small_half.png"
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    score: {
      type: Number,
      observer: function (newVal, oldVal, path) {
        let stars = [STAR_OFF, STAR_OFF, STAR_OFF, STAR_OFF, STAR_OFF]
        if (newVal > 0) {
          newVal = newVal / 10
          let floor = Math.floor(newVal)
          if (floor !== newVal) {
            stars[floor] = STAR_HALF
          }
          for (let i = 0; i < floor; i++) {
            stars[i] = STAR_ON
          }
        }
        this.setData({
          stars: stars
        })
      },
      // value: 0
    },
    iconSize: {
      type: String,
      value: '26rpx'
    }
  },


  lifetimes: {
    attached: function () {
      // let num = this.data.score
      // console.log(num)
      // if(num >= 5){
      //   this.setData({
      //     i : 5
      //   })
      //   return
      // }
      // let i1 = parseInt(num)
      // console.log(i1)
      // let j1 = num - i1
      // let j2 = 0
      // if(j1 <= 0){
      //   j2 = 0
      // }
      // else{
      //   j2 = 1
      // }
      // let k1 = 5 - j2 -j1
      // this.setData({
      //   i: i1,
      //   j: j2,
      //   k: k1
      // })


    }
  },







  /**
   * 组件的初始数据
   */
  data: {
    // i: 0,
    // j: 0,
    // k: 0
    stars: [STAR_OFF, STAR_OFF, STAR_OFF, STAR_OFF, STAR_OFF]
  },

  /**
   * 组件的方法列表
   */
  methods: {

  }
})
