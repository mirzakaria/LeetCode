public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(findMagicNumber(3));
    }
    static int findMagicNumber(int n){
        //AMAZON
        int ansSum = 0;
        int base = 5;
        while(n > 0){
            int lastBit = n & 1;
            n = n >> 1;
            ansSum += lastBit * base;
            base *= 5;
        }
//        int lastBit = n & 1;
        return ansSum;
    }
}
