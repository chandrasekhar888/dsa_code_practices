package BitwiseOperators;

public class Duplicacy {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,2,4,3};
        int ans = 0;

        for(int num :arr){
            ans=ans^num;
        }
        System.out.println(ans);
    }
}
