package JavaSearching;

import JavaSorting.BubbleSort;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BubbleSort read = new BubbleSort();
        int arr[] = read.readArray();
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        int last = arr.length - 1;
        int index = binarySearch(arr, 0, last, key);
        System.out.println("The key " + key + " is found at index : " + index);


    }
}
