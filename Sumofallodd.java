import java.util.Scanner;

public class Sumofallodd {

    public static void sumofallodd(int size)
    {
        
        int sum=0;
        int i;
        for(i=1;i<=size;i+=2)
        {
            sum+=i;
            System.out.println("the sum of odd number is " + sum);
            
        }
       
    }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter limit of odd numbers : ");
        int limitofvalue=sc.nextInt();
        sumofallodd(limitofvalue);

        sc.close();


    }
}
