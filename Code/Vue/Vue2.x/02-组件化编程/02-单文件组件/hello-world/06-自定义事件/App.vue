<template>
  <div id="app" class="app">
    <h2 ref="hello">{{msg}}</h2>
    <school :getSchoolName="getSchoolName"/>
    <student v-on:sendData="getStudentName"/>
  </div>
</template>

<script>
import Student from "@/component/Student";
import School from "@/component/School";
export default {
  name: "App",
  data(){
    return{
      msg: "hello",
    }
  },
  components: {
    School,
    Student
  },
  methods: {
    getSchoolName(name){
      console.log(`把学校名给App组件：${name}`);
    },
    getStudentName(name){
      console.log(`把学生名给App组件：${name}`);
    }
  },

}
</script>

<style scoped>
.app{
  background-color: gray;
}
</style>