package Stack;
import java.util.*;
public class RemoveAdjDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch)
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder res = new StringBuilder();
        for (char c : st)
            res.append(c);
        return res.toString();
    }
    public static void main(String[] args) {
        RemoveAdjDuplicates obj = new RemoveAdjDuplicates();
        String s = "abbaca";
        String res = obj.removeDuplicates(s);
        System.out.println(res);
    }
}