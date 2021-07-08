stylus  ->   css
wxml {{}}  ->  html
typescript  ->  js     


- react react-dom  react 开发框架
- react-scripts 编译支持
- react 框架  
    CSS setData {{}} 




yarn add react react-dom react-scripts
yarn add typescript -D    (-D 开发阶段依赖)

1. npm run start    // package.json文件中scripts{命令}   
   react-scripts    // 生产车间
-   script react-scripts start
-   src/index.js  #root  ReactDOM.render(<App/>, rootElement)   
-   返回 html 的函数组件
-   public/index.html

-   组件化
    import 来打理
    App 根组件
    MyComponent 子组件
    数据接口:   wx.request -> ajax  fetch
    生命周期  onLoad  -> ?
    pages 切换 react-router