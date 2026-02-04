import java.util.*;

public class Greatestcommondevisor {

    public static int GCD(int num1 , int num2)
    {
        int temp;
        while(num2!=0)
        {
            temp= num1 % num2;
            num1=num2;
            num2=temp;

        }
        return num1;
    }

    public static void main(String[] args)
    {
         Scanner sc= new Scanner(System.in);
         System.out.println("enter num1 :");
         int num1=sc.nextInt();
         System.out.println("enter num2 :");
         int num2=sc.nextInt();

         int result=GCD(num1, num2);
         System.out.println("GCD is "+ result);

         sc.close();
    }
    
}
