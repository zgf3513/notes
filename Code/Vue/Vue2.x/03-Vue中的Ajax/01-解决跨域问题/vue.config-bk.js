const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: false,
  pages: {
    index: {
        entry: 'src/main.js',
    }
  },
  // devServer: {
  //   proxy: 'http://localhost:81'
  // }
  devServer: {
    proxy: {
      '/student': {
        target: 'http://localhost:81',
        ws: true, // 用于支持websockets
        changeOrigin: true, // 用于控制请求头中的host值
        pathRewrite: { // 重写路径
            '^/student': ''
        }
      },
      '/car': {
        target: 'http://localhost:82',
        ws: true, // 用于支持websockets
        changeOrigin: true, // 用于控制请求头中的host值
        pathRewrite: { // 重写路径
          '^/car': ''
        }
      }
    }
  }
})
