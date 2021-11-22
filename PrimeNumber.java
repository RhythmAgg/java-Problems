import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
            int nuber=sc.nextInt();
            boolean c=false;
            sc.close();
            for(int i=2;i<nuber;i++){
                if(nuber%i==0){
                    c=true;
                    break;
                }else{
                    c=false;
                }
            }
            if(c==true){
                System.out.println("prime number");
            }else{
                System.out.println("not prime number");
            }
    }
    
}
