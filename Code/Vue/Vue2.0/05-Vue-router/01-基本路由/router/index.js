import Vue from "vue";
import router from 'vue-router'
import About from "@/components/About";
import Home from "@/components/Home";
Vue.use(router)

export default new router({
    routes: [
        {
            path: '/about',
            component: About
        },
        {
            path: '/home',
            component: Home
        }
    ]
})