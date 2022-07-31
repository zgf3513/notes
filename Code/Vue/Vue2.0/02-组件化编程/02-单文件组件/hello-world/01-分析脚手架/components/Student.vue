<template>
  <div>
    <h2>studentName:{{name}}</h2>
    <h2>age:{{age}}</h2>
  </div>
</template>

<script>
export default {
  data(){
    return {
      name: '张三',
      age: 18,
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

</style>