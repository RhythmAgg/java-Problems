package Matrices;

public class LowerTriangle {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{3,4,5,},{6,7,9,}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i>=j){
                    System.out.print(a[i][j]+" ");
                }   
            }System.out.println();
        }
    }
}
