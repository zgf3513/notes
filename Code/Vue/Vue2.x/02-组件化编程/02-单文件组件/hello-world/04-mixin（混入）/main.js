import Vue from 'vue'
import App from './App.vue'
import {Mixin} from "@/mixin";

Vue.config.productionTip = false;
Vue.mixin(Mixin);

new Vue({
    render: h => h(App),
}).$mount('#app');