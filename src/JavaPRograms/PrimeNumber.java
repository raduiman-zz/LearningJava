package JavaPRograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int half = number / 2;
        boolean prim = true;
        for (int i = 2; i <= half; i++) {
            if (number % i == 0) {
                System.out.println("Not a prime number!");
                prim = false;
                break;
            }
        }
        if (prim) {
            System.out.println("Prime number!");
        }
    }
}
