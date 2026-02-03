package Array;

import java.util.*;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        boolean ok = true;
        for (int i = 0; i < n/2; i++) {
            if (a[i] != a[n-1-i]) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "Palindrome" : "Not Palindrome");
    }
}