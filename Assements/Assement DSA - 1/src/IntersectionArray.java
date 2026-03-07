import java.util.Scanner;
public class IntersectionArray {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt(); int a[]=new int [n];
        for(int i =0; i<n; i++) a[i]= z.nextInt();
        int n2 = z.nextInt(); int a2[]=new int [n2];
        for(int i =0; i<n2; i++) a2[i]= z.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n2;j++) if(a[i]==a2[j]) {
                System.out.print(a[i] + " ");
                break;
            }
        }
    }
}