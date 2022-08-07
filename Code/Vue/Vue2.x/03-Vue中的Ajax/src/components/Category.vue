<template>
  <div id="category">
    <h3>{{title}}</h3>
    <slot :games="games">
      我是啥
    </slot>
  </div>
</template>

<script>

export default {
  name: "Category",
  data() {
    return {
        title: 'Games',
        games: [
          {id: 1, name: 'Counter Strike' },
          {id: 2, name: 'Call of Duty' },
          {id: 3, name: 'Mario' },
        ]
    };
  },
  props: {
    // category: {
    //   type: Object,
    //   required: true,
    // },
  },
}
</script>

<style scoped>
#category{
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  max-width: 150px;
  max-height: 200px;
  background-color: lightgray;
}
#category h3{
  background-color: chocolate;
}
#category ul li{
  text-align: left;
}
</style>