import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        int n1 = z.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) a[i] = z.nextInt();

        int n2 = z.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) b[i] = z.nextInt();

        int[] m = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++)
            m[k++] = a[i];
        for (int i = 0; i < n2; i++)
            m[k++] = b[i];
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + " ");
    }
}
