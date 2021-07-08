class Octopus {
    public readonly name: string = "abc";
}
let dad = new Octopus();
console.log(dad.name);
// dad.name = 'Man with the 3-piece suit';      //错误， name属性只是可读的。
