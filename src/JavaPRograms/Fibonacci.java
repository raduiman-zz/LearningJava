import java.util.Scanner;

class Fibonacci {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fibonacci length: ");
        int length = input.nextInt();
        System.out.println("Fibonacci length: " + length);
        long first = 0, second = 1;
        for(int i = 0; i < length; i++) {
            System.out.print(first + " ");
            long aux = second;
            second += first;
            first = aux;
        }
    }
}

class FibonacciRecursive {
    private static long first = 0, second = 1;
    private static void printFibonacci(int length) {
        if(length > 0) {
            System.out.print(first + " ");
            long aux = second;
            second += first;
            first = aux;
            printFibonacci(length - 1);
        }
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fibonacci length: ");
        int length = input.nextInt();
        System.out.println("Fibonacci length: " + length);
        printFibonacci(length);
    }
}
