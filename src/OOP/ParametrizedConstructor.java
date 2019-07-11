package OOP;

class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() { System.out.println(id + " " + name);}
}
public class ParametrizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(123, "Ion");
        Student s2 = new Student(1234, "Vasi");
        s1.display();
        s2.display();
    }
}
