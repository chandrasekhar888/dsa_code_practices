package Stringss;

public class longestCommonPrefix14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"} ;
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
    static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];

        for (int i = 1; i <strs.length ; i++) {
            int j =0 ;
                while (j<prefix.length() && j < strs[i].length() && strs[i].charAt(j)== prefix.charAt(j)){
                    j++;
                }
            prefix = prefix.substring(0, j);

            // If no common prefix is left, stop early
            if (prefix.isEmpty()) {
                return "";
            }

        }
        return prefix;
    }
}
