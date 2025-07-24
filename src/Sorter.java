import java.util.Arrays;

public class Sorter {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j +1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Printing Bubble sorted array....");

        System.out.println(Arrays.toString(arr));
    }

    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Printing Selection sorted array....");

        System.out.println(Arrays.toString(arr));
    }

    public void mergeSort(int[] arr){

    }

    public void radixSort(int[] arr){

    }

    public void insertionSort(int[] arr){

    }
}
