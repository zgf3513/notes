<template>
  <div class="mt-3">
    <ul class="list-group">
      <todo-tip
          v-for="tip in tips"
          :tip="tip"
          :changeTipState="changeTipState"
          :deleteTip="deleteTip"
          :key="tip.id"
          @delete="remove(tip)
      "/>
    </ul>
  </div>
</template>

<script>
import TodoTip from "@/components/todo-list/tips/TodoTip";

export default {
  name: "TodoTips",
  components: {TodoTip},
  data() {
    return {
    };
  },
  props: {
    tips: {
      'tips.id' : {
        type: String,
        required: true
      },
      'tips.state' : {
        type: Boolean,
        default: false
      },
      'tips.title' : {
        type: String,
        required: true
      },
      type: Array,
      default: () => []
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
    remove(tip) {
      this.tips.splice(this.tips.indexOf(tip), 1);
    },

  },
}
</script>

<style scoped>

</style>