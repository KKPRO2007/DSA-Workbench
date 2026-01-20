import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int x = z.nextInt();
        int y = z.nextInt();
        int gcd = 1;
        int a = x, b = y;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        gcd = a;
        int lcm = (x * y) / gcd;
        System.out.println(lcm);
    }
}
