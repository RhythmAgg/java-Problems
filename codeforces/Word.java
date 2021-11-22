package codeforces;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int count=0;
        if(s.length()==1){
            System.out.println(s);
        }else{
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'>48){
                count++;
            }
        }
        if(count>=s.length()/2){
            System.out.print(s.toLowerCase());
        }else{
            System.out.print(s.toUpperCase());
        }
    }
}
}