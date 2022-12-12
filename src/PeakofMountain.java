public class PeakofMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
//        https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
        }
        return start;
    }
}
