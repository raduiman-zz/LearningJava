package OOP;

class StaticBinding {
    void eat() { System.out.println("dog is eating..");}
}

class DynamicBinding {
    void eat() { System.out.println("animal is eating...");
    }
}

class Dog1 extends DynamicBinding {
    void eat() { System.out.println("dog is eating...");}
    }



public class Binding {
    public static void main(String[] args) {
        StaticBinding d1 = new StaticBinding();
        DynamicBinding d2 = new Dog1();
        d1.eat();
        d2.eat();
    }
}
