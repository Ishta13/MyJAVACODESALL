import java.util.*;
public class maxandmininarray {
    public static int maxmin(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(maximum<arr[i])
            {
                maximum= arr[i];
               
            }
            // similarly returning min

            if(minimum>arr[i])
            {
                minimum= arr[i];
                
            }
        }

        return maximum;                        // but can return only one


    
}

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size: ");
    int n = sc.nextInt(); 
    System.out.println("Enter elements");
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("these are elements");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    int finall  = maxmin(arr);
    System.out.println("max is: "+finall);

    int price[]= {12,13,1,4,19};
    System.out.println("max is: ");
    System.err.println(maxmin(price));

}

}