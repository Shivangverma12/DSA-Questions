import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class Greateroftwo {

    public static void greaternumber(int num1, int num2)

    {
        if(num1>num2)
        {
            System.out.println("num1 is greater.");

        }
        else if(num1<num2)
        {
            System.out.println("num2 is greater.");
        }
        
        else
        {
            System.out.println("num1 and num2 is equal.");

        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1=sc.nextInt();
        System.out.println("enter num2 : ");
        int num2=sc.nextInt();

        greaternumber(num1, num2);
        sc.close();
    }
    
}
