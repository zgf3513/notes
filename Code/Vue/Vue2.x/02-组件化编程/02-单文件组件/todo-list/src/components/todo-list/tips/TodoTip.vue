<template>
  <li class="list-group-item" @mouseover="show=true" @mouseout="show=false">
    <div class="form-check form-switch">
      <input :checked="tip.state" @change="changeTipState(tip.id)" class="form-check-input" type="checkbox" role="switch" id="check">
      <!-- 如下代码也可实现，但不推荐，因为违反原则 -->
      <!-- <input v-model="tip.state" class="form-check-input" type="checkbox" role="switch" id="check"> -->
      <label class="form-check-label" for="check">{{tip.title}}</label>
      <button class="btn btn-sm btn-primary float-end" v-show="show" @click="deleteTip(tip.id)">删除</button>
    </div>
  </li>
</template>

<script>
export default {
  name: "TodoTip",
  data(){
    return {
      show: false
    }
  },
  props: {
    tip: {
      state: {
        type: Boolean,
        default: false
      },
      title: {
        type: String,
        required: true
      }
    },
    changeTipState: {
      type: Function,
      required: true
    },
    deleteTip: {
      type: Function,
      required: true
    }
  },
  methods: {
    showDelete() {
      this.show = true;
    },

  }
}
</script>

<style scoped>

</style>