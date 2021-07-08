<template>
    <div class="watch">
        <span style="margin-right: 20px">{{temp}}度</span>
        <span>{{suggest}}</span><br>
        {{num}}
        <button @click="add">添加</button> 
        <button @click="reduce">减法</button>
    </div>
</template>

<script>
// mixins
let addLog = {
    update: function () {
        console.log('数据发生变化了，此时温度为'+ this.temp)
    }
}

let ext = {
    created() {
        console.log('我是被拓展出来的生命周期')
    },
    methods: {
        add() {
            console.log('我是被拓展出来的方法add')
        }
    }

}

export default {
    data(){
        return {
            temp: 27,
            suggest: '不要出去，太热了',
            num: 0
        }
    },
    mixins: [addLog],
    extends: ext,

    methods: {
        // add(){
        //     // this.temp+=5
        //     this.num++
        //     console.log(this.num)
        // },
        reduce(){
            this.temp-=5
            
        }
    },
    watch: {
        temp: function(newVal, oldVal){
            console.log( oldVal)
            if(newVal >= 15){
                this.suggest = '穿短袖'
            }else if(0 <=newVal && newVal < 15){
                this.suggest = "穿夹克"
            }else if( newVal < 0){
                this.suggest = '穿羽绒服'
            }

        }
    }
    
}
</script>

<style>

</style>