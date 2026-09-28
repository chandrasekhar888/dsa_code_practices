package BinarySearch;
//find postion of an element in infinite number of arrays

public class FindPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,15,18,20,33};
        int start =0;
        int end = 1;
        int target =15 ;
        while (target > arr[end]){
            int temp= end + 1 ;
            end=end+(end-start+1)*2;
            if (end >= arr.length) {
                end = arr.length - 1;
            }
            start =temp;
        }
        System.out.println(binarysearch(arr,start,end,target));;
    }

    private static int binarysearch(int[] arr, int start, int end, int target) {

        while (start <= end){
            int mid =start+(end-start)/2 ;

            if(target > arr[mid]){
                start = mid+1;
            }else if (target < arr[mid]){
                end =mid-1;
            }else {
                return mid ;
            }
        }

        return -1 ;
    }
}
