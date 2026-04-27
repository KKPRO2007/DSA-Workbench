// LeetCode 844
public class BackspaceStringCompare_LC_844 {
    private String build(String s) {
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (st.length() > 0) {
                    st.deleteCharAt(st.length() - 1);
                }
            } else {
                st.append(ch);
            }
        }
        return st.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static void main(String[] args) {
        BackspaceStringCompare_LC_844 obj = new BackspaceStringCompare_LC_844();
        System.out.println(obj.backspaceCompare("ab#c", "ad#c"));
    }
}