package codeforces;

import java.util.Scanner;

public class SuperceentralPoint {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] arr=new int[n][2];
    for(int i=0;i<2*n;i++){
        for(int j=0;j<2;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        sc.close();
    }

}
}