// 打印函数,通过id获得dom结构
// console.log(document.getElementById("test"))
// 通过类名来获得dom
// console.log(document.querySelector("speed-bar"))
// 获得图标dom变量bar
var bar = document.querySelector(".speed-bar")
// 获得滚动条dom
var speed = document.querySelector(".speed")
// 获得音频标签dom
var video = document.querySelector('.flex')

// 当调用了回调函数的时候就会就得到一个e事件参数
function handleMove(e){
//  获得距离容器顶部的高度             调用offsetTop获取一个元素距离浏览器顶部的高度  this可以代替调用回调函数的变量
    var y = e.pageY - this.offsetTop
//得到当前高度占容器高度的百分比         osh可以得到当前容器的高度
    var percent = y / this.offsetHeight
    var min = 0.4
    var max = 4
    // Math.round加上0.5在向下取整
    var height = Math.round(percent * 100) + '%'
    var playbackRate = percent * (max - min) + min

    bar.style.height = height 
    // tofixed保留两位小数
    bar.textContent = playbackRate.toFixed(2) + 'x'
    // 实现视频播放速率
    video.playbackRate = playbackRate
}

// 滚动条中  当鼠标移动事件被监听器监听到了就会调用回调函数handleMove()
    speed.addEventListener('mousemove',handleMove)