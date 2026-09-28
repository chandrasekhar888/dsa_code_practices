package ArraysPractice;
/*
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
*/
public class LuckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},
                         {9,11,13},
                       {15,16,17}};

        int[] mins = new int[matrix.length];

        for(int row=0 ;row<matrix.length;row++) {
            int min = matrix[row][0];
            int mincol = 0;

            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    mincol = col;
                }
            }
            mins[row] =min;
            System.out.println(min + " Belongs to Row " + row + " & Col " + mincol );
        }
        int max = mins[0];

        for (int i = 1; i < mins.length; i++) {

            if (mins[i] > max) {
                max = mins[i];
            }
        }

        System.out.println("Maximum among row minimums = " + max);
    }
}