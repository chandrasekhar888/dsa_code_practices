package LinearSearch;

public class Search2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3},
                {78, 99, 34}
        };

        int target = 12;

        int[] ans = search(arr, target);

        System.out.println("Row = " + ans[0]);
        System.out.println("Col = " + ans[1]);
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
