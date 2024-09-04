import java.util.*;
public class ChristmasPattern
{
    public static void printChristmasPattern(int size)
    {
        for(int row=1;row<=size;row++)
        {
            for(int col=1;col<=row*2-1;col++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Christmas Star Pattern\nEnter the size of the Christmas Tree:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        printChristmasPattern(size);


    }


}
