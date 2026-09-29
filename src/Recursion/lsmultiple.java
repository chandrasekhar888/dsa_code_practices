package Recursion;
/*
import java.util.ArrayList;

public class lsmultiple {
    public static void main(String[] args) {
        int[] arr ={5,3,1,2,4,2};
        int target =2;

        ArrayList<Integer> ans =new ArrayList<>();
        multiple(arr,target,0,ans);
        System.out.println(ans);
    }

     static void multiple(int[] arr, int target, int index, ArrayList<Integer> ans) {
         if(index==arr.length){
             return ;
         }
         if(arr[index] ==target ){
             ans.add(index);
         }

          multiple(arr, target, index + 1, ans);
    }

}*/

import java.util.ArrayList;

//THE SAME QUESTION RETURN THE LIST WITHOUT PASSING THE ARGS
public class lsmultiple {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,2,4};
        int target=2;
        ArrayList ans = multiple(arr,target,0);
        System.out.println(ans);
    }

     static ArrayList multiple(int[] arr, int target, int index) {
        ArrayList<Integer> ans= new ArrayList<>();

        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        ArrayList<Integer> res= multiple(arr,target,index+1);
        ans.addAll(res);
        return ans;
    }
}
