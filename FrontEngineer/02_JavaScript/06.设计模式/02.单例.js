class SingleExam {    
    // 类调用，不能被实例调用
    static getInstance () {
        if (!SingleExam.instance) {
            SingleExam.instance = new SingleExam()
        }
        return SingleExam.instance;
    }
}

let o1 = SingleExam.getInstance();
let o2 = SingleExam.getInstance();
console.log(o1);
console.log(o2);
console.log(o1===o2);