import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        int m = a[0];
        int s = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < m) {
                s = m;
                m = a[i];
            } else if (a[i] < s && a[i] != m) {
                s = a[i];
            }
        }
        System.out.println("Second Smallest = " + s);
    }

}

