package OOP;
class B {
    A1 obj;
    B(A1 obj) {
        this.obj = obj;

    }
    void display() { System.out.println(obj.data);}
}
class A1 {
    int data = 10;
    A1() {
        B b = new B(this);
        b.display();
    }
}
public class TestThis4 {
    public static void main(String[] args) {
        A1 a = new A1();
    }
}
