public class OddorEven {
    public static void main(String[] args) {
        int n = 98;
//        System.out.println(n & 1);
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
