import java.util.ArrayList;
import java.util.List;

public class DiceTarget {
    public static void main(String[] args) {
        dice("", 4);
//        System.out.println(diceRet("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= target && i <= 6 ; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target && i <= 6 ; i++) {
            list.addAll(diceRet(p + i, target - i));
        }
//        list.addAll(list);
        return list;
    }
}
