public interface Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
        };
        int target = 1;
        System.out.println(searchMatrix(arr, target));
    }
    static boolean searchMatrix(int[][] matrix, int target) {
//        https://leetcode.com/problems/search-a-2d-matrix/
        int rows = matrix.length;
        int cols = matrix[0].length;
        int topRow = 0, bottomRow = rows - 1;
        int midRow = 0;
        while(topRow <= bottomRow){
            midRow = topRow + (bottomRow - topRow) / 2;
            if(target < matrix[midRow][0]) {
                bottomRow = midRow - 1;
            } else if (target > matrix[midRow][cols - 1]) {
                topRow = midRow + 1;
            } else {
                break;
            }
        }
//        System.out.println(midRow);
        int start = 0, end = cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(target < matrix[midRow][mid]) {
                end = mid -1;
            } else if (target > matrix[midRow][mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
