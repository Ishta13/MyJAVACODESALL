public class DivideAndConquerSortedandRotatedArray {
    public static int sortedAndRotated(int arr[], int target, int si,int ei)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid])
        {
            
            if(arr[si]<=target && target<=arr[mid])
            {
                return sortedAndRotated(arr, target, si, mid-1);    //right side of l1  //mid-1 liya kyuki mid case already base case me le rkha
            }
            else{
                return sortedAndRotated(arr,target,mid+1,ei);   //baaki poora area right me search   //mid+1 kyuki mid already base case me le rkha
            }
        }
        //mid on l2
        else{
            if(arr[mid]<=target && target<=arr[ei] )  //right region on L2 line
            {
                return sortedAndRotated(arr,target,mid+1,ei);

            }
            else
            {
                return sortedAndRotated(arr, target, si, mid-1);
            }


        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3};   //sorted and rotated array   
        int findtarget = sortedAndRotated(arr, 2, 0, arr.length-1); //find target at index
        System.out.println(findtarget);
    }
    
}
