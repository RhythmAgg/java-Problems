package codeforces;
import java.util.Scanner;
public class LightsOut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr1=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||i==4||j==0||j==4){
                    arr1[i][j]=0;
                }else{
                arr1[i][j]=sc.nextInt();
            }
        }
    }sc.close();
    int[][] arr2=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if((arr1[i+1][j+1]+arr1[i+1][j]+arr1[i+1][j+2]+arr1[i][j+1]+arr1[i+2][j+1])%2==0){
                arr2[i][j]=1;
                System.out.print(arr2[i][j]);
            }else{
                arr2[i][j]=0;
                System.out.print(arr2[i][j]);
            }
        }System.out.println();
    }
    }
}