package myArray;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,10,12,4};
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            arr2[count]=arr[i];
        }
        System.out.print("The sorted Array is:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
