import api from '@/api'
export const searchMixin = {
    data(){
        return {
            query: ''
        }
    },
    computed: {}, 
    methods: {
        onQueryChange(data){
            console.log('===========', data);
            this.query = data.trim()   //去空格
            // 发请求
            api.Login()
        }
    }
}