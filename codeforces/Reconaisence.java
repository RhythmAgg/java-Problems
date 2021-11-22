package codeforces;

import java.util.Scanner;

public class Reconaisence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int i1=1;int i2=2;
        int diff=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n;i++){
            if(i==n-1){
                if(Math.abs(arr[n-1]-arr[0])<diff){
                    i1=n;i2=1;
                }
            }else{
            if(Math.abs(arr[i]-arr[i+1])<diff){
                    i1=i+1;i2=i+2;
                    diff=Math.abs(arr[i]-arr[i+1]);
            }
        }
    }
    System.out.print(i1+" "+i2);
    }
}
