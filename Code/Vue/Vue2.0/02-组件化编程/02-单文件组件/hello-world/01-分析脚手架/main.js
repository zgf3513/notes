import Vue from "vue";
import App from "./App";

Vue.config.productionTip = false;

new Vue({
    // template: `<App></App>`,
    // components: { App }
    render: r => r(App)
}).$mount("#app");