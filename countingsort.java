import java.util.*;
public class countingsort {
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);          // iterating through each ele and finding largest and sorting in that order
        }
        int count[] = new int[largest+1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;                          // counting each element seperately
        }
        int j=0;                         // original array index
        for(int i=0;i<count.length;i++)
        {
            while (count[i]>0){
            arr[j]= i;      // to fill sorted elements in an array
            j++;                      // original array ++
            count[i]--;        // freq --
            }


        }
        
        
    }
    public static void descendingcounting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);          // iterating through each ele and finding largest and sorting in that order
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;                          // counting each element seperately
        }
        int j=0;                         // original array index
        for(int i=count.length-1;i>=0;i--){          //for descending sort
            while (count[i]>0){
            arr[j]= i;      // to fill sorted elements in an array
            j++;                      // original array ++
            count[i]--;        // freq --
            }


        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Following are elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
         counting(arr);
         System.out.println("After sorting array is");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
            descendingcounting(arr);
            System.out.println("After descending sorting array is");
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
       

        
    }
    
}
