package codeforces;
import java.util.Scanner;
public class DimaNdFreinds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            sum+=s;
        }sc.close();
         int count=0;
         for(int i=1;i<6;i++){        
             if((sum+i)%(n+1)!=1){
                count++;
             }
         }
        System.out.print(count);
    }
}
