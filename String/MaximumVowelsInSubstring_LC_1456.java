// LeetCode 1456
import java.util.Scanner;

public class MaximumVowelsInSubstring_LC_1456 {
    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;
            if (i >= k && isVowel(s.charAt(i - k))) count--;
            if (i >= k - 1) ans = Math.max(ans, count);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(maxVowels(s, k));
    }
}