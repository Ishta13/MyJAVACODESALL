public class LeftRotateArrayByOne {
    public static void leftrotate(int arr[], int n)
    {
        int first = arr[0];
        for(int i=1;i<arr.length;i++)
        {

           //  arr[i]=arr[i+1]; not eligible for this case
            arr[i-1] = arr[i]; // Overwrite the previous element with the current one
        }
        arr[n-1]=first;
    }
    public static void main(String[] args) {
        int arra[] = {1,2,4,6,78};
        System.out.println("left rotate array by one : ");
        leftrotate(arra, 5);
        for(int i=0;i<arra.length;i++)
        {
            System.out.println(arra[i]);
        }
    }
}
