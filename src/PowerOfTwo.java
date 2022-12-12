public class PowerOfTwo {
    public static void main(String[] args) {
        //n = 1000000 = 11111 + 1
        // 100000 & 11111 = 0
        //Hence, n&(n-1) == 0
        int n = 10; //Note: for, n = 0, it should return false
        boolean res = (n & (n - 1)) == 0;
        System.out.println(res);
    }
}
