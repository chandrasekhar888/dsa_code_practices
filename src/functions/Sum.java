package functions;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
//Write a program to print the sum of two numbers entered by user by defining your own method.

/* public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num 1 : ");
        int a = sc.nextInt();
        System.out.println("Num 2 : ");
        int b = sc.nextInt();

        int pro =product(a,b);
        System.out.println(pro);
       int sumof = sum(a,b);
        System.out.println(sumof);
    }
    static int product(int a,int b){
        return a*b;
    }
    static int sum(int a,int b){
        return a+b;
    }
}
*/

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Product");

        int choice = sc.nextInt();
        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();

        if (choice == 1) {
            System.out.println("Sum of Given Input : " + sum(a, b));
        } else if (choice == 2) {
            System.out.println("Product of given input is:" + pro(a, b));
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int pro(int a, int b) {
        return a * b;
    }
}