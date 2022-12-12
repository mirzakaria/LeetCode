public class FloodFill {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,0,0},
                {1,0,0,0,0},
                {0,0,1,1,1},
                {1,0,0,0,0},
                {1,1,1,1,0}
        };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int count = 0;
                int total = floodFill(arr, i, j, count);
                if(max < total){
                    max = total;
                }
//                System.out.println(floodFill(arr, i, j, count));
            }
        }
        System.out.println(max);
    }

    static int floodFill(int[][] arr, int x, int y, int count){
        if(arr[x][y] == 0 || x == 0 || x == arr.length - 1 ||  y == 0 || y == arr[0].length - 1){
            return 0;
        }
        if(arr[x][y] == 1){
            arr[x][y] = 0;
            count++;
            count  = count  + floodFill(arr, x + 1, y, count);
            count  = count  + floodFill(arr, x - 1, y, count);
            count  = count  + floodFill(arr, x,y + 1, count);
            count  = count  + floodFill(arr, x,y - 1, count);
        }
        return count;
    }
}
