package JavaPRograms;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt(), amstrong = 0, aux = number;
        while(aux > 0) {
            amstrong += Math.pow(aux % 10, 3);
            aux /= 10;
        }
        if(number == amstrong) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not Amstrong number");
        }


    }
}
