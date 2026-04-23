
import java.util.Scanner;
public class ArrayIndexSum {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt(); int a[]=new int [n];
        for(int i =0; i<n; i++) a[i]= z.nextInt();
        int sum=a[0]+a[1]; System.out.println(sum);
    }
}
