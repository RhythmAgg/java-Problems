package Matrices;

public class SumOfrowandColumn {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] sum=new int[2][3];
        for(int i=0;i<2;i++){   
            for(int j=0;j<3;j++){
                sum[i][j]=0;
                for(int k=0;k<3;k++){
                    if(i==0){
                    sum[i][j]+=a[j][k];
                    }else{
                        sum[i][j]+=a[k][j];
                    }
                }
            }        
        }
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[0].length;j++){
                System.out.print(sum[i][j]+" ");
            }System.out.println();
        }
    }
}
