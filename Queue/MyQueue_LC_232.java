
import java.util.*;
public class MyQueue_LC_232 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.peek();
    }
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public static void main(String[] args) {
        MyQueue_LC_232 q = new MyQueue_LC_232();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.pop());  // 1
        System.out.println(q.empty()); // false
    }
}
