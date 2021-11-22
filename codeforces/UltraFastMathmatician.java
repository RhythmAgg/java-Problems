package codeforces;
import java.util.Scanner;
public class UltraFastMathmatician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] c=new char[s1.length()];
        sc.close();
        for(int i=0;i<s1.length();i++){
            if((s1.charAt(i)-'0')+(s2.charAt(i)-'0')==2){
                c[i]='0';
                System.out.print(c[i]);
            }else{
                c[i]=(char) ((s1.charAt(i)-'0')+(s2.charAt(i)-'0')+'0');
                System.out.print(c[i]);
            }
        }
            
        }
    }

