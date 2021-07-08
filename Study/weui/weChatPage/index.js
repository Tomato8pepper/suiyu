let send = document.getElementById('send')
let parent = document.getElementById('content-items')

send.addEventListener('click',event)
function event(){
    console.log(123)
    let li = document.createElement('li')
    console.log(li)
    li.setAttribute('class','content-item')

    let divPic = document.createElement('div')
    divPic.setAttribute('class','pic')
    li.appendChild(divPic)
    let img = document.createElement('img')
    img.setAttribute('src','./images/user.jpg')
    divPic.appendChild(img)


    let divMess = document.createElement('div')
    divMess.setAttribute('class', 'message')
    li.appendChild(divMess)
    // let p1 = document.createElement('p')
    // p1.setAttribute('class', 'name')
    // p1.innerHTML = '秋多班'
    let pTex = document.createTextNode('秋多班')
    divMess.appendChild(pTex)


    let p2 = document.createElement('p')
    p2.setAttribute('class', 'detail')
    p2.innerHTML = '拍了拍肩膀'
    divMess.appendChild(p2)

    parent.appendChild(li)
}
