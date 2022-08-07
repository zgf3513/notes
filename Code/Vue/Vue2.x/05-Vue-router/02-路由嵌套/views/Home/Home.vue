<template>
  <div id="app">
    <h3>Home</h3>
    <nav class="nav nav-pills nav-fill">
      <router-link class="nav-link" active-class="active" to="/home/message">Message</router-link>
      <router-link class="nav-link" active-class="active" to="/home/news">News</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "Home"
}
</script>

<style scoped>
*{
  max-width: 500px;
  margin: auto;
}
</style>