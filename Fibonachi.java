public class Fibonachi {
    static int fibonachi(int k){ 
        if(k==1){
            return 1;
        }else if(k==2){
            return 1;
        }else{
            return fibonachi(k-2)+fibonachi(k-1);
        }
            

            
    }
    public static void main(String[] args){
        int terms=10;
        for(int i=1;i<=terms;i++){
            System.out.println(fibonachi(i));
        }
        
        
    }
}
