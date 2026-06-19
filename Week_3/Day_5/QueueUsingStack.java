import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> st;
    Stack<Integer> helper;

    public QueueUsingStack() {
        st = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) { // O(n)
        while (st.size() > 0) {
            helper.push(st.pop());
        }
        st.push(x);
        while (helper.size() > 0) {
            st.push(helper.pop());
        }

    }

    public int pop() { // O(1)
        return st.pop();
    }

    public int peek() { // O(1)
        return st.peek();
    }

    public boolean empty() {
        return (st.size() == 0);
    }
}

