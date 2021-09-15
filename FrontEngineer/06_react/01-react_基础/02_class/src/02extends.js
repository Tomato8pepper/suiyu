class Person {
    age = 100;
    constructor (props) {
        this.age = props.age;
    }
}

class Boy extends Person{
    name = 'rose';
    constructor (props) {
        super(props);
        this.name = props.name
    }
}

let o1 = new Boy({ name: 'mick', age: 18})


export default function () {
    console.log('ll1', o1);
}