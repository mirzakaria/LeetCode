import java.util.Arrays;

public class MergeSortRec {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                res[k] = first[i];
                i++;
            } else {
                res[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            res[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            res[k] = second[j];
            j++;
            k++;
        }

//        System.out.println(Arrays.toString(res));

        return res;
    }


            //MERGE SORT IN-PLACE//

    static void mergeSortInPlace(int[] arr, int start, int end){
        if (end - start == 1) {
            return;
        }
//        int mid = (start + end) / 2;
        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }
    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int[] res = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                res[k] = arr[i];
                i++;
            } else {
                res[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid){
            res[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            res[k] = arr[j];
            j++;
            k++;
        }

//        System.out.println(Arrays.toString(res));
        for (int l = 0; l < res.length; l++) {
            arr[start+l] = res[l];
        }
    }
}
