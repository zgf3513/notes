<template>
  <div class="student">
    <h2>{{msg}}</h2>
    <h2>姓名：{{name}}</h2>
    <h2>年龄：{{age}}</h2>
  </div>
</template>

<script>
export default {
  name: "Student",
  data() {
    return {
      msg: "hello",
      name: '张三',
      age: 19
    }
  }
}
</script>

<style scoped>
.student{
  background-color: chocolate;
}
</style>