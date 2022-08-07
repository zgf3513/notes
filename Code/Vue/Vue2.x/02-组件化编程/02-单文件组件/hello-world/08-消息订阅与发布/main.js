import Vue from 'vue'
import App from './App.vue'
import testPlugin from './plugin/test'

Vue.use(testPlugin);
// const demo = Vue.extend({});
// Vue.prototype.x = new demo()

new Vue({
    render: h => h(App),
    // beforeCreate() {
    //     Vue.prototype.$bus = this  // 安装全局事件总线
    // }
}).$mount('#app');