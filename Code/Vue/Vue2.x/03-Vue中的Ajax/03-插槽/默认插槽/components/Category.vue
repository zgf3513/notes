<template>
  <div id="category">
    <h3>{{category.title}}</h3>
    <slot>
      <ul>
        <li v-for="categoryItem in category.items" :key="categoryItem.id">
          {{ categoryItem.name }}
        </li>
      </ul>
    </slot>
  </div>
</template>

<script>

export default {
  name: "Category",
  data() {
    return {
    };
  },
  props: {
    category: {
      type: Object,
      required: true,
    },
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