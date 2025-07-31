public class subarrays {
    public static void sbA(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start = arr[i];
            for(int j=i;j<arr.length;j++){
                int end = arr[j] ;               //ye loop end mtlb jaise (2,4) (2,6) toh ese 4,6 pairs me vo nikaalne// j=i liya kyuki i=(single ele wale subarray ke liye)//j=i+1 (pairs me kyuki pair toh atleast 2);
                int sum=0;                       // kyuki hr baar sum 0 initialize krna vrna calculate glt hoga
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];                 // add k nhi kiya kyuki usse kth index add hoga pr real me elements that is arr[k] add krwana
                }
                System.out.println("total sum is= "+sum);
                System.out.println();

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15};
        sbA(arr);
    }
    
}
