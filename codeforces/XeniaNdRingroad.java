package codeforces;

import java.util.Scanner;

public class XeniaNdRingroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int[] arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }sc.close();
        int j=0;int time=0;
        for(int i=1;i>0;i++){
            if(arr[j]==i){
                if(j==m-1){
                    break;
                }if(arr[j]==arr[j+1]){
                    i=i-1;
                    time=time-1;
                }
                j++;
            }if(i==n){
                i=0;
            }
            time++;
        }
        System.out.print(time);
    }
}
