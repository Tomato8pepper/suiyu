class Test {
    age: number = 12;
    static myName: string  = '12';
    static show () {
        // console.log(this.age); 不能访问
    }
    myShow () {
        console.log(Test.myName);
    }
}
console.log(Test.myName);
Test.myName = 'abc';
console.log(Test.myName);

Test.show();   //模板遭遇实例的创建，不能访问实例属性；
// Test.myShow();     

let p = new Test();