package OOP.KeywordSuper;

class Animal {
    String color = "white";
}

class Dog extends Animal{
    String color = "black";
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperTest1 {
    public static void main(String[] args) {
        Dog Blue = new Dog();
        Blue.printColor();
    }
}
