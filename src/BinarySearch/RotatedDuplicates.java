package BinarySearch;

public class RotatedDuplicates {
    public static void main(String[] args) {
        int[] nums ={2,5,6,0,0,1,2};
        int target =0;
        boolean output = search(nums,target);
        System.out.println(output)  ;
    }

    public static boolean search(int[] nums, int target) {
        int pivot=pivot(nums);

        if(nums[pivot] == target){return true ;}

        if (target >= nums[0]) {
            return binarysearch(nums, 0, 0, pivot - 1);
        } else {
            return binarysearch(nums, 0, pivot + 1, nums.length - 1);
        }
    }

     static boolean binarysearch(int[] nums, int target, int start, int end) {
         while (start <= end){
             int mid =start+(end-start)/2 ;

             if(target > nums[mid]){
                 start = mid+1;
             }else if (target < nums[mid]){
                 end =mid-1;
             }else {
                 return true ;
             }
         }
        return false;
    }

    static int pivot(int[] nums) {
        int start =0 ;int end =nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid ;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1 ;
            }
            if(nums[start]==nums[mid]  && nums[mid] == nums[end] ){
                if(start<end && nums[start]>nums[start+1])
                {
                    return start ;
                }
                start++;
                if(end > start && nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            } else if (nums[mid]<=nums[start]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}

