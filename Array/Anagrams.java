
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int k = p.length();
        for (int i = 0; i <= s.length() - k; i++) {
            char a[] = s.substring(i, i+k).toCharArray();
            char b[] = p.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (Arrays.equals(a, b))
                System.out.println(i);
        }
    }
}
