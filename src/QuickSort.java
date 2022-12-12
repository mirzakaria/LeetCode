import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.toString(mergeSort(arr)));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        int i = start;
        int j = end;
        int pivot = arr[mid];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, start, j);
        quickSort(arr, i, end);
    }
}
