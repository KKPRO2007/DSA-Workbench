import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n=z.nextInt(); int a[]= new int[n]; int c=0;
        for(int i = 0; i < n; i++) a[i] = z.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                //for sub
                for(int k = i; k <= j; k++)
                    System.out.print(a[k] + " ");
                System.out.println();
                c++;
            }
        }
        System.out.println(c);
    }
}
