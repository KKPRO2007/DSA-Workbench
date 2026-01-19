import java.util.Scanner;
public class CheckSorted {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}


