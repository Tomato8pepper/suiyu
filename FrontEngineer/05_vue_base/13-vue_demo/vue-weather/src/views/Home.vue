<template>
  <div class="home">
    <div class="address">
      <div class="nav">
        <p class="time">{{localTime}}</p>
        <span class="change-city">切换城市</span>
      </div>
      <div class="city-info">
        <p class="city-name">{{cityWeather.city}}</p>
        <p class="city-temp">{{cityWeather.temperature}}℃</p>
        <p class="weather-detail">
          <span class="sp">风向:{{cityWeather.windDirection}}</span>
          <span class="sp">风力:{{cityWeather.windPower}}</span>
          <span class="sp">空气湿度:{{cityWeather.humidity}}%</span>
        </p>
      </div>
    </div>
    <div class="feature">
      <div class="group" v-if="cityFutureWeather.length > 0">
        明日:
        <span class="tm">白天:{{cityFutureWeather[1].dayTemp}}--{{cityFutureWeather[1].dayWeather}}--{{cityFutureWeather[1].dayWindDir}}--{{cityFutureWeather[1].dayWindPower}}</span>&nbsp;&nbsp;&nbsp;
        <span class="tm">夜间:{{cityFutureWeather[1].nightTemp}}--{{cityFutureWeather[1].nightWeather}}--{{cityFutureWeather[1].nightWindDir}}--{{cityFutureWeather[1].nightWindPower}}</span>
      </div>
      <div class="group">
        后天:
        <span class="tm">白天:{{cityFutureWeather[2].dayTemp}}--{{cityFutureWeather[2].dayWeather}}--{{cityFutureWeather[2].dayWindDir}}--{{cityFutureWeather[2].dayWindPower}}</span>&nbsp;&nbsp;&nbsp;
        <span class="tm">夜间:{{cityFutureWeather[2].nightTemp}}{{cityFutureWeather[2].nightWeather}}{{cityFutureWeather[2].nightWindDir}}{{cityFutureWeather[2].nightWindPower}}</span>
      </div>
    </div>
    <div class="map-container" ref="mapContainer"></div>
  </div>
</template>2
<script>
export default {
  data() {
    return {
      localTime: "",
      cityWeather: {},
      cityFutureWeather: []
    };
  },
  created() {
    setInterval(() => {
      this.localTime = this.getCurrentTime();
    }, 1000);
  },
  mounted() {
    this.initMap();
  },
  methods: {
    getCurrentTime() {
      return new Date().toLocaleTimeString();
    },
    initMap() {
      let self = this;
      // 初始化地图
      new AMap.Map("mapContainer", {
        resizeEnable: true,
      });
      // ip定位当前信息
      AMap.plugin("AMap.CitySearch", function () {
        var citySearch = new AMap.CitySearch();
        console.log('当前城市', citySearch)
        citySearch.getLocalCity(function (status, result) {
          if (status === "complete" && result.info === "OK") {
            // 查询成功，result即为当前所在城市信息
            console.log(result);
            self.getCityWeather(result.city);
          }
        });
      });
    },
    getCityWeather(cityname) {
      let self = this;
      // 加载天气查询插件
      AMap.plugin("AMap.Weather", function () {
        //创建天气查询实例
        var weather = new AMap.Weather();
        //执行实时天气信息查询
        weather.getLive(cityname, function (err, data) {
          console.log(data)
          self.cityWeather = data;
        });
        // 执行今天以及未来三天的天气信息查询
        weather.getForecast(cityname, function (err, data) {
          console.log(data);
          self.cityFutureWeather = data.forecasts
        });
      });
    },
  },
};
</script>

<style scoped>
.home {
  padding: 10px;
  height: 100vh;
  box-sizing: border-box;
  background: #000;
  opacity: 0.7;
  color: #fff;
}
.nav {
  display: flex;
  justify-content: space-between;
}
.city-info {
  text-align: center;
  margin: 20px 0px;
  line-height: 2;
}
.city-temp {
  font-size: 40px;
}
.sp{
  margin-right: 10px;
}
.feature {
  width: 100%;
}
.feature .group {
  height: 44px;
  line-height: 44px;
  background-color: rgba(255, 255, 255, 0.26);
  border-radius: 4px;
  color: #fff;
  font-size: 16px;
  margin-bottom: 10px;
  padding: 0 10px;
}
.group.tm {
  font-size: 20px;
}
</style>