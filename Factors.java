import java.util.*;
public class Factors{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers to Find the factor number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
