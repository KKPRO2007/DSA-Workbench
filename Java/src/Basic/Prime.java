package Basic;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        if (n <= 1) {
            System.out.println("no");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}