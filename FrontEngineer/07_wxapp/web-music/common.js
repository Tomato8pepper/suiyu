// wx.request 从本地小程序 ->服务器
        // ajax
        // fetch做接口写语法的地方
        const bannerEle = document.querySelector('#banner')

        fetch('http://neteasecloudmusicapi.zhaoboy.com/banner')           //从服务器端拿到数据
            .then(data => data.json())                                        //再转换成json类型的数据
            .then(data => {                                                   //再将数据显示出来
                // console.log(data)
                if (data.code == 200) {                                           //http 状态码200位请求成功
                    const banners = data.banners   
                    const html = banners.map((banner) => {                         //将banner数组转换成一个新的数组html
                        // console.log(banner)
                        return `<img src="${banner.imageUrl}"`
                    })  
                    console.log(html)
                    bannerEle.innerHTML =html.join('')                           //join()方法
                    // console.log(banners)
                    // bannerEle.innerHTML =banners.map()
                    for(let banner of banners){
                        // console.log(banner)
                        bannerEle.innerHTML += `<img src = "${banner.imageUrl}">`
                    }
                }
                else {
                    console.log("请求失败")
                }
            })










