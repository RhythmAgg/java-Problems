package codeforces;
import java.util.Scanner;
public class PanoramaPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=s+1;i<=e;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){    
                    count=0;               
                    break;
                }else{
                    count=1;
                }                
            }if(count==1&&i!=e){
                System.out.print("NO");
                break;
            }if(count==0&&i==e){
                System.out.print("NO");
            }if(count==1&&i==e){
                System.out.print("YES");
            }
        }
    }
}
