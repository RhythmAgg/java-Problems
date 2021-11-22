package myArray;

public class ThirdLargest {
    static int getElement(int[] a){
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }if(count==a.length-3){
                return a[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,10,21,5};
        System.out.println("the 3rd Largest integer is: "+getElement(arr));
        
    }
    
}
