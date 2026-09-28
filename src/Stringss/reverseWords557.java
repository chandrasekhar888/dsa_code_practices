package Stringss;

public class reverseWords557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest" ;
        System.out.println(reverse(s));
    }

     static String reverse(String s) {
        String[] words =s.split(" ");
        int i=0;
         StringBuilder answer = new StringBuilder();
         while (i<words.length){
                StringBuilder sb=new StringBuilder(words[i]);
                sb.reverse();
                answer.append(sb);
                if (i != words.length - 1) {
                    answer.append(" ");
                }
                i++;
            }
        return answer.toString();
    }
}
