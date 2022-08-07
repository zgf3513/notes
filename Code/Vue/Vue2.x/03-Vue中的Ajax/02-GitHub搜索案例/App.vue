<template>
  <div id="app" class="container">
    <search></search>
    <list></list>
  </div>
</template>

<script>
import list from "@/components/List";
import search from "@/components/Search";

export default {
  name: 'App',
  components: {
    search,list
  },
  methods: {

  },
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
