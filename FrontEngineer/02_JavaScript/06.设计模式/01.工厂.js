function user (name, age, career, work) {
    this.name  = name;
    this.age = age;
    this.career = career;
    this.work = work;
}
// function coder (name, age) {
//     this.name = name;
//     this.age = age;
//     this.career = 'corder';
//     this.worker = ['需求', 'bug'];
// }

// function production (name, age) {
//     this.name = name;
//     this.age = age;
//     this.career = 'production';
//     this.worker = ['提需求', '催更新'];
// }

// 工厂模式
function factor (name, age, career) {
    let work;
    switch (career) {
        case 'corder': 
            work = ['需求', 'bug']
            break;
        case 'production':
            work = ['提需求', '催更新']
            break
        case 'boss':
            work = ['喝茶', '看报', '见客户'];
        default: break;
    }
    return new user(name, age, career, work);
}

let usr = factor ('小明', 18, 'corder')
console.log(usr)










// 可拓展性的工厂模式     手机生产模式
class MobilePhoneFactor {
    constructor () {
        console.log('公共的部分');
    }
}
class Os {
    controllOs () {
        console.log('需要重写的方法！');
    }
}

class OldPhone extends MobilePhoneFactor {
    constructor (props) {
        super (props);
    }
    // 提供硬件的接口
    createOs () {
        return new AndroidOs ();
    }
    // 提供硬件的接口
    createHardWare () {}
}
class NewPhone extends MobilePhoneFactor {
    createOs () {
        return new AppleOs ();
    }
}


class AndroidOs extends Os {
    controllOs () {
        console.log('安卓生产硬件的方法！');
    }
}

class AppleOs extends Os {
    controllOs () {
        console.log('苹果生产硬件的方法！');
    }
}
 
// 我的手机
let myPhone = new OldPhone();
let os = myPhone.createOs ();
os.controllOs ();



















