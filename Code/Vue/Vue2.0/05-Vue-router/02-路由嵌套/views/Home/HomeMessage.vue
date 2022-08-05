<template>
  <div>
    <ul>
      <li v-for="item in list" :key="item.id">
<!--        <router-link :to="{-->
<!--          name: 'messageDetail', /*这里不允许使用path，只能用name*/-->
<!--          query: {-->
<!--            id: item.id,-->
<!--            title: item.title-->
<!--          }-->
<!--        }">{{item.title}}</router-link>-->
        <router-link :to="{
          name: 'messageDetail', /*这里不允许使用path，只能用name*/
          params: {
            id: item.id,
            title: item.title
          }
        }">{{item.title}}</router-link>
      </li>
    </ul>
    <router-view></router-view>
  </div>

</template>

<script>
export default {
  name: "HomeMessage",
  data() {
    return {
      list: [{
        id: 1,
        title: "Message1",
        path: "/home/message",
      }, {
        id: 2,
        title: "Message2",
        path: "/home/message",
      },{
        id: 3,
        title: "Message3",
        path: "/home/message",
      }]
    }
  }
}
</script>

<style scoped>

</style>