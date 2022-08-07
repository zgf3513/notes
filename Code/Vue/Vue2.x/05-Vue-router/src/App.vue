<template>
  <div id="app">
    <button class="btn-primary btn me-3" @click="back">后退</button>
    <button class="btn-primary btn me-3" @click="forward">前进</button>
    <button class="btn-primary btn me-3" @click="test">test go</button>
    <div class="list-group" style="width: 280px;">
          <router-link class="list-group-item list-group-item-action" active-class="active" to="/home">Home</router-link>
          <router-link class="list-group-item list-group-item-action" active-class="active" to="/about">About</router-link>
    </div>
    <div>
      <router-view></router-view>
    </div>

  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
  },
  methods: {
    back() {
      this.$router.back()
    },
    forward() {
      this.$router.forward()
    },
    test() {
      this.$router.go(-1) // -1后退，1前进，0不变，默认0，值表示跳转的层级
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
