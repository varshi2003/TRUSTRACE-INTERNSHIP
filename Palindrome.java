import java.util.*;
public class Palindrome {
    public static boolean checkPalindrome(int num)
    {

     int temp=num;
     int rev=0;
     while(temp>0)
     {
         int rem=temp%10;
         rev=rev*10+rem;
         temp/=10;
     }
     return rev==num;

    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Palindrome program:\n Enter the number to find if it's a Palindrome:");
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        boolean res=checkPalindrome(inp);
        if(res)
            System.out.println(inp+" is a Palindrome.");
        else
            System.out.println(inp+" is not a palindrome.");

    }


}
