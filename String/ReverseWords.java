// LeetCode 557
import java.util.*;
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        for (String w : words) {
            StringBuilder rev = new StringBuilder(w);
            System.out.print(rev.reverse() + " ");
        }
    }
}
