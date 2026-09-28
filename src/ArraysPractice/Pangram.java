package ArraysPractice;

public class Pangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean[] seen = new boolean[26];

        // Mark letters as seen
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            int index = ch - 'a';

            seen[index] = true;
        }

        // Check if all letters were found
        boolean isPangram = true;

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram);
    }
}
