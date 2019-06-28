package JavaSorting;

public class SelectionSort {

    static void selectionSort(int[] arr, int length) {
        int min, index;
        for (int i = 0; i < length - 1; i++){
            min = arr[i];
            index = i;
            for(int j = i + 1; j < length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        BubbleSort read = new BubbleSort();
        int arr[] = read.readArray();
        int length = arr.length;
        selectionSort(arr, length);
        System.out.println("Array after Bubble Sort: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
