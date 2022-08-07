<template>
<!--  vue3模板中的结构可以没有根标签-->
  <h2>我叫{{name}}，今年{{age}}岁</h2>
  <button @click="addAge">年龄+1</button>
</template>

<script>

import {ref} from "vue";

export default {
  name: 'App',
  setup() {
    let name = ref('张三');
    let age = ref(18);

    function addAge() {
      age.value++
    }

    return { 
      name,
      age,
      addAge
    }

  }

}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
