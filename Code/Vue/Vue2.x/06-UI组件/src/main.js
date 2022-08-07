import Vue from 'vue'
import App from './App.vue'
// import ElementUI from 'element-ui';
// import 'element-ui/lib/theme-chalk/index.css';
import { Button, Row } from 'element-ui';


Vue.config.productionTip = false
// Vue.use(ElementUI);
Vue.component(Button.name, Button);  // 或 Vue.use(Button);
Vue.component(Row.name, Row);


new Vue({
  render: h => h(App),
}).$mount('#app')
