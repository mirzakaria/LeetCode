public class NoOfSteps1342 {
    public static void main(String[] args) {
        int n  = 14;
//        System.out.println(noOfSteps(n));
        System.out.println(noOfStepsRec(n));
    }
    static int noOfSteps(int n){
//        https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
        int count = 0;
        while(n != 0) {
            if ((n & 1) == 1){
                n--;
                count++;
            } else {
                n /= 2;
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static int noOfStepsRec(int num) {
        return helperFun(num, 0);
    }

    static int helperFun(int num, int steps){
        if (num == 0) {
            return steps;
        }
        if ((num & 1) == 1) {
            return helperFun(num - 1, steps+1);
        }

        return helperFun(num / 2, steps+1);
    }
}
