public class ArrayIsSorted {
    public static boolean checksorted (int arr[], int n)
    { 
           for(int i=0;i<n-1;i++) ////if i<n toh arrayoutofboundcondition aa jaayga
           {
               if(arr[i+1]<arr[i])
               {
                   return false;  
               }
           } 
           return true;      
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4};
         System.out.println(checksorted(arr, 5));
    }
}
