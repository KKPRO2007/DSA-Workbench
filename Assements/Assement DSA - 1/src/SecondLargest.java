import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();

        int max = a[0];
        int second = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            } else if (a[i] < max && a[i] > second) {
                second = a[i];
            }
        }
        System.out.println("Second Largest = " + second);
    }
}
