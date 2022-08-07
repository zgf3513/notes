import Vue from 'vue'
import App from './App.vue'
import axios from "axios";

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  beforeCreate() {
    Vue.prototype.$http = axios
    Vue.prototype.$bus = this
  }
}).$mount('#app')
