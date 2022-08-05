<template>
  <div id="app">
    <h3>About </h3>

  </div>
</template>

<script>
export default {
  name: "About",
  beforeRouteEnter (to, from, next) {
    console.log('About beforeRouteEnter')
    next()
  },
  beforeRouteLeave (to, from, next) {
    console.log('About beforeRouteLeave')
    next()
  },
}
</script>

<style scoped>

</style>