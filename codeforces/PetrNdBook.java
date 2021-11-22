package codeforces;
import java.util.Scanner;
public class PetrNdBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[7];int sum=0;
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(sum>=n){
                System.out.print(i+1);
                break;
            }
        }sc.close();
        if(sum<n){
            int r;
            if(n%sum==0){
                 r=sum;
            }else{
             r=n%sum;}           
            sum=0;
            for(int j=0;j<7;j++){
                sum+=arr[j];
                if(sum>=r){
                    System.out.print(j+1);
                    break;
                }
            }
        }

    }
}