package codeforces;
import java.util.Scanner;
public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        sc.close();
        int r1=0;int count=0;  
        while(n>0){
            r1=(int) (n%10);
            n=n/10;
            if(r1==4||r1==7){
                count++;
            }
        }
        if(count==4||count==7){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
       }
    }    

