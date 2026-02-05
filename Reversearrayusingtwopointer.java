
class Solutionofproblem
{
    public int[] reversearrays(int[] arr)
    {
        int a=0;
        int b=arr.length-1;
        while(a<b)
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        return arr;
        
    }


}


public class Reversearrayusingtwopointer {
    public static void main(String[] args) {
        Solutionofproblem ob= new Solutionofproblem();
        int[] array={2,3,5,4,6};
        int[] results=ob.reversearrays(array);
        for(int num : results)
        {
            System.out.println(num + " ");
        }
        System.out.println(" ");

    }
    
}
