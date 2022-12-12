import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                List<Integer> internel = new ArrayList<>(outer.get(i));
                internel.add(num);
                outer.add(internel);
            }
        }

        return outer;
    }
}
