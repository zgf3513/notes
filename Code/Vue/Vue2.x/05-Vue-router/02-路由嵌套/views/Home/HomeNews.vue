<template>
  <div>
    <ul>
      <li v-for="item in list" :key="item.id">
<!--        query参数-->
<!--        <router-link :to="`${item.path}?title=${item.title}`">{{item.name}}</router-link>-->
        <router-link :to="{
          path: item.path,
          query: {
            title: item.title
          }
        }">{{item.title}}
        </router-link>
      </li>
    </ul>
    <router-view></router-view>
  </div>

</template>

<script>
export default {
  name: "HomeNews",
  data() {
    return {
      list: [{
        id: 1,
        title: "News1",
        path: "/home/news/1"
      }, {
        id: 2,
        title: "News2",
        path: "/home/news/2"
      }, {
        id: 3,
        title: "News3",
        path: "/home/news/3"
      }]
    }
  }
}
</script>

<style scoped>

</style>