class Person1 {
    public name: string = 'ming';      //内外部都可以访问
    private age: number = 20;          //只能类内部访问
    public showName():void {
        console.log(this.name, this.age);
        
    }
}


//默认修饰符是 public; 外部可以访问到类里面的属性和方法
let p = new Person1()
p.name = 'cha';
p.showName()         //cha
