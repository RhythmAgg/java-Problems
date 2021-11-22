package codeforces;
import java.io.*;
public class HexadecimalTheorem {
    static int fibonachi(int k){ 
        if(k==1){
            return 1;
        }else if(k==2){
            return 1;
        }else{
            return fibonachi(k-2)+fibonachi(k-1);
        }           
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader sc=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(sc);
        int n=Integer.parseInt(br.readLine());
        if(n==0){
            System.out.print("0 0 0");
        }else if(n==1){
            System.out.print("1 0 0");
        }else if(n==2){
            System.out.print("1 1 0");
        }
        else{
            for(int i=4;i>=0;i++){
                if(n==fibonachi(i)){
                    System.out.print(fibonachi(i-2)+" "+fibonachi(i-2)+" "+fibonachi(i-3));
                    break;
                }
            }
        }
    }
}
