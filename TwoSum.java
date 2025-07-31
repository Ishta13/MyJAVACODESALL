public class TwoSum {
    public static void two(int arr[],int n,int target)
    {
         n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    return; //after finding 1st arr[i] and arr[j]==target return
                }
            }

        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int target = 5;
        two(arr, 6, target);
    }
}
