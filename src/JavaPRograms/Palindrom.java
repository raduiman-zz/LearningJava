package JavaPRograms;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt(), returned = 0;
        int aux = number;
        while(aux > 0) {
            returned = returned * 10 + aux % 10;
            aux /= 10;
        }
        if(number == returned) {
            System.out.println("The number is palindrom!");
        } else {
            System.out.println("The number is not a palindrom!");
        }


    }
}
