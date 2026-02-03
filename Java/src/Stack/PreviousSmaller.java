package Stack;
import java.util.*;
public class PreviousSmaller {
    public int[] prevSmaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= nums[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        PreviousSmaller obj = new PreviousSmaller();
        int[] nums = {4, 5, 2, 10, 8};
        int[] res = obj.prevSmaller(nums);
        for (int x : res)
            System.out.print(x + " ");
    }
}