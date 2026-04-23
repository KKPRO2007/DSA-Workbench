
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
