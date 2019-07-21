/* Example of abstract class and interface in Java */

package OOP;

interface A3 {
    void a();
    void b();
    void c();
    void d();
}

abstract class B3 implements A3 {
    public  void c() { System.out.println("I am c");
    }
}

class M3 extends B3 {
    public void a() { System.out.println("I am a"); }
    public void b() { System.out.println("I am b"); }
    public void d() { System.out.println("I am d"); }
}

public class Test5 {
    public static void main(String args[]) {
        A3 a = new   M3();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
