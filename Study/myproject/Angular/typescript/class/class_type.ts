// 声明一个Person类

class Person {
    // 成员属性，未来实例的属性，属于个体的
    name: string;
    age: number;
    constructor(name:string, age:number) {
        this.name = name;
        this.age = age;
    }
    //成员函数（方法）
    getPersonInfo():Person {
        return this;   //this -> Person类型
    }
    
}

//不建议通过属性的方式来修改属性的值，一般都通过函数的方式来修改属性的值


let p1 = new Person('ming', 20)
console.log(p1);

