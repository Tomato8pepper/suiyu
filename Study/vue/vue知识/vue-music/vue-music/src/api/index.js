import Vue from 'vue'
import axios from 'axios'

const vue = new Vue()

// axios配置
axios.defaults.timeout = 10000      // 超时时间
axios.defaults.baseURL = 'http://localhost:3000'    //后端服务器端口     

// 返回状态判断(响应拦截)
axios.interceptors.response.use(                  //两个回调参数
    // 接受数据,有异常
    (res)=>{
        if(res.data.code !== 200){
            vue.$toast('网络异常!!')
            return Promise.reject(res)
        }
        return res.data
    },
    // 未接受数据错误
    (error) => {
        vue.$toast('服务器异常！！')
        return Promise.reject(error)
    }
)

export function fetchGet(url, param){
    return new Promise((resolve, reject)=>{
        axios.get(url, {
            params: param
        })
        .then(
            res=>{
                resolve(res)
            },
            err=>{
                reject(err)
            })
        .catch(
            (err)=>{
                reject(err)
        })
    })
}



export default {
    // 用户登录
    Login(params) {
        return fetchGet('/login', params)
    },
    // 热门搜索
    HotSearchKey() {
        return fetchGet('/search/hot')
    },
    // music搜索
    MusicSearch(params){
        return fetchGet('/search', params)
    },
    //歌曲url
    MusicUrl(id) {
        return fetchGet('/song/url', {id})
    }
}