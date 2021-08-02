<template>
  <div>
    <swipe url="getlunbo"></swipe>
    <div class="grid">
      <my-ul>
        <my-li v-for="(mode, index) in modes" :key="index">
          <router-link :to="mode.route">
            <span :class="mode.className"></span>
            <div>{{ mode.title }}</div>
          </router-link>
        </my-li>
      </my-ul>
    </div>
  </div>
</template>

<script>
import swipe from './common/swipe.vue';
export default {
  components: { swipe },
  data() {
    return {
      modes: [
        {
          title: "新闻资讯",
          className: "back-news",
          route: { name: "newsList" },
        },
        {
          title: "图文分享",
          className: "back-pic",
          route: { name: "PhotoList", query: { categoryId: 0 } },
        },
        {
          title: "商品展示",
          className: "back-goods",
          route: { name: "GoodShow", params: {page: 1} },
        },
        {
          title: "留言反馈",
          className: "back-feed",
          route: { name: "home" },
        },
        {
          title: "搜索咨询",
          className: "back-search",
          route: { name: "home" },
        },
        {
          title: "联系我们",
          className: "back-callme",
          route: { name: "home" },
        },
      ],
    };
  },
  created() {
    
  },
};
</script >

<style scoped>
.mint-swipe {
  width: 100%;
  height: 200px;
  margin-bottom: 30px;
}
.mint-swipe img {
  width: 100%;
}
.grid span {
  display: inline-block;
  margin: 10px 0;
  width: 50px;
  height: 50px;
  background-repeat: round;
}
.back-news {
  background-image: url(../assets/news.png);
}
.back-pic {
  background-image: url(../assets/picShare.png);
}
.back-goods {
  background-image: url(../assets/goodsShow.png);
}
.back-feed {
  background-image: url(../assets/feedback.png);
}
.back-search {
  background-image: url(../assets/search.png);
}
.back-callme {
  background-image: url(../assets/callme.png);
}
</style>