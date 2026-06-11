package Week_2.Day_4;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                int l = start;
                int r = end - 1;

                while (l < r) {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }

                start = end + 1;
            }
        }

        return new String(arr);
    }
}

