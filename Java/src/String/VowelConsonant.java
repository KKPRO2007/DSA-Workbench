package String;
import java.util.*;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else c++;
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}