<template>
  <div>
    <school></school>
    <student></student>
  </div>
</template>

<script>
import School from "./components/School";
import Student from "./components/Student";
export default {
  name: "App",
  components: {Student: Student, School: School}
}
</script>

<style scoped>

</style>