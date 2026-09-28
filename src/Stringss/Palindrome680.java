package Stringss;

public class Palindrome680 {
    public static void main(String[] args) {
        String s = "abca";
        boolean ans= validPalindrome(s);
        System.out.println(ans);
    }

    private static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left<right){
            if (s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1);
            }else {
                left++;
                right--;
            }
        }
        return true;
    }

     static boolean isPalindrome(String s, int left, int right) {
         while (left < right) {

             if (s.charAt(left) != s.charAt(right)) {
                 return false;
             }

             left++;
             right--;
         }

         return true;
    }
}
