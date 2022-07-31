<template>
  <div id="app">
    <h2 ref="hello">{{msg}}</h2>
    <school/>
    <student/>
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
  }
}
</script>

<style scoped>

</style>