import java.util.Scanner; 
public class PrimeBetween2No {
    public static void main(String[] args){  
   Scanner start=new Scanner(System.in);   
 System.out.println("enter the starting number");
 int s=start.nextInt();
 System.out.println("enter the second number");
 int e=start.nextInt();
 int cout=0;
 start.close();
 for(int i=s+1;i<e;i++){
     for(int j=2;j<i;j++){
         if(i%j==0){
             cout++;
             break;

         }
     }
 }
 int k=e-s-1-cout;
 System.out.println("No. of prime number between "+s+" and "+e+" are:"+k);
    }
    
}
