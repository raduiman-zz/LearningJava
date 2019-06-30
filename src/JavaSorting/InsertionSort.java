package JavaSorting;

public class InsertionSort {
    static void insertionSort(int arr[], int length) {
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String [] args) {
        BubbleSort read = new BubbleSort();
        int arr[] = read.readArray();
        int length = arr.length;
        insertionSort(arr, length);
        System.out.println("Array after sort!");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
