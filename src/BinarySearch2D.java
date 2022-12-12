import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 41},   //row wise & column wise sorted
                {12, 22, 32, 42, 43},
                {15, 25, 34, 44, 45},
                {16, 27, 38, 50, 55}
        };
        int target = 41;
        System.out.println(Arrays.toString(binarySearch2D(arr, target)));
    }

    static int[] binarySearch2D(int[][] nums, int target){
        int row = 0;
        int column = nums[0].length - 1;
        while(row < nums.length && column >= 0){
            if(nums[row][column] == target){
                return new int[] {row, column};
            }
            if(nums[row][column] > target){
                column--;
            }else {
                row++;
            }
        }
        return new int[] {-1, -1};
    }
}
