package codeforces;
import java.util.Scanner;
public class Bitplusplus{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       sc.nextLine();
       int count=0;
       for(int i=0;i<n;i++){
           String s=sc.nextLine();
           if(s.equals("--X")||s.equals("X--")){
               count=count-1;
           }else{
               count++;
           }
       }
       sc.close();
       System.out.print(count); 
    }
}
