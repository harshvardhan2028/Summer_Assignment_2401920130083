package Week_3.Day_3;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if (n % 2 == 1)
            return false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty())
                    return false;
                char top = st.peek();
                if (isSame(top, s.charAt(i)))
                    st.pop();
                else
                    return false;
            }
        }
        return (st.size() == 0);
    }

    public boolean isSame(char a, char b) {
        if (a == '(' && b == ')')
            return true;
        if (a == '{' && b == '}')
            return true;
        if (a == '[' && b == ']')
            return true;
        return false;
    }
}
