

public class pairsum {
    public static int[] pairsumvalues(int[] arr, int target) {
        int a=0;
        int b=arr.length-1;
        while(a<b)
        {
            if(arr[a]+arr[b]==target)
            {
                return new int[]{a, b};
            }
            else if (arr[a]+arr[b] > target)
            {
                b--;
            }
            else 
            {
                a++;
            }


        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] ans=pairsumvalues(arr, target);
        for(int num : ans)
        {
            System.out.println(num + " ");
        }
        

    }
    
}
