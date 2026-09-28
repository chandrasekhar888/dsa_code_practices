package ArraysPractice;

import java.util.*;

public class Rule {

    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        CountMatchesSolution obj = new CountMatchesSolution();

        int answer = obj.countMatches(items, ruleKey, ruleValue);

        System.out.println(answer);
    }
}

class CountMatchesSolution {

    public int countMatches(List<List<String>> items,
                            String ruleKey,
                            String ruleValue) {

        int index;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            String currentValue = items.get(i).get(index);

            if (currentValue.equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}