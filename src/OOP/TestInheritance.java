package OOP;
class Animal {
    void eat() {System.out.println("eating...");}
}

class Dog extends Animal {
    void bark() {System.out.println("barking");}
}

class Cat extends Animal {
    void meow () {System.out.println("meowing...");}
}

public class TestInheritance {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        c1.meow();
        c1.eat();
    }
}
