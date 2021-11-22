import java.util.Scanner;
public class Sum {
    
        static int fibonachi(int i){ 
            if(i==1){
                return 0;
            }else if(i==2){
                return 1;
            }else{
                return fibonachi(i-2)+fibonachi(i-1);
            }
        }
            static int  sum(int k){
                if(k>0){
                    return fibonachi(k)+sum(k-1);
                }else{
                    return 0;
                }
            }
        public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter no. of terms:");
            int n=obj.nextInt();
            System.out.println("Sum of "+n+ " terms of fibonachi:"+sum(n));
            obj.close();
        }
    }
    

