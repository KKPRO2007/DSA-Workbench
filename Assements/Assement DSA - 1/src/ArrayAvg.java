import java.util.Scanner;
public class ArrayAvg {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        double avg = (double) sum / n;
        System.out.println(avg);

    }
}
