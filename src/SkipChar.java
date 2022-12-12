public class SkipChar {
    public static void main(String[] args) {
        String given = "baccad";
//        skipA("", given);
        System.out.println(skipAWithRet(given));
        System.out.println(skipApple("pineapplefruit"));
    }

    static void skipA(String ans, String given) {
        if (given.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = given.charAt(0);
        if(ch == 'a') {
            skipA(ans, given.substring(1));
        } else {
            skipA(ans + ch, given.substring(1));
        }
    }

    static String skipAWithRet(String given) {
        if (given.isEmpty()) {
            return "";
        }

        char ch = given.charAt(0);
        if(ch == 'a') {
            return skipAWithRet(given.substring(1));
        } else {
            return ch + skipAWithRet(given.substring(1));
        }
    }

    static String skipApple(String given) {
        if (given.isEmpty()) {
            return "";
        }

        if(given.startsWith("apple")) {
            return skipApple(given.substring(5));
        } else {
            return given.charAt(0) + skipApple(given.substring(1));
        }
    }
}
