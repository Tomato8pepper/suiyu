// js是单线程的
function foo() {
    console.log('a')
}
function fo() {
    setTimeout(() =>{
        console.log('b')
    }, 1000)
}
function fooo() {
    console.log("c")
}
fooo()
fo()
foo()