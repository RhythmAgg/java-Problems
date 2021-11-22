package codeforces;
import java.util.Arrays;
import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        int[] arr=new int[(s.length()+1)/2];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(2*i)-'0';
        }
        Arrays.sort(arr);
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(arr[i/2]);
            }else{
                System.out.print("+");
            }
        }
    }
}
