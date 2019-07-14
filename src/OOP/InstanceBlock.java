package OOP;

class A2 {
    A2(){
        System.out.println("\nparent class constructor invoked");
    }
}

class B2 extends A2 {
    B2() {
        super();
        System.out.println("\nchild class constructor invoked");
    }
    B2(int a) {
        super();
        System.out.println("\nchild class constructor invoked " + a);
    }

    {System.out.println("\ninstance initializer block is invoked");}

    public static void main(String[] args) {
        B2 a1 = new B2();
        B2 a2 = new B2(10);
    }
}
