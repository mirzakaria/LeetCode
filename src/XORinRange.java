public class XORinRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        //xor of numbers from 'a' to 'b'
        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);

        //Only for check our answer
//        int ans2 = 0;
//        for (int i = a; i <= b; i++) {
//            ans2 ^= i;
//        }
//        System.out.println(ans2);
    }

    static int xor(int a){
        // xor from '0' to 'a'
        if(a % 4 == 0){
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else if (a % 4 == 3) {
            return 0;
        }
        return 0;
    }
}
