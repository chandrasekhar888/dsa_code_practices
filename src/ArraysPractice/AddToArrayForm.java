package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {

    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> answer = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {

            if (i >= 0) {
                k = k + num[i];
            }

            answer.add(0, k % 10);

            k = k / 10;

            i--;
        }

        System.out.println(answer);
    }
}