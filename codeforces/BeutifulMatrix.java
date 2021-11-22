package codeforces;
import java.util.Scanner;
import java.lang.Math;
public class BeutifulMatrix{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr=new int[5][5];
        int k=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=in.nextInt();
                if(arr[i][j]==1){
                     k=Math.abs(i-2)+Math.abs(j-2);
                }
            }
        }in.close();
        System.out.print(k);
	}
}