package codeforces;
import java.util.Scanner;
public class StoneOnTheTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        String s=sc.nextLine();
        sc.close();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
        }
        System.out.print(count);
    }
}
