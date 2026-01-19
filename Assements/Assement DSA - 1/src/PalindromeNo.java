import java.util.Scanner;
public class PalindromeNo {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        int temp = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
