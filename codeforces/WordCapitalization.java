package codeforces;
import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(i==0){
                char c=s.charAt(0);
                arr[0]=Character.toUpperCase(c);
            }else{
                arr[i]=s.charAt(i);
            }
        }
         s=String.valueOf(arr);
         System.out.print(s);    }
}
