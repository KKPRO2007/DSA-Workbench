package String;
import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = s.replace(" ", "");
        System.out.println(res);
    }
}