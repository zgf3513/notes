<template>
  <div id="app">
    <div class="list-group" style="width: 280px;">
          <router-link class="list-group-item list-group-item-action" active-class="active" to="/home">Home</router-link>
          <router-link class="list-group-item list-group-item-action" active-class="active" to="/about">About</router-link>
    </div>
    <div>
      <router-view>阿哈哈哈哈</router-view>
    </div>

  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
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
