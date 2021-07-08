## SPA服务端渲染

单页应用
所有内容都写在一个 index.html
npm run build 打包

用户访问  index.html (<div id="root"></div>)
 -> <script>  ->  发起请求  -> js执行，构造出页面来了
 


 ## SSR(同构)
 vue
 虚拟DOM: 平台无关 mount('#app') 当渲染在浏览器里面  虚拟DOM就会变成真实 DOM
        当渲染在服务器里面  虚拟DOM就变成了 字符串
        当渲染在客户端（IOS）里面  虚拟DOM就变成了客户端的组件


import XXX from 'XXX.vue'

let html = `<div>123</div>`
res.end(html)