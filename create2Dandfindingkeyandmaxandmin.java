import java.util.*;

public class create2Dandfindingkeyandmaxandmin {
    public static void maxmin(int arr[][]){
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]>max){
                    max= arr[i][j];
                }
            }
        }
        System.out.println("max ele is: "+max);


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]<min){
                    min= arr[i][j];
                }
            }
        }
        System.out.println("min ele is: "+min);


    }




    public static boolean search(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]==key){
                   System.out.println(key+"found at"+"("+i+","+j+")");
                   return true;
                }
            }
        }
        System.out.println(key+"not found");
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int n = sc.nextInt();
        System.out.println("Enter size of columns");
        int m = sc.nextInt();
        System.out.println("Enter elements");
        int arr[][] = new int[n][m];
        for(int i=0;i<arr.length;i++){               // or can use n=3 m=3 and i<n and i<m
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("following are elements");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("enter key");
        int key= sc.nextInt();

        System.out.println("max and min");
        maxmin(arr);
        System.out.println("finding key is");
        search(arr, key);

    }
    
}
