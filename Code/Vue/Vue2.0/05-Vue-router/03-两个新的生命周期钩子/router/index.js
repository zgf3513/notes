import Vue from "vue";
import router from 'vue-router'
import About from "@/views/About";
import Home from "@/views/Home/Home";
import HomeMessage from "@/views/Home/HomeMessage";
import HomeNews from "@/views/Home/HomeNews";
import newsDetail from "@/views/Home/NewsDetail";
import messageDetail from "@/views/Home/MessageDetail";
Vue.use(router)

export default new router({
    routes: [
        {
            name: 'about',
            path: '/about',
            component: About,
            meta: {
                title: '关于'
            },
        },
        {
            name: 'home',
            path: '/home',
            component: Home,
            children: [
                {
                    name: 'homeNews',
                    path: 'news',
                    component: HomeNews,
                    children: [
                        {
                            name: 'newsDetail',
                            path: ':id/',
                            component: newsDetail,
                        }
                    ]
                },
                {
                    name: 'homeMessage',
                    path: 'message',
                    component: HomeMessage,
                    children: [
                        {
                            name: 'messageDetail',
                            path: ':id',
                            component: messageDetail,
                            // props: {a:1,b:2} // 一般不这样写，穿的死数据
                            // props: true, // 使用true，会将所有的params参数以props传递给组件
                            // props(route) {
                            //     return {
                            //         title: route.params.title
                            //     }
                            // }
                            props({params:{title}}) { // 和上面二选一
                                return {
                                    title: title
                                }
                            }
                        }
                    ]
                },
            ]
        }
    ]
})