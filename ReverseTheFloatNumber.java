import java.util.*;
public class ReverseTheFloatNumber {
    public static int ReverseInteger(int inp)
    {
        int rev=0;
        while(inp>0)
        {
            int rem=inp%10;
            rev=rev*10+rem;
            inp/=10;
        }
        return rev;
    }
    public static void ReverseFloat(float num)
    {
        //finding the decimal digits
        int decimal=1;
        while((int)num!=num)
        {
            decimal*=10;
            num*=10;
        }
        int integer_num=(int)num;
        int integer_part=integer_num/decimal;
        int fractional_part=integer_num - (integer_part*decimal);
        int integer_rev=ReverseInteger(integer_part);
        int fractional_rev=ReverseInteger(fractional_part);

        float reversed_fraction=integer_rev+((float)(fractional_rev)/decimal);
//        System.out.println(integer_rev);
//        System.out.println(fractional_rev);
        System.out.println(reversed_fraction);


    }
    public static void main(String[] args)
    {
        System.out.println("Reversing the Float Number:\nEnter the float number to be reversed:");
        Scanner sc=new Scanner(System.in);
        float number=sc.nextFloat();
        ReverseFloat(number);
    }
}
