import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));

    }

    static List<Integer> findDuplicates(int[] nums){
//        https://leetcode.com/problems/find-all-duplicates-in-an-array/
        List<Integer> ans = new ArrayList<>();

        int i  = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
//                System.out.println(arr[i]);
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
