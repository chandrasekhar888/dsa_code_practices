package ArraysPractice;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums= {2,5,1,3,4,7} ;
        int n = 3;

        int[] result =new int[nums.length];
        for(int i=0;i<n;i++){
            result[2*i]=nums[i];
            result[2*i+1]=nums[i+n];

        }
        System.out.println(Arrays.toString(result));
    }
}
