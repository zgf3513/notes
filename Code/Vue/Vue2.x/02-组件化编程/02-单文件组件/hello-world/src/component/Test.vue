<template>
  <div>
    <button @click="isShow = !isShow">显示/隐藏</button>
    <transition name="hello" :appear="true">
      <h2 ref="hello" v-show="isShow">{{msg}}</h2>
    </transition>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Test",
  data(){
    return{
      msg: "hello",
      isShow: true
    }
  },
}
</script>

<style scoped>
h2{
  background-color: pink;
}

.hello-enter-active{
  animation: show-title 1s;
}
.hello-leave-active{
  animation: show-title 1s reverse;
}

@keyframes show-title {
  from{
    transform: translateX(-100%);
  }
  to{
    transform: translateX(0px);
  }
}
</style>