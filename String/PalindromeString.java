import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String s=z.nextLine().toLowerCase(); String rev="";
        for(int i=s.length()-1; i>=0;i--)
            rev=rev+s.charAt(i);
        if(s.equals(rev))
            System.out.println("yes");
        else
        System.out.println("No");


    }


}
