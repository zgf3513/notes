import Vue from 'vue'
import App from './App.vue'
import testPlugin from './plugin/test'

Vue.use(testPlugin);

new Vue({
    render: h => h(App),
}).$mount('#app');