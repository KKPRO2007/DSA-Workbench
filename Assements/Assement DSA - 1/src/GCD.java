import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int b = z.nextInt();
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
