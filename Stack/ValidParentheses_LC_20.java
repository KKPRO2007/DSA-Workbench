import java.util.*;
public class ValidParentheses_LC_20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            } else if (ch == '{') {
                st.push('}');
            } else if (ch == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses_LC_20 obj = new ValidParentheses_LC_20();
        String s = "{[()]}";
        boolean res = obj.isValid(s);
        System.out.println(res);
    }
}
