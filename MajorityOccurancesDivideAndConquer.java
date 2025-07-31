public class MajorityOccurancesDivideAndConquer {
    public static int newOccurances(int arr[])
    {
        int count=0;
        int cand=0;
        for(int i=0;i<arr.length;i++)
        {
        if (count==0)
        {
            cand = arr[i];   //agr koii ele ka count 0 hota to move cand point to next ele
        }
        if (cand==arr[i])    //agr koii cand aa rha toh point milege which is count++
        {
            count++;
        }
        else{
            count--;   //( [2]=1,[3]=1,1-1=0)
        }
        }
        return cand;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,3,3,1,1,3,3,1,5};
        System.out.println("this ele has highest no of occurances: "+ newOccurances(arr));
    }
    
}
