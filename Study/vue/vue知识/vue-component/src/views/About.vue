<template>
  <div class="about">
    <p>{{name}}</p>
    <!-- <p>{{name1}}</p> -->
    <User :username="name" @event2="change($event)" @event1="change1($event)"></User>
    <Friend :friendname="name1" ></Friend>
  </div>
</template>


<script>
import User from "@/components/User";
import Friend from "@/components/Friend";
export default {
  data() {
    return {
      name: "小明",
      name1: '小刚'
    };
  },
  components: {
    User,
    Friend,
  },
  methods: {
    change(data) {
      console.log(data)
      this.name1 = data;

    },
    change1(data) {
      console.log(data)
      this.name = data;
    },
  },
};
</script>


