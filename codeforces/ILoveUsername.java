package codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class ILoveUsername{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=arr.clone();     
        int count=0;
        for(int i=0;i<n;i++){
            if(i==0){
                count=0;
            }else{
                Arrays.sort(arr, 0, i+1);
                if(arr2[i]==arr[i]&&arr[i]!=arr[i-1]||arr2[i]==arr[0]&&arr[0]!=arr[1]){
                    count++;
                }
            }
        }
        sc.close();
        System.out.print(count);
    }
}