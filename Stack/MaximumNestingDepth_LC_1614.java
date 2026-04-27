// LeetCode 1614
public class MaximumNestingDepth_LC_1614 {
    public int maxDepth(String s) {
        int curr = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                curr++;
                ans = Math.max(ans, curr);
            } else if (ch == ')') {
                curr--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumNestingDepth_LC_1614 obj = new MaximumNestingDepth_LC_1614();
        System.out.println(obj.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}