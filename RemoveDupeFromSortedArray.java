public class RemoveDupeFromSortedArray {
    public static int remove(int arr[],int n)
    {
        int i=0; //increase index
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++; //increase indx and remove
                arr[i]=arr[j]; ///overwrite duplicate ele
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int sev[] = {3,4,5,5,7,12};
        int se= remove(sev, 6);
        System.out.println("dupe element is "+se);
        for(int k=0;k<sev.length-1;k++)
        {
            System.out.println(sev[k]);
        }
    }
}
