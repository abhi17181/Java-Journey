import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(number==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    
    public  static void main(String[]args){
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number is palidrome"+ palindrome);
        }
        else{
            System.out.println("The number is not palindrome"+palindrome);
        
        }
    }
}
