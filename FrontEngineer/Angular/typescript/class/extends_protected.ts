class Person2 {
    public name : string = 'ming';
    private parentAge: number = 20;
    protected parentSex: string = 'man';
}
class Son extends Person2 {
    public sonAge: number = 23;
    public testParentAge () {
        // console.log(this.parentAge);         // private 依旧不能访问
        console.log(this.parentSex);            // protected 子类可以访问 
        
        
    }
}

let s = new Son();      //s ->{ name: "ming", parentAge: 20, parentSex: "man", sonAge: 23}
console.log('--s', s);
s.testParentAge()
// s.parentAge = 333;      //外部不能访问  


/**
 * 总结：
 *      访问修饰符与继承无关，只要符合继承规则都能访问。
 *      public属性可以在任意代码范围访问。
 *          class外部，   继承的class中访问
 *      private自己类内部访问
 *      protected自己和子类中被访问
 */