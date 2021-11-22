package codeforces;
import java.util.Scanner;
public class IsYourHorseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Second:
        for(int i=0;i<4;i++){          
            for(int j=i+1;j<4;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }if(count>1){
                System.out.print(count);
                break Second;
            }
        }
        if(count<2){
            System.out.print(count);
        }
    }
}
