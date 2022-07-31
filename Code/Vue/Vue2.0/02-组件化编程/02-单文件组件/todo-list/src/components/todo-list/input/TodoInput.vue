<template>
  <input class="form-control mt-3" placeholder="请输入待办事项" v-model="input" @keyup.enter="add">
</template>

<script>

export default {
  name: "TodoInput",
  data() {
    return {
      input: ''
    }
  },
  props: ['addTip'],
  methods: {
    add() {
      this.input.trim()
      if (this.input === '') {
        return;
      }
      this.addTip({
        state: false,
        title: this.input
      })
      this.input = '';
    }
  }
}
</script>

<style scoped>

</style>