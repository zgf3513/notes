<template>
  <div class="student">
    <h2>{{msg}}</h2>
    <h2>姓名：{{name}}</h2>
    <h2>年龄：{{age}}</h2>
    <button @click="sendMsg">给学校发点东西</button>
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
  },
  methods: {
    sendMsg() {
      this.$bus.$emit('sendMsg', '我是学生')
    }
  },
  beforeDestroy() {
    this.$bus.$off('sendMsg')
  }
}
</script>

<style scoped>
.student{
  background-color: aqua;
}
</style>