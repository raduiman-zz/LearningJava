package JavaArrays;

import JavaSorting.BubbleSort;

import java.util.Scanner;

public class CopyElements {
    static void Copy(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }
    public static void main(String[] args){
        BubbleSort alfa = new BubbleSort();
        int a[] = alfa.readArray();
        Scanner input_a = new Scanner(System.in);

        BubbleSort beta = new BubbleSort();
        int b[] = beta.readArray();
        Scanner input_b = new Scanner(System.in);
        Copy(a, b);
        for(int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
