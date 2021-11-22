package codeforces;
import java.util.Scanner;
public class BorzeCode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        char[] c=s.toCharArray();
        int[] a=new int[c.length+1];
        int j=0;
        for(int i=0;i<c.length;i++){
            if(i==0&&c[0]=='.'||c[i]=='.'){
                a[j]=0;
                System.out.print(a[j]);
                j++;
            }if(c[i]=='-'&&c[i+1]=='.'){
                    a[j]=1;
                    System.out.print(a[j]);
                    j++;i++;
            }if(c[i]=='-'&&c[i+1]=='-'){
                a[j]=2;
                System.out.print(a[j]);
                j++;i++;
            }
        }
        }
}