const trendings = () => new Promise((resolve, reject)=>{
    setTimeout(()=>{
        resolve([{
            repo:'qwer'
        }])
    }, 1000)
})
const getRepo = () => new Promise((resolve, reject)=>{
    const url = 'https://github-trending-api.now.sh/repositories'
    wx.request({
        url,
        data: {
            language: 'all'
        },
        success: (res)=>{
            // success
            console.log(res)
            resolve(res)
        },
        
    })
})
module.exports ={
    trendings,
    getRepo
}