<template>
  <div id="app">
    <h2 ref="hello">{{msg}}</h2>
    <button ref="btn" @click="showDom">输出上方DOM</button>
    <student ref="sch" name="张三"></student>
    <student v-bind:name="name" v-bind:age="age"/>
    <input v-model="name" type="text" placeholder="修改李四名字">
    <input v-model="age" type="text" placeholder="修改李四年龄">
    <student name="赵六" :age="20"/>
    <student name="小七" :age="16"/>
  </div>
</template>

<script>
import Student from "@/component/Student";
export default {
  name: "App",
  data(){
    return{
      msg: "hello",
      name: '李四',
      age: 19
    }
  },
  components: {
    Student
  },
  methods: {
    showDom(){
      console.log(this.$refs.sch);  // 真实DOM元素
    }
  }
}
</script>

<style scoped>

</style>