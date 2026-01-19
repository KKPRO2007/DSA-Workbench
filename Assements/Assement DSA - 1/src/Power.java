import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int b= z.nextInt();
        int e = z.nextInt();
        int r= 1;
        for (int i = 1; i <= e; i++) {
            r *= b;
        }
        System.out.println(r);
    }
}
