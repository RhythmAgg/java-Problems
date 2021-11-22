import java.util.Scanner;
public class NoOfPrime {
    static boolean test(int n){
        for(int j=2;j<n;j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    System.out.println("Enter the first Number: ");
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    System.out.println("Enter the next number: ");
    int e=sc.nextInt();
    System.out.println("the list of prime numbers between "+s+" and "+e+" are:");
    sc.close();
    for(int i=s+1;i<=e;i++){
        boolean k=test(i);
        if(k==true){
            System.out.println(i);
        }
    }
}
}       
    

