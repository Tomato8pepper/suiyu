<template>
  <div>
    <div>
      <el-radio v-model="radio" label="1">备选项</el-radio>
      <el-radio v-model="radio" label="2" @change="change">备选项</el-radio>
      <el-radio
        v-model="radio"
        label="3"
        disabled
        border
        size="middle"
        name="rad"
        >备选项</el-radio
      >
    </div>
    <div>
      <el-checkbox-group v-model="checkboxGroup1" @change="chang">
        <el-checkbox-button v-for="city in cities" :label="city" :key="city" @click.native='changehandle(city)'>{{
          city
        }}</el-checkbox-button>
      </el-checkbox-group>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      radio: "1",
      cities: ['上海', '北京', '广州', '深圳'],
      checkboxGroup1: ['上海']
    };
  },
  methods: {
    change(e) {
      console.log("kkk", e);
    },
    chang (e) {
        console.log('kkk1', e);
    },
    changehandle (index) {
        console.log('kkk2', index);
    }
  },
};
</script>

<style>
</style>