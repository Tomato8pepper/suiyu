function identity<T> (arg: T): T{
    //对于类型的处理或判断，需要用到类型
    return arg;
}

let output = identity<string>('mystring')
console.log(output);



class Test<T, S> {
    public name: T;
    // add: (X: S) => S;
    add(X: S): S { return X; }
}

let test = new Test<number, string> ();
test.name = 112;
let result = test.add('123')
console.log(result);
