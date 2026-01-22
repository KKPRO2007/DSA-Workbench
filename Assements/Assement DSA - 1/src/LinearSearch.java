import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = z.nextInt();
        int key = z.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}

