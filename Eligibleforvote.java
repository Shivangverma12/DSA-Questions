import java.util.*;

public class Eligibleforvote {
    public static void eligibilitycheck(int age)
    {
        if(age>=18)

        {
            System.out.println("you are eligible for vote .");

        }

        else
        {
            System.out.println("Not eligible.");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age :");
        int age= sc.nextInt();
        eligibilitycheck(age);

        sc.close();
    }
    
}
