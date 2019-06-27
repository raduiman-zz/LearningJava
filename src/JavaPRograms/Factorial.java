package JavaPRograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt(), factorial = 1;
        for(int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
