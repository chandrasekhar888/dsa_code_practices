package functions;

import java.util.Scanner;

//Define a method to find out if a number is prime or not.
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println(" true");
        else
            System.out.println(" false");
    }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}