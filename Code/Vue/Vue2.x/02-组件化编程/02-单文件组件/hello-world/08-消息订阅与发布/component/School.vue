<template>
  <div class="school">
    <h2>学校名：{{name}}</h2>
    <h2>地址：{{address}}</h2>
  </div>
</template>

<script>
import pubsub from 'pubsub-js'

export default {
  name: "School",
  data() {
    return {
      name: '测试学校',
      address: '北京'
    }
  },
  methods: {
    getMsg(msgTitle, data) {
      console.log(msgTitle, data)
    }
  },
  mounted() {
    this.pubid = pubsub.subscribe('信息来咯', this.getMsg)
  },
  beforeDestroy() {
    pubsub.unsubscribe(this.pubid)
  }
}
</script>

<style scoped>
.school{
  background-color: pink;
}
</style>