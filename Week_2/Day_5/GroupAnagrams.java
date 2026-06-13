package Week_2.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Arrays.sort(strs, (a, b) -> {
            char[] c1 = a.toCharArray();
            char[] c2 = b.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return new String(c1).compareTo(new String(c2));
        });

        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            List<String> group = new ArrayList<>();
            group.add(strs[i]);

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            int j = i + 1;

            while (j < strs.length) {
                char[] temp = strs[j].toCharArray();
                Arrays.sort(temp);

                if (!key.equals(new String(temp))) {
                    break;
                }

                group.add(strs[j]);
                j++;
            }

            ans.add(group);
            i = j - 1;
        }

        return ans;
    }
}

