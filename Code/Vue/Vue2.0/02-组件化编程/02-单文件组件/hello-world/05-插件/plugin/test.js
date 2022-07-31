export default {
    install(Vue){
        console.log('test installed');
        Vue.filter('test', function(value){
            return value + 'test';
        })

        Vue.mixin({
            created() {
                console.log('test插件在创建完成时调用了');
            },
            mounted() {
                console.log('test插件在挂载完成时调用了');
            },
            beforeDestroy() {
                console.log('test插件在销毁前调用了');
            }
        })

        Vue.prototype.testPlugin = () => {console.log('test插件在Vue原型上添加的testPlugin方法被调用了，vm和vc都能用哦')}
    }

}