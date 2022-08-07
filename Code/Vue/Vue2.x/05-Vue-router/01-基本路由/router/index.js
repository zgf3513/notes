import Vue from "vue";
import router from 'vue-router'
import About from "@/views/About";
import Home from "@/views/Home/Home";
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