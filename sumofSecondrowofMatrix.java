public class sumofSecondrowofMatrix {
    public static void sumof2row(int arr[][])
    {
        /*// my code
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){  // to iterate through each column j<arr[i]
                if (i==1) {                       // sirf i because i=no of rows and second row ka sum niklana tha
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("sum of second row is: "+sum);*/
        ////////or////////////
        //optimized sol
        if (arr.length < 2) {
            System.out.println("The matrix does not have a second row.");
            return;
        }
        
        int sum = 0;
        // Iterate through the columns of the second row
        for (int j = 0; j < arr[1].length; j++) {       //and j also equals to 1
            sum += arr[1][j];       // instead of i 1 because i==1
        }
        System.out.println("Sum of the second row is: " + sum);           //akela return void me bhi use kr skteyy java is that flexible
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{12,13,14,6},
                           {3,4,1,9},
                            {12,34,5,78} };
        sumof2row(matrix);                   
    }


    
}
