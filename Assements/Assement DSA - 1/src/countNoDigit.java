import java.util.Scanner;
public class countNoDigit {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int c = 0;
        if (n == 0)
            c = 1;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(c);
    }
}
