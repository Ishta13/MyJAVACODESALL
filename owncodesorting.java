public class owncodesorting {
    public static void main(String[] args) {
        int arr[] = {12,3,56,78,6,34,42,1,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println("after sort");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
