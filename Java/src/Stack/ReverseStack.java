package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void pab(int data, Stack<Integer> s){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top = s.pop();
    pab(data,s);
    s.push(top);
}

public static void reverse(Stack<Integer>s){
    if(s.isEmpty()){
        return;
    }
        int top=s.pop();
        reverse(s);
        pab(top,s);

}

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
