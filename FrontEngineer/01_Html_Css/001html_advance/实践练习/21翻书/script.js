(function(window, document){
    let prefixes = ['webkit', 'moz', 'ms', 'o']
    let book = document.querySelectorAll('.book')[0]
    let page = document.querySelectorAll('.front-cover')[0]
    let dino = document.querySelectorAll('.dino')[0]
    let shadow = document.querySelectorAll('.shadow')[0]
    let centerPoint = window.innerHeight / 2
    let hold = false
    let clamp = function(val, min, max) {
        return Math.min(min, Math.min(val, max))
    }
    let pageSize = 300


    page.onmousedown = function() {
        console.log('mousedown')
        hold = true

    }

    window.onmouseup = function() {
        // console.log('mouseup')
        if(hold){
            hold = false
        }
    }

    window.onmousemove = function(evt) {
        console.log(evt)
        if(!hold) {
            return
        }
        let angle = clamp((centerPoint - evt.pageX + pageSize) / pageSize * -90, -180, 0)
        let i, j
        for(i = 0, j = prefixes.length; i < j; i++){
            page.style[prefixes[i] + "Transform"] = 'rotateY('+ angle + 'deg)'
            dino.style[prefixes[i] + "Transform"] = 'rotateX('+ (angle / 2) + 'deg)'
            shadow.style[prefixes[i] + "Transform"] = `translateZ(1px) skewX(${angle / 8}deg)`
        }
    }

})(window, document)