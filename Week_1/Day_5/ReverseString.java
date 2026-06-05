package Week_1.Day_5;

public class ReverseString {
    public void reverseString(char[] s) {
        int st = 0, end = s.length - 1;
        while (st < end) {
            char temp = s[end];
            s[end] = s[st];
            s[st] = temp;
            st++;
            end--;
        }
    }
}

