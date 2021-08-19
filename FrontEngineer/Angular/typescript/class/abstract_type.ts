abstract class Animal {
    abstract makeSound (): void;
    move (): void {
        console.log('roaming the earch');
    }
}

//只有抽象类包含抽象方法,也可以有已经实现的方法,抽象方法可以给子类实现。
class CatLei extends Animal {
    makeSound () {
        console.log('旺旺');
    }
}

class DogLei extends Animal {
    makeSound() {
        console.log('喵喵');
    }
}

new CatLei().makeSound();
new DogLei().makeSound();