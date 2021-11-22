import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
         int sum=0;
         for(int i=0;i<input.length();i++){
             sum=sum+(int)Math.pow(input.charAt(i)-'0', input.length());
         }
         String s=String.valueOf(sum);
         if(s.compareTo(input)==0){
             System.out.println("the number is an amstrong");
         }else{
             System.out.println("not an amstrong");
         }
    }
    
}
