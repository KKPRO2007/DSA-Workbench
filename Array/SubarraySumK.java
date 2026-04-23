
import java.util.*;
public class SubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += a[i];
        System.out.println(sum);

        for (int i = k; i < n; i++) {
            sum += a[i] - a[i-k];
            System.out.println(sum);
        }
    }
}
