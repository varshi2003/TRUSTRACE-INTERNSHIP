
import java.util.*;
public class ReverseTheNumber {
    public static void reverseNumber(int num)
    {
        int rev=0;
        int temp=num;
        while(temp>0)
        {
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        System.out.println("The reverse of "+num+" is "+rev);

    }
    public static void main(String[] args)
    {
        System.out.println("Reverse The Number Program:\nEnter the number to be reversed:");
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        reverseNumber(inp);

    }
}
