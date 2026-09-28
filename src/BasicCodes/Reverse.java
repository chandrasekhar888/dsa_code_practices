package BasicCodes;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

       int original = n ;
       int reverse = 0 ;

       while (n>0){
           int d =n%10 ;
           reverse = reverse*10+d;
           n=n/10;
       }
        System.out.println(reverse);
    }
}
