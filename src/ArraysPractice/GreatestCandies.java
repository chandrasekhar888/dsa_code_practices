package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {3,4,1,2,5};
        int extracandies = 3;

        /* Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.*/

        int max= candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max =candies[i];
            }

        }
        List<Boolean> result =new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if (candies[i] + extracandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        System.out.println(result);
        }
}
