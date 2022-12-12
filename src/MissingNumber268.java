public class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums){
//        https://leetcode.com/problems/missing-number/
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] ;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
//                System.out.println(arr[i]);
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}
