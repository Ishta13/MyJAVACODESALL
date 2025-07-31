import java.util.*;
public class sumofdiagonalof2D {
    public static int diagonalsum(int array[][]){
        /*int sum=0;
        for(int i=0;i<array.length;i++){              // no of rows
            for(int j=0;j<array[0].length;j++){    //no of column
                if(i==j)  {                        //primary matrix sum
                sum+=array[i][j]; 
                }   
                else if(i+j== array.length-1) {                //secondary matrix sum
                              sum+=array[i][j];                   
                }

            }
        }
        return sum;*/                      // non optimized as time complexity 0(n^2)

        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i][i];                 // kyuki i==j
            if(i!=array.length-1-i) {             
                sum+=array[i][array.length-1-i];          // n-1-i
            }                  
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("enter columns");
        int m = sc.nextInt();
        System.out.println("Enter elements");
        int arr[][] = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
            arr[i][j] = sc.nextInt();
            }
        }
        int res=diagonalsum(arr);
        System.out.println("the sum of diagonal ele of array is: "+res);
    }
    
}
