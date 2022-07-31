<template>
  <div class="student" @click="showName">
    <h2>{{msg}}</h2>
    <h2>姓名：{{name}}</h2>
    <h2>年龄：{{age}}</h2>
  </div>
</template>

<script>
import {mixin} from "@/mixin";
export default {
  name: "Student",
  data() {
    return {
      msg: "hello",
      name: '张三',
      age: 19
    }
  },
  // mixins: [mixin],
  mounted() {
    console.log(`${this.name} mounted`);
  }
}
</script>

<style scoped>
.student{
  background-color: chocolate;
}
</style>