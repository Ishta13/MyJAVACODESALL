public class tripletsinarray {
    public static void triplet(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                        if (arr[i]+arr[j]+arr[k]==0){                       
                        System.out.print("("+arr[i]+" ,"+arr[j]+","+arr[k]+")");
                        break;
                        }


                    }
                    System.out.println();
                }
               
            }
        }
    public static void main(String[] args) {
        int arr[] = {1,-1,2,-2,3,-3};
        System.out.println("triplets are: ");
        triplet(arr);

    }
    
}
