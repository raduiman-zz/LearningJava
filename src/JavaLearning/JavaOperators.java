class UnaryOperators {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        System.out.println(+x);
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
        int c = 10;
        int d = -10;
        boolean e = true;
        boolean f = false;
        System.out.println(~c);
        System.out.println(~d);
        System.out.println(!e);
        System.out.println(!f);
    }
}

class ArithmeticOperators {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
    }
}

class LeftShiftOperator {
    public static void main(String args[]) {
        System.out.println(10 << 2);
        System.out.println(10 << 3);
        System.out.println(20 << 2);
        System.out.println(15 << 4);
    }
}

class RightShiftOperator {
    public static void main(String args[]) {
        System.out.println(10 >> 2);
        System.out.println(20 >> 2);
        System.out.println(20 >> 3);
    }
}

class ShiftOperator {
    public static void main(String args[]) {
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }
}

class AndOperator {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c);
        System.out.println(a < b & a < c);
        System.out.println(a < b && a++ < c);
        System.out.println(a);
        System.out.println(a < b & a++ < c);
        System.out.println(a);
    }
}

class OrOperator {
    public static void main(String [] args){
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);
        System.out.println(a > b | a < c);
        System.out.println(a > b || a++ < c);
        System.out.println(a);
        System.out.println( a > b | a++ < c);
        System.out.println(a);
    }
}

class TernaryOperator {
     public static void main(String [] args){
         int a = 10;
         int b = 5;
         int min = (a < b) ? a : b;
         System.out.println(min);
     }
}

class AssignmentOperator {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        a += 4;
        b -= 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println("\nEx1");
        a += 3;
        System.out.println(a);
        a -= 4;
        System.out.println(a);
        a *=2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        System.out.println("\nEx2");
        short c = 10;
        short d = 10;
        c = (short)(c + d);
        System.out.println(c);
    }
}
