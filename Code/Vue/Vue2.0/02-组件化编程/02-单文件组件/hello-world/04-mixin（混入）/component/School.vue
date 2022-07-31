<template>
  <div class="school" @click="showName">
    <h2>学校名：{{name}}</h2>
    <h2>地址：{{address}}</h2>
  </div>
</template>

<script>
import {mixin} from "@/mixin";

export default {
  name: "School",
  data() {
    return {
      name: '测试学校',
      address: '北京'
    }
  },
  // mixins: [mixin],
  mounted() {
    console.log(`${this.name} mounted`);
  }
}
</script>

<style scoped>
.school{
  background-color: chocolate;
}
</style>