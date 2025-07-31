import java.util.Arrays;

public class LongestConsecutiveSequenceInAnArray {
    public static int longest(int arr[],int n)
    {
         n=arr.length;
        if(n==0) return 0;  //when arr is empty or length 0
         Arrays.sort(arr); // Sort the array to bring consecutive numbers together
        int longest =1; //hence agr empty nhi to atleast 1 hoga
        int count=1; //for current length count = 1
        for(int i=1;i<n;i++)  ///if i=0 toh exception as arr[0]==arr[-1]
        {/////// for this step
            if(arr[i]==arr[i-1])
            {
                continue; //if dupe ele escape loop itteration
            }
            if(arr[i]==arr[i-1]+1)
            {
                count++;
            }
            else
            {
                longest = Math.max(longest,count);
                ////////reset count to 1
                 count=1;
            }
        }
         /////////final longest
         longest = Math.max(longest,count);
         return longest;      
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 1, 2, 3, 4};
        int ans = longest(arr, 6);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
