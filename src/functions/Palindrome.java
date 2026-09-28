package functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (isPalin(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static boolean isPalin(int n) {
        int orginal = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return orginal == rev;
    }
}
//we save the original value bcoz else after the dry run n becomes 0 n==rev false so we save n in
//Original