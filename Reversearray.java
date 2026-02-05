
class Solution{
public int[] reversearrays(int[] arr)
{
    int size=arr.length;
    int[] ans=new int[size];
    for (int i=0;i<size;i++)
    {
        ans[i]=arr[size-i-1];
    }
    return ans;

}
}

public class Reversearray {

    public static void main(String[] args) {
        Solution obj= new Solution();
        
        int arr[]={2,3,4,5,1};
        int[] result=obj.reversearrays(arr);

        for(int num : result)
        {
            System.out.println(num + " ");
        }
        System.out.println();

    }


    
}
