public class NoofDigits {
    public static void main(String[] args) {
        //NO. of digits in base b of number n
        //Formula = int (log[base b]n) + 1;
        int n = 521511;
        int b = 10;
        int res = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(res);
    }
}
