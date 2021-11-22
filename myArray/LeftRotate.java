package myArray;
import java.util.Scanner;
public class LeftRotate {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        System.out.print("Enter the number of times to be left rotated ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            if(i+n>arr1.length-1){
                arr2[i]=arr1[(i+n)-arr1.length];
            }else{
                arr2[i]=arr1[i+n];
            }
        }
        System.out.print("the original array is:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("the rotated array is:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}
