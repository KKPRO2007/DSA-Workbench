import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner z= new Scanner (System.in);
        String s=z.next(); int n=s.length(); int c=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){

                System.out.println(s.substring(i,j));
                c++;
            }
        }
        System.out.println(c);
    }
}
