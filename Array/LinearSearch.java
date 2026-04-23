
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt(); int a[]=new int [n];
        for(int i =0; i<n; i++) a[i]= z.nextInt();
        int key =z.nextInt(); for(int i=0; i<n;i++){
            if(a[i]==key){
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}
