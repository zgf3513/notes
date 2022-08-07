<template>
  <div class="demo">
    <h2>schoolName:{{name}}</h2>
    <h2>address:{{address}}</h2>
    <button @click="showSchoolName">show school name</button>
  </div>
</template>

<script>
export default {
  data(){
    return {
      name: '垮了，没有',
      address: '成都',
    }
  },
  methods: {
    showSchoolName(){
      alert(this.name)
    }
  }
}
</script>

<style scoped>
.demo{
  background-color: aqua;
}
</style>