package JavaSorting;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

   static void bubbleSort(int[] arr) {
        int n = arr.length;
        int aux;
        for(int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
   }
   public static int[] readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of String array: ");
        int length = sc.nextInt();
        String[] input = new String[length];
        System.out.println("Please enter array elements: ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            String userInput = sc.next();
            input[i] = userInput;
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println("The String array input from user is: ");
        System.out.println(Arrays.toString(input));
        return arr;
   }

    public static void main(String[] args){
        int[] arr = readArray();
        int length = arr.length;
        bubbleSort(arr);

        System.out.println("Array after Bubble Sort: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
