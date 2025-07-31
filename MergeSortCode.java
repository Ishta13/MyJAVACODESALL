public class MergeSortCode {
    public static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");  //for printing array without it no output
        }
        System.out.println();
    }
    public static void sort(int arr[], int si, int ei)
    {
        if (si>=ei)
    {
        return;   //base case
    }
    int mid = si + (ei-si)/2;     //mid finding
    sort(arr,si,mid);        //recursive calling for right side
    sort(arr,mid+1,ei);       //recursive calling for left side
    mergeSort(arr,si,mid,ei);    // call for  kaam krna
    }
    public static void mergeSort(int arr[],int si,int mid,int ei)
    {
        //left(0,4) right(5,6) = (6-0+1)= 7 = total length of temp (0 to 6)
        int temp[] = new int[ei-si+1];
        int i=si; //left part
        int j=mid+1;   //right part
        int k=0;   //starting index of temp 

        while(i<=mid && j<=ei)
        {
           if(arr[i]<arr[j])
            {
                temp[k]= arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
                k++;               
            }
        }
        while (i<=mid)
        {
            temp[k++] = arr[i++];   // shortcut for 
                                    // temp[k]= arr[i];
                                     //  i++;
                                      // k++;
        }
        while (j<=ei)
        {
            temp[k++] = arr[j++];   // shortcut for 
                                    // temp[k]= arr[j];
                                     //  j++;
                                      // k++;
        }
        // copying to original array
        for (k=0, i=si; k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[] = {3,6,8,2,5,6,9};
        sort(arr, 0, 6);
        System.out.print("sorted array:\n");
         //printArr(arr);       //calling func 
        //********************************************************************OR****************************************************************
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
    }

    
}
