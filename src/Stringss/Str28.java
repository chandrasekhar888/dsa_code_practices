package Stringss;

public class Str28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }

    static int strStr(String haystack, String needle) {
   /*      for (int i = 0; i <= haystack.length()-needle.length(); i++) {
             int index = i; int j=0;
             while (index < haystack.length() && j < needle.length() &&haystack.charAt(index) == needle.charAt(j)) {
                 index++;
                 j++;

             }
             if(j==needle.length()){
                 return i;
             }
         }
        return -1;
    }
    }*/
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}

