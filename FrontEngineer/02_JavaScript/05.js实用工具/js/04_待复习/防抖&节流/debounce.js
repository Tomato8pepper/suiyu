// 在规定的时间内未触发第二次，就执行
let debounce = function (func, delay) {
    // 利用闭包保存定时器
    let timer
    return function (...args){
        // 在规定的时间内再次触发会清除定时器再重置定时器
        if(timer){
            clearTimeout(timer)
        }
        timer = setTimeout(()=>{                                                        
            func.apply(this, args)
        }, delay)
    }
}


window.onscroll = debounce(function() {
    console.log('scroll');
}, 1000)