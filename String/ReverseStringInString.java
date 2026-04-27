import java.util.Scanner;

public class ReverseStringInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder rev = new StringBuilder(s);
        System.out.println(rev.reverse());
    }
}