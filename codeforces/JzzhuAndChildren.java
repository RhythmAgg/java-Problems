package codeforces;

import java.util.Scanner;

public class JzzhuAndChildren {
    static int test(int[] array){
        int count=0;
        for(int j=0;j<array.length;j++){
            if(array[j]!=0){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=1;i<=n;i++){
            if(arr[i-1]==0){              
            }else{
                if(test(arr)==1){
                    System.out.print(i);
                    break;
                };
            if(arr[i-1]<=m){
                arr[i-1]=0;
            }else{
                arr[i-1]=arr[i-1]-m;
            }
        }if(i==n){
            i=0;
        }
    }
}
}