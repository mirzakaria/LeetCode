public class PrimeNumber {
    public static void main(String[] args) {
        int n = 40;
        //false = prime
        //true = non-prime
        boolean[] primes = new boolean[n + 1];
        isPrime(n, primes);

    }


    static void isPrime(int n, boolean[] arr){
        //SEIVE OF ERATOSTHENES
        //false in the array means the number is prime
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i + i; j <= n ; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
                System.out.print(i + "\t");
            }
        }
    }

//    static boolean isPrime(int n){
//        if(n <= 1){
//            return false;
//        }
//
//        for (int i = 2; i *i <= n; i++) {
//            if(n % i == 0){
//                return false;
//            }
//        }
//
//        return true;
//    }
}
