package myArray;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr1={2,3,1,5,7,88,90};
        int max=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    max=arr1[i];
                }else{
                    max=arr1[j];
                }
            }
        }System.out.println(max);
    }
    
}
