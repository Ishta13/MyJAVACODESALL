public class SecondLargestInAnArray {
    public static int secondlargest(int arr[],int n)
    {
        n = arr.length;
        int largest= Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
               if(current>largest)
               {
                secondlargest = largest;
                largest = current;
               }
            else if (current>secondlargest && current<largest)
            {
                secondlargest=current;
            }   
        }
        if (secondlargest==Integer.MIN_VALUE) {
            return -1;
        }
        else{
            return secondlargest;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,67,0,8};
        int se = secondlargest(arr, 7);
        System.out.println(se);
    }
}
