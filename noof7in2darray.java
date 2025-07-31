public class noof7in2darray {
    public static int noof7in2darray(int arr[][]){
        int count=0;
        if (arr==null){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7)
                {
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,7},
                        {5,4,6,12},
                         {7,7,8,9}};
       System.out.println("the count of 7s are: "+ noof7in2darray(arr));                 

    }
    
}
