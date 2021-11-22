    import java.util.ArrayList;
public class Pascal {
    public static ArrayList<Integer> array=new ArrayList<Integer>();
    public static ArrayList<Integer> array2=new ArrayList<Integer>();
    public static void main(String[] args) {
        int rows=8;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-1-i;j++){
                System.out.print(" ");
            }if(i==0){
                System.out.print(1);
            }else{
            ArrayList<Integer> arr1=arr(i);
            for(int j=0;j<2*i+1;j++){
                // The following line has been moved one level up
                // ArrayList<Integer> arr1=arr(i);
                if(j%2==0){
                    System.out.print(arr1.get(j/2));
                }else{
                    System.out.print(" ");
                }
            }
            }System.out.println();
        }
    }
    static ArrayList<Integer> arr(int k){       
        if(k==1){
            array.add(0,1);
            array.add(0,1); 
             //array2=array;    This line has been deleted
             array2.add(1);
             array2.add(1);
            return array;
        }else{
            array.set(0,1);
            for(int l=1;l<k;l++){
                array.set(l, (int)array2.get(l-1)+(int)array2.get(l));
            }
            array.add(k, 1);
            array2.clear();
            for(int m=0;m<array.size();m++){
                array2.add(m, array.get(m));
            }
            return array;
        }
    }
}

