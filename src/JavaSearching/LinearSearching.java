package JavaSearching;

import JavaSorting.BubbleSort;

import java.util.Scanner;

public class LinearSearching {
    static int linearSearching(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BubbleSort read = new BubbleSort();
        int arr[] = read.readArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key to search for: ");
        int key = input.nextInt();
        int index = linearSearching(arr, key);
        System.out.println("The key " + key + " is found at index : " + index);
    }
}
