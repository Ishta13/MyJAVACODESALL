public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
        int curr =arr[i];                             // curr = arr[i] to store value
        int prev= i-1;                       // kyuki eeche se aage jaana
        while (prev>=0 && arr[prev]>curr){       // prev ele curr ele se zyada toh
               arr[prev+1]= arr[prev];
               prev--;
    }
        arr[prev+1]=curr; 
    }
}
    public static void main(String[] args) {
        int arr[] = {12,3,6,7,8};
        insertion(arr);
        for (int i=0;i<arr.length;i++){
        System.err.println(arr[i]);
        }
       
    }
    
}
