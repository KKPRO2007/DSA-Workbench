// LeetCode 345
import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int l = 0, r = s.length - 1;
        while (l < r) {
            if (!isVowel(s[l])) l++;
            else if (!isVowel(s[r])) r--;
            else {
                char temp = s[l];
                s[l] = s[r];
                s[r] = temp;
                l++;
                r--;
            }
        }
        System.out.println(new String(s));
    }
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
