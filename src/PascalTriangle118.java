import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    static List<List<Integer>> generate(int numRows) {
//        https://leetcode.com/problems/pascals-triangle/
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> ls = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    ls.add(1);
                } else {
                    ls.add(result.get(i - 2).get(j-1) + result.get(i - 2).get(j - 2));
                }
            }
            result.add(ls);
        }
        return result;
    }
}
