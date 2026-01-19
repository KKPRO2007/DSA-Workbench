import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int b = z.nextInt();
        int gcd = 1;
        int x = a, y = b;

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}
