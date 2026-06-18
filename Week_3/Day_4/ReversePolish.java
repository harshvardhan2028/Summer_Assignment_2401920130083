package Week_3.Day_4;

import java.util.Stack;

public class ReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b + a);
            } else if (token.equals("-")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            } else if (token.equals("*")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b * a);
            } else if (token.equals("/")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            } else
                st.push(Integer.parseInt(token));
        }
        return st.pop();
    }
}

