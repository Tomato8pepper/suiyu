import axios from 'axios'

const baseUrl = ''

export function getUrl(url){
    return  function (params = {}){
        return  axios.get(baseUrl + url, { params }).then((res)=>{
            let { errno, data } = res.data
            if(errno === 0){
                return data
            }
        }).catch((err)=>{
            console.log(err);
        })
    }
}




// axios.get(url, {params})

