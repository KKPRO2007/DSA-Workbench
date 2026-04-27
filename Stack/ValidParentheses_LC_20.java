import java.util.*;
public class ValidParentheses_LC_20 {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <>();
        for(char ch: s.toCharArray()){
            if(ch =='(' || ch =='{' || ch=='['){
                st.push(ch);
            }   
            else {
                if(st.isEmpty()) return false;
                int top = st.pop();
                if(ch==')' && top != '(') return false;
                if(ch=='}' && top != '{') return false;
                if(ch==']' && top != '[') return false; 
            }
        }
        return st.isEmpty();
     }
}
