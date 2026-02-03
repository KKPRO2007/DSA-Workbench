import java.util.Scanner;
public class PrintOddNumbersAndCount {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " ");
                count++;
            }
        }
        System.out.println(count);
    }
}
