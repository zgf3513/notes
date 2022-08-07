<template>
  <div id="app" class="container">
    <category>
      <template slot="game1">
        <ul>
          <li v-for="game in game1.games" :key="game.id">
            {{game.name}}
          </li>
        </ul>
      </template>
    </category>
    <category>
      <template scope="game2">
        <ol>
        <li v-for="game in game2.games" :key="game.id">
          {{game.name}}
        </li>
        </ol>
      </template>
    </category>
    <category>
      <template scope="game3">
        <h3 v-for="game in game3.games" :key="game.id">
          {{game.name}}
        </h3>
      </template>

    </category>
  </div>
</template>

<script>

import Category from "@/components/Category";

export default {
  name: 'App',
  components: {
    Category
  },
  data() {
    return {
      // games:{
      //   title: 'Games',
      //   items: [
      //     { id: 1, name: 'Counter Strike' },
      //     { id: 2, name: 'Call of Duty' },
      //     { id: 3, name: 'Mario' },
      //   ]
      // }
    };
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
