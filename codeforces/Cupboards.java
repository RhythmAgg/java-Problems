package codeforces;
import java.util.Scanner;
public class Cupboards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        int b1=0;int b2=0;
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextByte();
            if(i%2==0&&arr[i]==0){
                b1++;
            }if(i%2!=0&&arr[i]==0){
                b2++;
            }
        }
        sc.close();
            if(b1>n/2){
                b1=n-b1;
            }if(b2>n/2){
                b2=n-b2;
            }
            System.out.print(b1+b2);
    }
}
