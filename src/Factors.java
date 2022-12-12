public class Factors {
    public static void main(String[] args) {
        factors(36);
    }

    static void factors(int n){
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                if(n / i == i){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }
}
