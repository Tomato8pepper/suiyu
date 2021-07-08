let data = [
    { value: '周杰伦的听妈妈的话,我听了十年！',time: 5,color: 'red',speed: '1', fontSize: 22 },
    { value: '快快长大，才能保护她！', time: 10,color: 'orange',speed: '2',fontSize: 30 },
    { value: '周杰伦的听妈妈的话,我听了十年！',time: 15,color: 'yellow',speed: '3',fontSize: 22 },
    { value: '听妈妈的话,晚点再恋爱吧！', time: 20, },
    { value: '周杰伦的听妈妈的话,不要打架！', time: 25, color: 'red', speed: '5', fontSize: 22 },
    { value: '周杰伦的听妈妈的话,要听话！', time: 30, }
]

// get dom element
let canvas = document.getElementById('canvas')
let video = document.getElementById('video')
let $txt = document.getElementById('text')
let $btn = document.getElementById('btn')
let $color = document.getElementById('color')
let $range = document.getElementById('range')


// console.log(canvas, video, $btn, $color, $range, $txt)

// 创建CanvasBarrage类
class CanvasBarrage {
    constructor(canvas, video, opts = {}) {
        // opts = {}  //如果没有传递值，默认{}，防止报错
        if (!canvas || !video) return
        // current 类
        this.video = video
        this.canvas = canvas
        //canvas宽高和video一致
        this.canvas.width = video.width
        this.canvas.height = video.height

        // 画布的操作
        this.ctx = canvas.getContext('2d')

        //设置默认参数，如果没传就给带上
        let defOpts = {
            color: '#e91e63',
            speed: 1.5,
            opacity: 0.5,
            fontSize: 20,
            data: []
        }
        // 合并对象, 在给到this
        Object.assign(this, defOpts, opts)    //color speed opacity fontSize data[]

        //添加属性，用来判断播放暂停，默认识true为暂停
        this.isPaused = true

        //得到所有的弹幕
        this.barrages = this.data.map(item => new Barrage(item, this))

        this.render()
    }
    // 渲染canvas绘制的弹幕
    render() {
        // 清除原来的画布
        this.clear()
        // 渲染弹幕
        this.renderBarrage()
        if(this.isPaused === false) {
            // 递归进行渲染
            requestAnimationFrame(this.render.bind(this))
        }
    }

    clear(){
        this.ctx.clearRect(0, 0, this.canvas.width, this.canvas.height)
    }

    renderBarrage(){
        // 当前视屏播放时间
        // 根据当前时间与要展示的弹幕的时间作对比，来判断是否展示弹幕
        let time = this.video.currentTime

        //遍历all弹幕，每一个barrages都是Barrage的实例
        this.barrages.forEach(barrage => {
            // 用flag来处理是否默认渲染, false
            // 播放时间>=弹幕展示时间时才处理
            if(!barrage.flag && time >= barrage.time){
                // 判断当前弹幕是否初始化？
                // 如果isInit是false，那么就要对当前弹幕进行初始化操作
                if(!barrage.isInit){
                    barrage.init()
                    barrage.isInit = true

                }
                //弹幕从右往左出来  所以x坐标减去当前弹幕的speed即可
                barrage.x -= barrage.speed
                barrage.render()

                // 如果当前弹幕的x坐标比自身宽度的负值还要小，就表示出屏幕了
                if(barrage.x < -barrage.width) {
                    barrage.flag = true        //设置为true下次就不会渲染了

                }
                
            }
        });



    }


    add(obj) {
        // 往barrages数组里添加一项Barrage实例
        this.barrages.push(new Barrage(obj, this))
    }

}

// 实例化每一条弹幕的barrage类
class Barrage {
    constructor(obj, ctx) {
        this.value = obj.value;     //弹幕的内容
        this.time = obj.time
        // 把obj和ctx都挂到this上方便获取
        this.obj = obj
        this.context = ctx
    }

    // 初始化弹幕
    init() {
        // 直接取默认参数
        this.color = this.obj.color || this.context.color
        this.speed = this.obj.speed || this.context.speed
        this.opacity = this.obj.opacity || this.context.opacity
        this.fontSize = this.obj.fontSize || this.context.fontSize

        // 计算每一条弹幕的宽度
        let p = document.createElement('p')
        p.innerHTML = this.value
        p.style.fontSize = this.fontSize + 'px'
        document.body.appendChild(p)
        this.width = p.clientWidth
        // 移除
        document.body.removeChild(p)
        // 位置
        this.x = this.context.canvas.width
        this.y = this.context.canvas.height * Math.random()

        // 超出范围
        if (this.y < this.fontSize) {
            this.y = this.fontSize
        }
        else if (this.y > this.context.canvas.height - this.fontSize) {
            this.y = this.context.canvas.height - this.fontSize
        }
    }

    // 渲染弹幕
    render() {
        // 设置画布上的字体和字号
        this.context.ctx.font = `${this.fontSize}px Arial`
        // 设置颜色
        this.context.ctx.fontStyle = this.color
        // 绘制文字
        this.context.ctx.fillText(this.value, this.x, this.y)

    }
}

// 创建实例
let canvasBarrage = new CanvasBarrage(canvas, video, { data })

video.addEventListener('play', () => {
    canvasBarrage.isPaused = false
    canvasBarrage.render()
})


$btn.addEventListener('click', send)

$txt.addEventListener('keyup', (e) => {
    // console.log(e)
    let key = e.keyCode
    key === 13 && send()
})
    



function send() {
    let value = $txt.value      //输入内容
    let time = video.currentTime   //当前视屏时间
    let color = $color.value
    let fontSize = $range.value
    let obj = { value, time, color, fontSize }

    // 添加弹幕数据
    canvasBarrage.add(obj)
    $txt.value = ""
}

