public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibbonacci(5));
    }

    static int fibbonacci(int n){
        if(n < 2) {
            return n;
        } else {
            return fibbonacci(n - 1) + fibbonacci(n - 2);
        }
    }
}
