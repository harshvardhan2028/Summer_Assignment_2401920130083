package Week_3.Day_4;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && temperatures[st.peek()] <= temperatures[i])
                st.pop();

            if (st.size() == 0)
                nse[i] = 0;
            else
                nse[i] = st.peek() - i;
            st.push(i);
        }
        return nse;
    }
}

