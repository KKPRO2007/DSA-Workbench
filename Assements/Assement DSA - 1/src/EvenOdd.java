import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
