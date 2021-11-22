import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter the number/name");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        String reverse="";
        for(int i=0;i<input.length();i++){
            reverse=reverse + input.charAt(input.length()-1-i);
        }
        if(input.equals(reverse)){
            System.out.println("Number "+input+" is a pallindrome");
        }else{
            System.out.println("not a pallindrome");
        }

    }
}
