import java.util.*;
public class BaseBallGame_LC_682 {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < op.length; i++) {
            switch (op[i]) {
                case "+":
                    int n1 = st.pop();
                    int n2 = st.peek();
                    st.push(n1);
                    st.push(n1 + n2);
                    break;
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(2 * st.peek());
                    break;
                default:
                    st.push(Integer.parseInt(op[i]));
                    break;
            }
        }

        int sum = 0;
        while (!st.isEmpty())
            sum += st.pop();

        return sum;
    }

    public static void main(String[] args) {
        BaseBallGame_LC_682 obj = new BaseBallGame_LC_682();

        String[] op = {"5", "2", "C", "D", "+"};

        int res = obj.calPoints(op);

        System.out.println(res);
    }
}
