public class MaxSubArrayKadane {
   public static void max(int arr[],int n) 
   {
       int currentsum=0;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
                if(currentsum<0)
                {
                    currentsum=0;
                }
                currentsum+=arr[i];
                if(currentsum>max)
                {
                    max=currentsum;
                }
       }
       System.out.println(max);
   }
   public static void main(String[] args) {
    int arr[] = {2, 3, 5, -2, 7, -4};
    max(arr,6);
   }
}
