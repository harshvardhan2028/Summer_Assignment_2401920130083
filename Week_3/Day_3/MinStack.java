package Week_3.Day_3;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minst.size() == 0 || minst.peek() > val)
            minst.push(val);
        else
            minst.push(minst.peek());

    }

    public void pop() {
        st.pop();
        minst.pop();
    }

    public int top() { // peek
        return st.peek();
    }

    public int getMin() {
        return minst.peek();
    }
}

