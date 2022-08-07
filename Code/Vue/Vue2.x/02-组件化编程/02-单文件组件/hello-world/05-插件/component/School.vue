<template>
  <div class="school">
    <h2>学校名：{{name | test}}</h2>
    <h2>地址：{{address}}</h2>
  </div>
</template>

<script>

export default {
  name: "School",
  data() {
    return {
      name: '测试学校',
      address: '北京'
    }
  }
}
</script>

<style scoped>
.school{
  background-color: chocolate;
}
</style>