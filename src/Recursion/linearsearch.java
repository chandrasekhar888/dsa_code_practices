package Recursion;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr ={5,3,1,2,4};
        int target =2;
        int index= 0;

        System.out.println(linearSearch(arr,target,index));
    }

     static int linearSearch(int[] arr, int target, int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index] ==target ){
            return index;
        }

        return linearSearch(arr,target,index+1);
    }
}
