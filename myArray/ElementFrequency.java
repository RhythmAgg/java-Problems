package myArray;
public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr1={1,2,8,8,2,2,2,3,3,5,1};
         int[] arr2=new int[arr1.length];
         for(int i=0;i<arr1.length;i++){
             int count=1;
             for(int j=i+1;j<arr1.length;j++){
                 if(arr1[i]==arr1[j]){
                     count++;
                 }
             }arr2[i]=count;
         }
         for(int i=0;i<arr1.length;i++){
             System.out.println(arr1[i]+" frequency is:-- "+arr2[i]);
         }
    }
    
}
