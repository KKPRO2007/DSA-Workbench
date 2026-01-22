import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int x=z.nextInt(),y=z.nextInt();
        int a=x, b=y;
        while(b!=0){
            int r=a%b;
            a=b; b=r;
        }
        int lcm=(x*y)/a;
        System.out.println(lcm);
}
}