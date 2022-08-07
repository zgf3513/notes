<template>
<!--  vue3模板中的结构可以没有根标签-->
  <h2>我叫{{name}}，今年{{age}}岁</h2>
  <h3>当前鼠标的坐标是：X: {{pos.x}}, Y: {{pos.y}}</h3>
  <input v-model="text" />
  <h3>{{text}}</h3>
</template>

<script>

import {customRef, ref} from "vue";
import UsePos from "@/hooks/usePos";


export default {
  name: 'App',
  setup() {
    let name = ref('张三');
    let age = ref(18);
    let pos = UsePos()

    function useDebouncedRef(value, delay = 200) {
      let timeout
      return customRef((track, trigger) => {
        return {
          get() {
            track()
            return value
          },
          set(newValue) {
            clearTimeout(timeout)
            timeout = setTimeout(() => {
              value = newValue
              trigger()
            }, delay)
          }
        }
      })
    }


    return {
      name,
      age,
      pos,
      text: useDebouncedRef('hello',1000)
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
