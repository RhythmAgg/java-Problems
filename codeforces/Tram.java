package codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for(int i=0;i<2*n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int[] arr2=new int[n];
        arr2[0]=arr[1];
        for(int i=1;i<n;i++){
            arr2[i]=arr2[i-1]+arr[2*i+1]-arr[2*i];
        }
        Arrays.sort(arr2);
        System.out.print(arr2[n-1]);
    }
}
