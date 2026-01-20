import java.util.Scanner;
public class Factorial {
    public static void main(String [] ki){
        Scanner z = new Scanner(System.in);
        long n =z.nextInt();
        long f=1;
        for(int i=1;i<=n; i++)
            f=f*i;
        System.out.println(f);
    }
}
