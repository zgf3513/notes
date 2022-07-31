<template>
  <div id="app">
    <h2 ref="hello">{{msg}}</h2>
    <button ref="btn" @click="showDom">输出上方DOM</button>
    <school ref="sch"></school>
  </div>
</template>

<script>
import School from "@/component/Student";
export default {
  name: "App",
  data(){
    return{
      msg: "hello",
    }
  },
  components: {
    School
  },
  methods: {
    showDom(){
      console.log(this.$refs.hello);  // 真实DOM元素
      console.log(this.$refs.btn);    // 真实DOM元素
      console.log(this.$refs.sch);    // VueComponent实例对象
    }
  }
}
</script>

<style scoped>

</style>