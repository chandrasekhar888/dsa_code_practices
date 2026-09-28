package ArraysPractice;

public class Evencells {
    public static void main(String[] args) {
        int[] nums =  {12,345,2,6,7896};
        int even =0 ;

        for(int i=0;i<nums.length;i++) {
            int count = 0;
            int result = nums[i]; // result=12
            while (result > 0) {
                int i1 = result % 10; // i1 = 2
                System.out.println(i1);
                count++;
                result = result / 10;

            }
            if (count % 2 ==0){
                even++ ;
            }
            System.out.println("output"+ even);

        }
        }
    }
