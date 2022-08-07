<template>
  <div class="student">
    <h2>{{msg}}</h2>
    <h2>姓名：{{name}}</h2>
    <h2>年龄：{{age}}</h2>
    <button @click="sendMsg">给学校发点东西</button>
  </div>
</template>

<script>
import pubsub from 'pubsub-js'
export default {
  // eslint-disable-next-line vue/multi-word-component-names
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
      pubsub.publish('信息来咯', {
        name: this.name,
        age: this.age
      })
    }
  },
  beforeDestroy() {

  }
}
</script>

<style scoped>
.student{
  background-color: aqua;
}
</style>