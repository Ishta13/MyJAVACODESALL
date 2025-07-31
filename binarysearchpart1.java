public class binarysearchpart1 {
    public static void binSearch(int arr[], int key){
        int start=0,end=arr.length-1;
        boolean found= false;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==key){
                System.out.println(key+"found at"+mid);
                found= true;
                break;
            }
            else if (key>arr[mid]){
                start = mid+1; 
            }
            else{
                end= mid-1;
            }

        }
            if(!found){
                System.out.println(key+"not found");   // to print not found
            }
    }
    public static void main(String[] args) {
        int red[] = {12,13,14,15,16};
        int key=131;
        binSearch(red, key);
        
    }
    
}
