package functions;
//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = num.nextInt();

        if (isodd(n)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    static boolean isodd(int n) {
        return n % 2 != 0;
    }
}