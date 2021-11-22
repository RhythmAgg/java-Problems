package Matrices;

public class TwoMatricesEqual {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{4,7,8,}};
        int[][] b={{1,2,3},{4,5,6},{4,7,8,}};
        int count=0;
        if(a.length!=b.length||a[0].length!=b[0].length){
            System.out.println("matrices not equal");
        }else{
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    if(a[i][j]!=b[i][j]){
                        break;
                    }
                }count=1;
            }
            if(count==0){
                System.out.println("the matrices are not equal");
            }else{
                System.out.println("The matrices are equal");
            }
        }


    }
}
