//当页面打开就加载
window.onload = function () {
    imgLocation("container", "box")
}


// 获取当前有多少张图片要摆放
function imgLocation(parent, content) {
    // 将parent下的所有内容全部取出 cparent是container的dom结构
    var cparent = document.getElementById(parent)
    // console.log(cparent)
    // 得到所有的子div  存放在数组ccontent
    var ccontent = getChildElement(cparent, content)
    // console.log(ccontent)
    var imgWidth = ccontent[0].offsetWidth
    // 取当前浏览器的宽度   floor向下取整   获取浏览器窗口文档显示区域的宽（高）度，不包括滚动条。
    // document.documentElement.offsetHeight(width)  offsetHeight=height+padding+border，不包括margin。
    var num = Math.floor(document.documentElement.clientWidth / imgWidth)
    // console.log(num)
    cparent.style.cssText = "width:" + imgWidth * num + "px" // cparent.style.width 

    var BoxHeightArr = []
    for (var i = 0; i < ccontent.length; i++) {
        // console.log(i)
        if (i < num) {
            BoxHeightArr[i] = ccontent[i].offsetHeight      //.push()
            // console.log(BoxHeightArr[i])
        } else {
            
            // 使用math.min()来给数组使用  获得height的min值
            var minHeight = Math.min.apply(null, BoxHeightArr)
            // 获取高度min的位置索引
            var minIndex = getminheightLocation(BoxHeightArr, minHeight)
            // console.log(minHeight)
            ccontent[i].style.position = 'absolute'
            ccontent[i].style.top = minHeight + 'px'
            // ofl取到该容器到左边距的距离
            ccontent[i].style.left = ccontent[minIndex].offsetLeft + 'px'
            BoxHeightArr[minIndex] = BoxHeightArr[minIndex] + ccontent[i].offsetHeight
        }
    }
}


function getChildElement(parent, content) {
    var contentArr = []
    // 拿到container所有的子元素的集合    
    var allContent = parent.getElementsByTagName('*')
    // console.log(allContent)
    for (var i = 0; i < allContent.length; i++) {
        if (allContent[i].className == content) {
            // 添加名为box的元素
            contentArr.push(allContent[i])
        }
    }
    return contentArr
}


function getminheightLocation(BoxHeightArr, minHeight) {
    // es6 of是元素  in代表下标
    for(var i in BoxHeightArr) {
        if(BoxHeightArr[i] === minHeight)
            return i
    }
}