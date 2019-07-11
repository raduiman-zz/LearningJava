package OOP;

class Student7 {
    int rollno;
    String name, course;
    float fee;
    Student7(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    Student7(int rollno, String name, String course, float fee) {
        this(rollno, name, course);
        this.fee = fee;
    }
    void display() {System.out.println(rollno + " " + name + " " + course + " " + fee);}
}

public class TestThis1 {
    public static void main(String[] args) {
        Student7 s1 = new Student7(111, "Ion", "Java");
        Student7 s2 = new Student7(112, "Gheo", "Python", 12232f);
        s1.display();
        s2.display();
    }
}
