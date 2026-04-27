// LeetCode 225
import java.util.LinkedList;
import java.util.Queue;

public class MyStack_LC_225 {
    Queue<Integer> q;

    public MyStack_LC_225() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int sz = q.size();
        while (sz > 1) {
            q.offer(q.poll());
            sz--;
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack_LC_225 st = new MyStack_LC_225();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}