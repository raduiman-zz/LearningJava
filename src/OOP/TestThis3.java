package OOP;

public class TestThis3 {
    void m(TestThis3 obj) {
        System.out.println("method is invoked");
    }
    void p() {
        m(this);
    }
    public static void main(String[] args) {
        TestThis3 s1 = new TestThis3();
        s1.p();
    }
}
