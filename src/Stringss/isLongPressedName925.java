package Stringss;

public class isLongPressedName925 {
    public static void main(String[] args) {
        String name = "saeed" , typed ="ssaaedd";
        boolean Output =  isLongPressedName(name,typed);
        System.out.println(Output);
    }
    static boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {

            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            else {
                return false;
            }
        }

        while (j < typed.length()) {

            if (typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }

            j++;
        }

        return i == name.length();
    }}
