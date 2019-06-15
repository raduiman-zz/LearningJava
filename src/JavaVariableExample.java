class JavaVariableExample {
    int data = 50; //instance variable
    static int m = 100; //static variable
    void method(){
        int n = 90; //local variable
    }
}

class AddTwoNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = a + b;
    System.out.println(c);
    }
}

class Widening {
    public static void main(String[] args){
        int a = 10;
        float f = a;
        System.out.println(a);
        System.out.println(f);
    }
}

class Narrowing {
    public static void main(String[] args){
        float f = 10.5f;
        int a = (int)f;
        System.out.println(f);
        System.out.println(a);
    }
}

class Overflow {
    public static void main(String[] args){
        int a = 130;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}

class AddingLowerType {
    public static void main(String[] args){
        byte a = 10;
        byte b = 10;
        byte c = (byte)(a + b);
        System.out.println(c);
    }
}