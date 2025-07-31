public class selectionsort {
    public static void selection(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minPos]>arr[j]){
                    minPos=j;
                }

            }
            int temp = arr[i]; // iterating every index
            arr[i]=arr[minPos];
            arr[minPos] = temp;    
        }
        for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
        }
            
       
    }
    public static void main(String[] args) {
        int arr[] = {12,1,34,5,7,8};
         selection(arr);
    }
    
}
