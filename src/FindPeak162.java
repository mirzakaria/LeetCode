public class FindPeak162 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] nums) {
//        https://leetcode.com/problems/find-peak-element/
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }
        }
        return start;
    }
}
