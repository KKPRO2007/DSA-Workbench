// LeetCode 438
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllAnagramsInString_LC_438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : p.toCharArray()) {
            need[ch - 'a']++;
        }

        int k = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }
            if (i >= k - 1 && sameFreq(need, window)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }

    private static boolean sameFreq(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        System.out.println(findAnagrams(s, p));
    }
}