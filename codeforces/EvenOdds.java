package codeforces;
import java.util.Scanner;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();Long m=sc.nextLong();
        sc.close();
        if(n%2==0){
            if(m<=n/2){
                System.out.print(2*m-1);
            }else{
                System.out.print(2*(m-n/2));
            }
        }else{
            if(m<=(n+1)/2){
                System.out.print(2*m-1);
            }else{
                System.out.print(2*(m-(n+1)/2));
            }
        }

    }
}
