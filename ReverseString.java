import java.util.*;
public class ReverseString {
    public static void ReverseTheString(String inp)
    {
        StringBuilder rev = new StringBuilder();
        for (int index = inp.length() - 1; index >= 0; index--) {
            rev.append(inp.charAt(index));
        }
        System.out.println("The reversed string of " + inp + " is " + rev);
    }
    public static void main(String[] args)
    {
        System.out.println("Reverse the String:\nEnter the String to be reversed:");
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        ReverseTheString(inp);

    }
}
