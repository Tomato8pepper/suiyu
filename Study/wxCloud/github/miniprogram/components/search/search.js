// components/search/search.js
Component({
  /**
   * 组件的属性列表
   */
  classes: ['cancel-class'],
  properties: {
    placeholder: String,
    customClass: String
  },
  data: {

  },
  // search ？ 父子关系
  methods: {
    onChange: function onChange (event){
      // console.log(event);
     this.triggerEvent('search',event.detail)
    }
  }
})
