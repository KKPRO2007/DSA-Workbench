import java.util.Scanner;
public class ReverseNo {
    public static void main(String hidf[]){
        Scanner z= new Scanner(System.in);
        int n = z.nextInt();
        int rev =0;
        while(n!=0){
            int k=n%10;
            n=n/10;
            rev = rev*10+k;
        }
        System.out.println(rev);
    }
}
