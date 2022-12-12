public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 4, 55, 66, 78};
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end){
        int mid = start + (end - start) / 2;
        if(start > end){
            return -1;
        } else if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else {
            return mid;
        }
    }
}
