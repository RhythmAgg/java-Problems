package codeforces;
import java.util.Scanner;
public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int vasya=0;int petya=0;
        for(int i=0;i<m;i++){
            int temp=sc.nextInt();
            for(int j=0;j<n;j++){
                if(temp==arr[j]){
                    vasya=vasya+j+1;
                    petya=petya+n-j;
                }
            }
        }
        sc.close();
        System.out.print(vasya+" "+petya);
    }
}
