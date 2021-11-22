package codeforces;
import java.util.Scanner;
public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i>n;i++){
            String s=String.valueOf(i);
            int count=0;
            second:
            for(int j=0;j<s.length();j++){
               for(int k=j+1;k<s.length();k++){
                    if(s.charAt(j)==s.charAt(k)){
                        count=0;
                        break second;
                    }else{
                        count=1;
                    }
                }
            }
            if(count==1){
                System.out.print(s);
                break;
            }
        }sc.close();
    }
}
