class Person {
    age = 100;
    constructor (props) {
        this.age = props.age;
    }
}

class Boy extends Person{
    name = 'rose';
    constructor (props) {
        // 将属性传递给父类
        super(props);
        this.name = props.name
    }
}

let o1 = new Boy({ name: 'mick', age: 18})


export default function () {
    console.log('==o1', o1);
}