package codeforces;
import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        sc.close();
        int x=sum*100;
        int y=100*n;
        int k=x/y;
        for (int i = 0; i <= 10; i++) {
            System.out.print(k);
            x = x - (y * k);
            
            x = x * 10;
            k = x / y;
            if (i == 0)
                System.out.print(".");
    }
}}

