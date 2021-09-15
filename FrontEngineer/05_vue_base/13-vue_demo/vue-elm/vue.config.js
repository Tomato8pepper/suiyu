module.exports = {

  css: {
    // 解决vue eslink报错问题
    lintOnSave: 'warning',
    loaderOptions: {
      stylus: {
        'resolve url': true,
        'import': [
          './src/theme'
        ]
      }
    }
  },
  

  pluginOptions: {
    'cube-ui': {
      postCompile: true,
      theme: true
    }
  },
  devServer: {
    proxy: {
      '/api': {
        target: 'http://ustbhuangyi.com/sell/',
        changeOrigin: true,
        pathRewrite: {
          '^/api': '/api'
        }
      }
    }
  }
}

