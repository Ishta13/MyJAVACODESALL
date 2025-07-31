public class duplicatesinarray {
    public static boolean dupes(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int array[] = {12,12,1,3,4};
        if (dupes(array)){
        System.out.println( "dupes are present");
        }
        else{
            System.out.println("not present");
        }
        
    }
    
}
