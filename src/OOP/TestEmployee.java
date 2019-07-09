package OOP;

class Employee {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }
    void display () {System.out.println(id + " " + name + " " + salary);}
}
public class TestEmployee {
    public static void  main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(1, "Ion", 1250);
        e2.insert(2, "Gheorghe", 1300);
        e3.insert(3, "Vasi", 2350);
        e1.display();
        e2.display();
        e3.display();
    }
}
