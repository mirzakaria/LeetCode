import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] cycleSort(int[] arr){
        int i  = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
//                System.out.println(arr[i]);
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
