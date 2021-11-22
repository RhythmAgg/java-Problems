package codeforces;
import java.util.Scanner;
public class QueueattheSchool {
    static String solve(String s){
        for(int j=0;j<s.length();j++){
                if(j<s.length()-1&&s.charAt(j)=='B'&&s.charAt(j+1)=='G'){
                    char[] ch=s.toCharArray();
                    ch[j]='G';
                    ch[j+1]='B';
                    s=String.valueOf(ch);
                    j=j+1;
                }
        }return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         sc.nextInt();
        int t=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        sc.close();
        for(int i=1;i<=t;i++){
             s1=solve(s1);
        }
        System.out.print(s1);
    }
}
