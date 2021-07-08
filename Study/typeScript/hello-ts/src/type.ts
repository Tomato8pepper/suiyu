// 其他常见的类型

//any类型
// let notSure: any = 4
// notSure = 'stringmancongminglaiajiushizhekuaihuokaklsa'


//unknow类型
// let value: any;
// value = true
// value = 1
// value = 'hello'
// value = Symbol('type')
// value = {}
// value = []
// value.foo.bar
// value()
// new value()
// value[0][1]



// let value2: unknown;
// value2 = true
// value2 = 1
// value2 = 'hello'
// value2 = Symbol('type')
// value2 = {}
// value2 = []
// value2.foo.bar      //报错
// value2()            //报错
// new value2()        //报错
// value2[0][1]        //报错




//never类型
// const empty: never[] = []
// empty.push[1]        //报错
// 类型为never 永远不会有返回值
// function error(message: string): never{
//     throw new Error(message)
// }




//数组
// const list: number[] = [1, 2, 3]
// const list1: string[] = ['1', '2', '3']

//泛型
// const list2: Array<number> = [1, 2, 3]  

//元组
// const list3: (number | string)[] = ['1', 2, 3]

//对象
// let obj: object 
// obj = [1]
// obj = [1, '2']
// obj = {}










