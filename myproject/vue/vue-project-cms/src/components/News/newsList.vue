<template>
  <div >
    <nav-bar :title="title"></nav-bar>
    <!-- 新闻列表 -->
    <div class="demo">
      <ul>
        <li v-for="(news, index) in newsList" :key="index">
          <router-link class="a" :to="{ name: 'NewsDetail', params: { id: news.id } }">
            <img class="" :src="news.img_url" />
            <div>
              <span>{{ news.title }}</span>
              <div class="news-desc">
                <p>点击数:{{ news.click }}</p>
                <p>
                  发表时间:{{ news.add_time | converTime("YYYY年MM月DD日") }}
                </p>
              </div>
            </div>
          </router-link>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "新闻列表",
  data() {
    return {
      title: "新闻列表",
      newsList: [
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          },
          {
              id: 13,
              title: '1季度多家企业利润超50%,去库存促销战打响了。',
              add_time: '2015-04-16T03:50:28.000Z',
              zhaiyao: '房企一季度销售业绩陆续公布',
              click: 1,
              img_url: 'https://scpic2.chinaz.net/Files/pic/pic9/202011/hpic3155_s.jpg'
          }
      ], //新闻列表数据
    };
  },
  methods: {},
  created() {
    // this.$axios
    //   .get("getnewslist")
    //   .then((res) => {
    //     // console.log(res);
    //     this.newsList = res.data.message;
    //   })
    //   .catch((err) => console.log(err));
  },
};
</script>

<style scoped>
.demo .a {
  display: block;
  width: 330px;
  height: 44px;
  color: #000;
  padding-left: 15px;
}
.demo img {
  float: left;
  width: 42px;
  height: 42px;
  margin-right: 20px;
}
.demo .a div {
  float: left;
  width: 238px;
  margin-right: 20px;
}
.demo span {
  display: block;
  width: 100%;
  font-size: 17px;
  line-height: 21px;
}
.demo .a p {
  float: left;
  color: #0bb0f5;
  font-size: 14px;
  line-height: 21px;
}
.demo p:nth-child(2) {
  float: right;
}

.demo ul {
  padding: 0;
}
.cms-s-header{
    background-color: #f7f7f7;
}
.tmpl h1{
    display: inline-block;
}
.page-title{
    margin-left: 25%;
}
.line {
    margin-left: 16px;
    transform: scaleY(.5);
    border-bottom: 1px solid #c8c7cc;
}
.news-desc{
    width: 375px;
    display: flex;
    flex-flow: nowrap;
}
</style>