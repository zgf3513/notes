<template>
  <div id="count">
    <h2>当前和为：{{sum}}，bigSum ：{{getSum}}</h2>
    <select v-model="range">
      <option v-for="item in 100" :value="item" :key="item">{{item}}</option>
    </select>
    <button @click="add(range)">+</button>
    <button @click="reduce(range)">-</button>
    <button @click="addWhileOdd(range)">当基数再加</button>
    <button @click="addWait(range)">等等再加</button>
  </div>
</template>

<script>
import { mapState,mapGetters,mapActions,mapMutations } from 'vuex'
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
    ...mapActions({
      add: 'AddAction',reduce: 'ReduceAction',addWhileOdd: 'AddWhileOddAction',addWait: 'addWaitAction'
    }),
    // add() {
    //   this.$store.dispatch("AddAction", this.range);
    // },
    // reduce() {
    //   this.$store.dispatch("ReduceAction", this.range);
    // },
    // addWhileOdd() {
    //   this.$store.dispatch("AddWhileOddAction", this.range);
    // },
    // addWait() {
    //   this.$store.dispatch("AddWaitAction", this.range);
    // }
  }
}
</script>

<style scoped>

</style>