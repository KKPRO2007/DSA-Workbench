// LeetCode 26
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }
        for (int i = 0; i <= j; i++)
            System.out.print(a[i] + " ");
    }
}
