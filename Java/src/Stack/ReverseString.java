package Stack;
import java.util.*;
public class ReverseString {
    public String reverse(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray())
            st.push(ch);
        String res = "";
        while (!st.isEmpty())
            res += st.pop();
        return res;
    }
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String s = "hello";
        String res = obj.reverse(s);
        System.out.println(res);
    }
}