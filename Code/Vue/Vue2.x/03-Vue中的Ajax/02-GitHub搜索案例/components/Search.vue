<template>
  <div>
    <label for="search" class="h3">search in github</label>
    <input type="text" class="form-control" @keydown.enter="search" id="search" v-model="info">
  </div>
</template>

<script>

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Search",
  data() {
    return {
      info: "",
    };
  },
  methods: {
    search() {
      if (this.info === "") {
        alert("请输入搜索内容");
      } else {
        this.$http
            .get(`https://api.github.com/search/users?q=${this.info}`)
            .then(this.$bus.$emit("search", {state: 1}))
            .then(response => {
              this.$bus.$emit("search", {state: 2, data: response.data.items, info: this.info});
            }).catch(error => {
          this.$bus.$emit("search", {state: 3, error: error});
        });
      }
      this.info = "";
    },

  },
}
</script>

<style scoped>
#search{
  max-width: 500px;
  margin: 0 auto;
}
.row{
  overflow: hidden;
}
</style>