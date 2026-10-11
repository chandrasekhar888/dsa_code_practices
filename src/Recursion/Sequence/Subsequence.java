package Recursion.Sequence;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = subseq(str);
        System.out.println(ans);
    }

    private static ArrayList<String> subseq(String str) {
        //base
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char ch = str.charAt(0);//ch =a
        ArrayList<String> result = subseq(str.substring(1));//bc
        ArrayList<String> ans = new ArrayList<>();//[]

        for (int i = 0; i < result.size(); i++) {
            String s = result.get(i);

            // Skip current character
            ans.add(s);

            // Take current character
            ans.add(ch + s);
        }
        return ans;
    }
}