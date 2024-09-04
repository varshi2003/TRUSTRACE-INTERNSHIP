import java.util.*;
public class StarPattern {
    public static void printSquarePattern(int size)
    {
        for(int row=1;row<=size;row++)
        {
            for(int col=1;col<=size;col++)
            {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Square Star Pattern\nEnter the size of the Pattern:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        printSquarePattern(size);
    }
}
