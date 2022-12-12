import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] res = flipAndInvertImage(arr);
        for( int[] ar : res){
            System.out.println(Arrays.toString(ar));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
//        https://leetcode.com/problems/flipping-an-image/

//        int[][] res = new int[image.length][image.length];
//
//        for (int i = 0; i < image.length; i++) {
//            for (int j = image.length - 1, k = 0; j >= 0; j--, k++) {
//                int value = image[i][j];
//                res[i][k] = value ^ 1;
//                System.out.print(res[i][k]);
//            }
//            System.out.println();
//        }
//        return res;

        for(int[] row : image){
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }

        return image;

    }
}
