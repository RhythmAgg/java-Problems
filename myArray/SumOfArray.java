package myArray;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,66,7};
        int sum=0;int i=0;
        while(i<arr.length){
            sum=sum+arr[i];
            i++;
        }
        System.out.print(sum);
    }
}
