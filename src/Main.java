//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1};
        Sorter sorter = new Sorter();
        sorter.bubbleSort(arr);
        arr = new int[]{9,8,7,6,0};
        sorter.selectionSort(arr);
    }
}