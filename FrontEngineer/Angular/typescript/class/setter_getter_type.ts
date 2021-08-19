class Person3 {
    private _age: number = 12;

    //提供公共的访问方式
    get age (): number {
        return this._age;
    }
    set age(newAge: number) {
        if (newAge > 100 || newAge < 0) {
            alert('年龄不合法!')
        }else {
            this._age = newAge;
        }
        this._age = newAge;
    }
}

let p = new Person3();

//get 获取，   set p.age = -1
p.age = -1;
p.age = 18;




/**
 * Accessors are only available when targeting ECMAScript 5 and higher
 * 因为默认使用的是ES3的代码规范编译，可以提高ES代码规范的版本
 * tsc -t ES5 .\setter_getter_type.ts
 */