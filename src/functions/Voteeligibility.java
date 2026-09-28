package functions;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.
public class Voteeligibility {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.println("Age:");
        int eligibility = age.nextInt();
        
        if(voting(eligibility)){
            System.out.println("Major");
        }
        else {
            System.out.println("Minor");
        }
        age.close();
    }
    static boolean voting( int eligibility ){
        return eligibility >=18 ;
    }
}
