public class SmallestLetter{
    public static void main(String[] args){
        char[] letter = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(nextGreatestLetter(letter, 'u'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
//        https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
//        if(start == letters.length)
//            return letters[0];
//        return letters[start];
    }
}