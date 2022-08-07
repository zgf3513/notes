<template>
  <div class="mt-3 form-control" v-show="tipsInfo.all"  @mouseover="show=true" @mouseout="show=false">
    <div class="form-check form-switch">
      <input class="form-check-input" :checked="isFinishedAll" @change="check" type="checkbox" role="switch" id="finish-all">
      <label class="form-check-label" for="finish-all">已完成{{tipsInfo.finished}}/全部{{tipsInfo.all}}</label>
      <button class="btn btn-sm btn-primary float-end" v-show="show" @click="deleteFinished()">清除已完成任务</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "TodoFooter",
  data(){
    return {
      show: false
    }
  },
  computed: {
    isFinishedAll(){
      return this.tipsInfo.finished === this.tipsInfo.all &&　this.tipsInfo.all > 0;
    }
  },
  methods: {
    check(e){
      this.isSelectAll(e.target.checked)
    }
  },
  props: {
    tipsInfo: {
      finished: {
        type: Number,
      },
      all: {
        type: Number,
      }
    },

    isSelectAll: {
      type: Function,
      required: true
    },
    deleteFinished: {
      type: Function,
      required: true
    }


  }
}
</script>

<style scoped>

</style>