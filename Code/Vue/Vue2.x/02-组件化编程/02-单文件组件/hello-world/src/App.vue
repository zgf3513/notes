<template>
  <div id="app" class="app">
    <test/>
  </div>
</template>

<script>
import Test from "@/component/Test";
export default {
  name: "App",
  data(){
    return{
      msg: "hello",
      studentName: ''
    }
  },
  components: {
    Test,
  },
  methods: {

  },

}
</script>

<style scoped>
.app{
  background-color: gray;
}
</style>