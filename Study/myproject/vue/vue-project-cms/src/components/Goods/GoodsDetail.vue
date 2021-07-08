<template>
  <div>
    <nav-bar title="商品详情" />
    <div class="outer-swiper">
      <div class="swiper">
        <my-swipe :imgs="imgs" />
      </div>
    </div>
    <div class="product-desc">
      <ul>
        <li>
          <span class="product-desc-span">
            {{ info.title }}
          </span>
        </li>
        <li class="price-li">
          市场价： <s>￥{{ info.market_price }}</s> 销售价：<span
            >￥{{ info.sell_price }}</span
          >
        </li>
        <li class="number-li">
          购买数量：<span @click="substract">-</span><span>{{ buyNum }}</span
          ><span @click="add">+</span>
        </li>
        <li>
          <mt-button type="primary">立即购买</mt-button>
          <mt-button type="danger" @click="addShopcart">加入购物车</mt-button>
        </li>
      </ul>
    </div>
    <!-- 过渡效果内置组件 -->
    <transition name="ball" @after-enter="afterEnter">
      <div class="ball" v-if="isShow"></div>
    </transition>
    <div class="product-props">
      <ul>
        <li>商品参数</li>
        <li>商品货号：{{ info.goods_no }}</li>
        <li>库存情况：{{ info.stock_quantity }}件</li>
        <li>上架时间：{{ info.add_time | converTime("YYYY-MM-DD") }}</li>
      </ul>
    </div>
    <div class="product-info">
      <ul>
        <li>
          <mt-button type="primary" size="large" plain @click="goGoodsInfo"
            >图文介绍</mt-button
          >
        </li>
        <li>
          <mt-button type="danger" size="large" plain @click="goGoodsComment"
            >商品评论</mt-button
          >
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
import GoodsTools from '@/GoodsTools'
import myBus from "@/myBus";
export default {
  data() {
    return {
      isShow: false,
      buyNum: 1,
      goodsId: this.$route.query.id,
      info: {
        id: 23,
        title: "华为荣耀九",
        market_price: 2220,
        sell_price: 1999,
        goods_no: "SD123568",
        stock_quantity: 20,
        add_time: "2020-12-29T15:26:45",
      }, // 商品信息
      imgs: [
        {
          src:
            "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3363295869,2467511306&fm=26&gp=0.jpg",
        },
        {
          src:
            "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1639829983,1524205132&fm=26&gp=0.jpg",
        },
        {
          src:
            "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2631334549,246605465&fm=26&gp=0.jpg",
        },
      ], // 轮播图
    };
  },
  methods: {
    goGoodsInfo() {
      // 直接进入到新闻详情
      this.$router.push({
        name: "NewsDetail",
        params: {
          id: this.$route.query.id,
        },
      });
    },
    goGoodsComment() {
      this.$router.push({
        name: "GoodsComment",
        query: { id: this.$route.query.id },
      });
    },
    addShopcart() {
      this.isShow = true;
    },
    add() {
      if (this.buyNum === 0) {
        this.buyNum = 0;
      }
      this.buyNum++;
    },
    substract() {
      if (this.info.stock_quantity === this.buyNum) {
        this.buyNum = this.info.stock_quantity;
      }
      this.buyNum--;
    },
    afterEnter() {
      this.isShow = false;
      // 加入数据
      GoodsTools.addShopcart({
        id: this.info.id,
        num: this.buyNum,
      });
      myBus.$emit("addShopcart", this.buyNum);
    },
  },
  created() {
    // 商品轮播图 getthumimages/:imgid
    // 商品信息 goods/getinfo/：goodsid
    // 请求一个失败了，就算做失败
    // let imgReq = this.$axios.get(`getthumimages/${this.goodsId}`);
    // let infoReq = this.$axios.get(`goods/getinfo/${this.goodsId}`);
    // // 合并请求 $axios.all([]).then(传播响应).catch()
    // this.$axios.all([imgReq,infoReq])
    // .then(
    //     this.$axios.spread(
    //         (imgRes,infoRes)=>{
    //             this.imgs = imgRes.data.message;
    //             this.info = infoRes.data.message[0];
    //      })
    // )
    // .catch(console.log)
  },
};
</script>
<style scoped>
.ball-enter-active {
  animation: bounce-in 1s;
}

@keyframes bounce-in {
  0% {
    transform: translate3d(0, 0, 0);
  }
  50% {
    transform: translate3d(140px, -50px, 0);
  }
  75% {
    transform: translate3d(160px, 0px, 0);
  }
  100% {
    transform: translate3d(140px, 300px, 0);
  }
}

.swiper {
  border: 1px solid rgba(0, 0, 0, 0.2);
  margin: 8px;
  width: 95%;
  border-radius: 15px;
  overflow: hidden;
}

.outer-swiper,
.product-desc,
.product-props,
.product-info {
  border-radius: 5px;
  border: 1px solid rgba(0, 0, 0, 0.2);
  margin: 3px;
}

/*请ulpadding*/

.outer-swiper ul,
.product-desc ul,
.product-props ul,
.product-info ul {
  padding: 0;
}

.product-desc ul li,
.product-props ul li,
.product-info ul li {
  list-style: none;
  font-size: 15px;
  color: rgba(0, 0, 0, 0.5);
  margin-top: 8px;
}

.product-desc ul > :nth-child(1) span {
  color: blue;
  font-size: 22px;
  font-weight: bold;
}

.product-desc ul > :nth-child(1) {
  border-bottom: 1px solid rgba(0, 0, 0, 0.5);
}

.product-desc ul,
.product-info ul,
.product-props ul {
  padding-left: 10px;
}

.price-li span {
  color: red;
  font-size: 25px;
}

.price-li s {
  margin-right: 16px;
}

/*加减*/

.number-li span {
  display: inline-block;
  border: 2px solid rgba(0, 0, 0, 0.1);
  width: 25px;
}

/*商品参数*/

.product-props ul > :nth-child(1) {
  text-align: left;
}

.product-props ul:not(:nth-child(1)) {
  margin-left: 40px;
}

.product-info ul {
  margin-bottom: 70px;
  padding: 0 5;
}

.number-li span {
  text-align: center;
}

.number-li > :nth-child(2) {
  width: 40px;
}

.ball {
  border-radius: 50%;
  background-color: red;
  width: 24px;
  height: 24px;
  position: absolute;
  top: 440px;
  left: 120px;
  display: inline-block;
  z-index: 9999;
}
</style>
