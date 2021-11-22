package codeforces;
import java.util.*;
public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int[] arr2=arr.clone();
        Arrays.sort(arr);
        int s=0;int e=0;byte k=0;byte l=0;
        for(int i=0;i<arr.length;i++){
            if(arr2[i]==arr[n-1]&&k==0){
                e=i;
                k++;
            }if(arr2[n-1-i]==arr[0]&&l==0){
                s=i;
                l++;
            }
        }if(e>n-1-s){       
        System.out.print(e+s-1);
    }else{
        System.out.print(e+s);
    }
}
}
