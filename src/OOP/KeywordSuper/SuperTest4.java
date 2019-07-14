package OOP.KeywordSuper;

class Person {
    int id;
    String name;
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;
    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }
    void display() { System.out.println(id + " " + name + " " + salary);}
}

public class SuperTest4 {
    public static void main(String[] args) {
        Emp e = new Emp(111, "Radu", 2300.3f);
        e.display();
    }
}
