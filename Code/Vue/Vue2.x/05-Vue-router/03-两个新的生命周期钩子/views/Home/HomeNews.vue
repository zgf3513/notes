<template>
  <div>
    <ul>
      <li :style="{opacity}">路由 啊哈哈哈哈</li>
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
        <input>
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
      opacity: 1,
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
  },
  mounted() {
    /*this.timer = setInterval(() => {
      this.opacity -= 0.1;
      if (this.opacity < 0) {
        this.opacity = 1;
      }
    }, 160)*/
  },
  activated() {
    console.log("news activated");
    this.timer = setInterval(() => {
      this.opacity -= 0.1;
      if (this.opacity < 0) {
        this.opacity = 1;
      }
    }, 160)
  },
  deactivated() {
    console.log("news deactivated");
    clearInterval(this.timer);
  },
  beforeDestroy() {
    console.log("HomeNews beforeDestroy")
    clearInterval(this.timer)
  }
}
</script>

<style scoped>

</style>