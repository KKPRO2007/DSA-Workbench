package Codes;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String s1 = z.next();String s2 = z.next();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}