package codeforces;
import java.util.Scanner;
public class PerfectPermutaion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int[] arr=new int[n];
        if(n%2==0){
            for(int i=0;i<n;i++){
                if(i%2==0){
                    arr[i]=2*((i/2)+1);
                System.out.print(arr[i]+" ");
            }else{
                arr[i]=i;
                System.out.print(arr[i]+" ");
            }
        }
        }else{
            System.out.print("-1");
        }
        
    }
}
