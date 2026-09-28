package ArraysPractice;

import java.util.ArrayList;
import java.util.List;

class createTargetArray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }

        int[] result = new int[target.size()];

        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }

        System.out.println(result);
    }
}