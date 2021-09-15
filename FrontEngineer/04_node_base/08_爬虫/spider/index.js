// node 发起请求获取html信息   ->  解析html
const https = require('https')
const cheerio = require('cheerio')
const fs = require('fs')


//通过https模块的get方法，请求网站链接，在回调函数中获取资源
https.get('https://movie.douban.com/top250', (res)=>{
    // console.log(res);
    //因为获取到的资源是分段返回的，所以需要手动拼接（html）
    let html = ''
    // res.on类似于addEventListener
    res.on('data', (chunk)=> {
        html += chunk
        // console.log('==========', chunk.toString());
    })

    // res数据加载完成，我们去执行xx逻辑
    res.on('end', ()=>{
        //操作dom结构
        const $ = cheerio.load(html)
        const allFiles = []
        //jqery自带循环method  同步的
        $('li .item').each( function(){
            //this代表上面那个dom结构
            const title = $('.title', this).text()
            const star = $('.rating_num', this).text()
            const pic = $('.pic img', this).attr('src')

            allFiles.push({title, star, pic})
        }) 
        // console.log(allFiles);
        fs.writeFile('file.json', JSON.stringify(allFiles), (err)=>{
            console.log(err);
        })
    })
    
})