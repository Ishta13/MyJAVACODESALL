public class pairarray {
    public static void pairs(int arr[]){
        int tc=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ arr[i]+","+arr[j]+")");
                tc++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are: "+tc);
    }
    public static void main(String[] args) {
        int arr[]= {12,13,14,15,16,17,18};
        System.out.println("pairing of arrays are");
        pairs(arr);
    }
    
}
