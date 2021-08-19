/**
 * 接口多继承，类单继承。
 */
interface GoneTest {
    // 开火方法
    fire(str: string);
}
interface Gone extends GoneTest {
    color: string;
}

class BlackCat implements Gone {
    color: string = 'red';
    fire (str: string) {
        console.log('黑猫开火了！'+ str, this.color);
    }
}


new BlackCat().fire('piapiapia')