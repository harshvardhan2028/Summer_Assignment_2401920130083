package Day_1;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] arr1 = s.toCharArray(); // convert to char array
        Arrays.sort(arr1); // sort character

        char[] arr2 = t.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

