import java.util.Scanner;
public class SecondSmallest {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        int min = a[0];
        int second = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                second = min;
                min = a[i];
            } else if (a[i] < second && a[i] != min) {
                second = a[i];
            }
        }
        System.out.println("Second Smallest = " + second);
    }
}
