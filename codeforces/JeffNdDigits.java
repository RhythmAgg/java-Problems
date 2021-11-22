package codeforces;
import java.util.Scanner;
public class JeffNdDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c0=0;int c5=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==5){
                c5++;
            }else{c0++;}
        }sc.close();
        if(c5<9&&c0>0){
            System.out.print(0);
        }else if(c0==0){
            System.out.print(-1);
        }else{
            for(int i=1;i<=9*(c5/9)+c0;i++){
                if(i<=9*(c5/9)){
                    System.out.print(5);
                }else{
                    System.out.print(0);
                }
            }
        }
    }
}
