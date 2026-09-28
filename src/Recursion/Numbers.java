package Recursion;

public class Numbers {
    public static void main(String[] args) {
     print1(1);
    }
    static void print1(int n){
        if (n<5){
            print1(n);
        }
    }
}
