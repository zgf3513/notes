<template>
  <div id="count">
    <h2>当前和为：{{sum}}，bigSum ：{{getSum}}</h2>
    <select v-model="range">
      <option v-for="item in 100" :value="item" :key="item">{{item}}</option>
    </select>
    <button @click="add">+</button>
    <button @click="reduce">-</button>
    <button @click="addWhileOdd">当基数再加</button>
    <button @click="addWait">等等再加</button>
  </div>
</template>

<script>
import { mapState,mapGetters} from 'vuex'
export default {
  name: "Count",
  data(){
    return {
      range: 1
    }
  },
  computed: {
    ...mapState(['sum']),
    ...mapGetters(['getSum'])
  },
  methods: {
    add() {
      this.$store.dispatch("AddAction", this.range);
    },
    reduce() {
      this.$store.dispatch("ReduceAction", this.range);
    },
    addWhileOdd() {
      this.$store.dispatch("AddWhileOddAction", this.range);
    },
    addWait() {
      setTimeout(() => {
        this.$store.dispatch("AddAction", this.range);
      }, 1000);
    }
  }
}
</script>

<style scoped>

</style>