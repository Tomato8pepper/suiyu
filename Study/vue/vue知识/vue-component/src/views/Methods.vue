<template>
  <div class="methods">
      123
      <p>{{count}}</p>
      <button @click="add($event)">
          add
      </button>
  </div>
</template>

<script>
export default {
    data(){
        return {
            count: 0,
            
        }
    },
    methods:{
        add(e) {

            // e自带的
            this.count++
            console.log(e)
        }
    }


    
    
}
</script>

<style>

</style>