<template>
  <div id="todo-list" class="mt-3">
    <TodoInput :addTip="addTip"/>
    <TodoTips :tips="tips" :changeTipState="changeTipState" :deleteTip="deleteTip"/>
    <TodoFooter :tipsInfo="tipsInfo" :isSelectAll="isSelectAll" :deleteFinished="deleteFinished"/>
  </div>
</template>

<script>
import TodoInput from "@/components/todo-list/input/TodoInput";
import TodoTips from "@/components/todo-list/tips/TodoTips";
import TodoFooter from "@/components/todo-list/footer/TodoFooter";

export default {
  name: "todo-List",
  components: {
    TodoInput,TodoTips,TodoFooter
  },
  data(){
    return {
      tips: [
        {id: "1", state: true, title: "吃饭"},
        {id: "2", state: false, title: "睡觉"},
        {id: "3", state: true, title: "打豆豆"},
      ]
    }
  },
  computed: {
    tipsInfo(){
      return {
        finished: this.tips.reduce((pre, cur) => pre + (cur.state ? 1 : 0), 0),
        all: this.tips.length
      }
    }
  },
  methods: {
    addTip(tip) {
      tip.id = this.tips.length + 1;
      this.tips.unshift(tip);
    },
    changeTipState(id) {
      this.tips.find(item => item.id === id).state = !this.tips.find(item => item.id === id).state;
    },
    isSelectAll(state) {
      this.tips.forEach(item => item.state = state);
    },
    deleteTip(id){
      if (confirm("确定要删除吗？")) {
        this.tips.splice(this.tips.findIndex(item => item.id === id), 1);
      }
    },
    deleteFinished() {
      if (confirm("确定要删除已完成的吗？")) {
        this.tips = this.tips.filter(item => !item.state);
      }
    }

  },
  watch: {

  },
}
</script>

<style scoped>
#todo-list{
  max-width: 500px;
}
</style>