package functions;

import java.util.Scanner;

// Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.

/*
Note : Ctrl+Alt+L == used for Indentation
* */
public class largest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int largest = max(a, b, c);
        int smallest = min(a, b, c);

        System.out.println("Maximum: " + largest);
        System.out.println("Minimum: " + smallest);

    }

    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }

    static int min(int a,int b,int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
