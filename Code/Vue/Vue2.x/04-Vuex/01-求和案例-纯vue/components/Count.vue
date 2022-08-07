<template>
  <div id="count">
    <h2>当前和为：{{sum}}</h2>
    <select v-model="range">
      <option v-for="item in 100" :value="item" :key="item">{{item}}</option>
    </select>
    <button @click="add">+</button>
    <button @click="reduce">-</button>
    <button @click="addWhileOdd">当基数再加</button>
    <button @click="addWait">等等再待</button>
  </div>
</template>

<script>
export default {
  name: "Count",
  data(){
    return {
      sum: 0,
      range: 1
    }
  },
  methods: {
    add() {
      this.sum += this.range;
    },
    reduce() {
      this.sum -= this.range;
    },
    addWhileOdd() {
      if(this.sum % 2) {
        this.sum += this.range;
      }
    },
    addWait() {
      setTimeout(() => {
        this.sum += this.range;
      }, 1000);
    }
  }
}
</script>

<style scoped>

</style>