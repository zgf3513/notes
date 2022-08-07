<template>
  <div class="row mt-5">
    <h2 v-show="state === 0">欢迎使用</h2>

    <div v-show="state === 1" class="text-center">
      <div class="spinner-border" role="status">
        <span class="visually-hidden">Loading...</span>
      </div>
    </div>

    <div v-show="state === 2" class="col-3 mt-3"  v-for="item in items" :key="item.id">
      <div class="card" style="width: 18rem;">
        <img :src="item.avatar_url" class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">
            {{item.login}}
            <a :href="item.html_url" target="_blank" class="btn btn-primary">Go</a>
          </h5>
        </div>
      </div>
    </div>

    <div v-show="state === 3" class="text-center">
      <div class="alert alert-danger" role="alert">
        {{error}}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "List",
  data() {
    return {
      state: 0, // 0：初始状态，1：加载中，2：加载完成，3：加载失败
      items: [],
      error: "",
    };
  },
  mounted() {
    this.$bus.$on("search", data => {
      if (data.state === 1){
        this.state = 1;
      }else if (data.state === 2) {
        this.state = 2;
        this.items = data.data;
        if (this.items.length === 0) {
          this.state = 3;
          this.error = "没有搜索到相关信息";
        }
      } else if (data.state === 3) {
        this.state = 3;
        this.error = data.error;
      }
    });
  }
}
</script>

<style scoped>

</style>