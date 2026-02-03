import java.util.Scanner;

public class average
{
    public static void findaverage(int num1,int num2,int num3)
    {
        int findaveragevalue=(num1+num2+num3)/3;
        System.out.println(findaveragevalue);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        findaverage(num1, num2, num3);
    }

}