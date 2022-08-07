<template>
  <div class="student">
    <h2>{{msg}}</h2>
    <h2>姓名：{{name}}</h2>
    <h2>年龄：{{age}}</h2>
    <button @click="sendStudentName">把名字给App组件</button>
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
    sendStudentName(){
      // 触发Student实例身上的sendDataToParent事件
      this.$emit('sendData', this.name);
    }
  }
}
</script>

<style scoped>
.student{
  background-color: aqua;
}
</style>