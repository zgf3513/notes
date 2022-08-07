<template>
  <div id="app">
    <button @click="getStudentInfo">获取学生信息</button>
    <button @click="getCarInfo">获取汽车信息</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'App',
  components: {

  },
  methods: {
    getStudentInfo() {
      axios.get('http://localhost:8080/student/gets')
        .then(res => {
          console.log(res.data);
        })
        .catch(err => {
          console.log(err);
        });
    },
    getCarInfo() {
      axios.get('http://localhost:8080/car/gets')
        .then(res => {
          console.log(res.data);
        })
        .catch(err => {
          console.log(err);
        });
    }
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
