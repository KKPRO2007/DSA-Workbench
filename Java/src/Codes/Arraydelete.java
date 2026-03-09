package Codes;

import java.util.Scanner;
public class Arraydelete {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();   int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = z.nextInt();
        int in = z.nextInt();
        for(int i = in; i < n-1; i++) {a[i] = a[i+1];}
        for(int i = 0; i < n-1; i++){
            System.out.print(a[i] + " ");
        }
    }
}