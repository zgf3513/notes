<template>
  <div>
    <ul>
      <li v-for="item in list" :key="item.id" class="mt-3">
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
        }" class="me-3">{{item.title}}</router-link>
        <button class="btn btn-primary me-3" @click="routerPush(item)">push查看</button>
        <button class="btn btn-primary me-3" @click="routerReplace(item)">replace查看</button>
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
  },
  methods: {
    routerPush(item) {
      this.$router.push({
        name: 'messageDetail',
        params: {
          id: item.id,
          title: item.title
        }
      })
    },
    routerReplace(item) {
      this.$router.replace({
        name: 'messageDetail',
        params: {
          id: item.id,
          title: item.title
        }
      })
    }
  },
  beforeDestroy() {
    console.log('HomeMessage beforeDestroy')
  }
}
</script>

<style scoped>

</style>