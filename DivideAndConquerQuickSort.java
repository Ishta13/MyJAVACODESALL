public class DivideAndConquerQuickSort {
    public static void quickSort(int arr[], int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotIdx= partition(arr,si,ei);  //kaam pivotIdx = partition(arr,si,ei) taaki partition krke <pivot< ye kaam krna 
        //return kr rhe value isiliye kaam ko pivotIdx me store krwaya
        quickSort(arr, si, pivotIdx-1);  //call krna
        quickSort(arr, pivotIdx+1, ei); //call func
    }
    public static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei];   //taking pivot hmesha last element normally
        int i = si-1;   // i=-1 se start kro pr hr baar i change to si-1 lo
        for (int j=si;j<ei;j++)  //should start from si and go until ei-1
        {
            if(arr[j]<=pivot)  //jo jo element km usse swap kro with changing ele
            { 
                i++;
                int temp = arr[i];  //swapping
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        int temp = pivot; // to put pivot at right index
        arr[ei] = arr[i]; //pivot = arr[i] ::::::wrong::::: because call by value me index lete swap krte wqt element nhi
        arr[i] = temp;
        return i;


         
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,8,1,2,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println("sorted array is");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
