//number
function getNum (n:number):number {
    return n + 1;       //返回值与声明值要匹配
}

let result: number;
result = getNum(4);
console.log(result);



//void
function show (str: string) :void {
    console.log(str);
    // return null;
    return undefined;
}
    //void 一般来讲是无需return
    // null 后台语言中，常用null来判断没有赋值的空对象
    // undefined 

show('hh')