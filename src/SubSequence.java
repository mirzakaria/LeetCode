import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String st = "abc";
        System.out.println(subseqRet("", st));
    }

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subseq(p, up.substring(1));
        subseq(p + up.charAt(0), up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
//            System.out.println(p);
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }

        ArrayList<String> left = subseqRet(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }


}
