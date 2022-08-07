// 引入的不再是Vue构造函数了，引入的时一个名为createApp的工厂函数
import { createApp } from 'vue'
import App from './App.vue'
import './index.css'

// 创建应用实例对象（类似于vm但app比vm更轻）并挂载app组件到根容器
createApp(App).mount('#app')
