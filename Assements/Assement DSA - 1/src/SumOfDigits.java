import java.util.Scanner;
public class SumOfDigits {
    public static void main (String kri[]){
        Scanner z = new Scanner(System.in);
        int n =z.nextInt();
        int sum=0;
        while(n!=0){
            int k= n%10;
            n =n/10;
            sum = sum +k;
        }
        System.out.println(sum);
    }
}
