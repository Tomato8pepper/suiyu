<template>
  <div class="detail">
      <h1>computer</h1>
      <div class="price">
          {{totalPrice}}元
      </div>
      <div class="news" >
          <ul>
              <li v-for="(item, index) in reverseNews"  :key="index" >
                  {{item.title}}--{{item.data}}       
              </li>
          </ul>
      </div>
  </div>
</template>

<script>
export default {
    data() {
        return {
            price: 100,
            num: 4,
            news: [
                { title: '袁隆平爷爷90岁生日前去理发', data: '2020/08/24' },
                { title: '袁隆平爷爷90岁生日前去理发', data: '2020/08/25' },
                { title: '袁隆平爷爷90岁生日前去理发', data: '2020/08/26' },
                { title: '袁隆平爷爷90岁生日前去理发', data: '2020/08/27' }
            ]
        }
    },
    computed: {
        totalPrice: function () {
            return this.price * this.num
        },
        reverseNews: function () {
            let news = this.news
            return news.reverse()
        }
    }
}
</script>

<style>

</style>