import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumber448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
//        https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
        List<Integer> result = new ArrayList<>();
        int i  = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j] - 1){
                result.add(j+1);
            }
        }
        return result;
    }
}
