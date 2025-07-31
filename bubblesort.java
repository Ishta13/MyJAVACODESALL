import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("following array is: ");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "+"\n");
        }
        int swap =0;
        for(int turns=0;turns<=arr.length-2;turns++){
            for(int j=0;j<=arr.length-2-turns;j++){
                if (arr[j]>arr[j+1]){                     // for descending arr[j]<arr[j+1]
                int temp= arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;
                }
            }
        }
        System.out.println("sorted array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("no of swaps is: "+swap);  // no of swaps = n-1

    }
    
}
