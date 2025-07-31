public class BacktrackingArrays {
    public static void backtrackArr(int arr[], int i,int ele)
    {  
       if (i==arr.length)  //jb last indx reached toh vo base case upr jaate stack pr last ele
       {
           printArr(arr); // agr reached stack top base case print arr
           return;        
       }
       arr[i] = ele; //assigning ele to array
       backtrackArr(arr, i+1, ele+1);  //aage indx bdhao aur ele bhi aage pdhao
       arr[i] = arr[i]-2; //ab pehle array print uske baad -2 
    }
    public static void printArr(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println("array inserting elements: ");
        backtrackArr(arr, 0,3);
        printArr(arr);
    }
}
