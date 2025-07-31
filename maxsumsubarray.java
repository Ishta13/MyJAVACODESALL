import java.util.*;
public class maxsumsubarray {
    public static void maxsum(int numbers[]){
        int maxs = Integer.MIN_VALUE;                       // -infinity sbse chota num
        int totlSum=0;                   
        for (int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                // i start no aur j pair me end no
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum +=numbers[k];
                    if (maxs<sum){
                        maxs=sum;
                    }
                }
                System.out.println(" sum of individual subarray: "+sum);
                System.out.println();
                /*if (maxs<sum){
                    maxs=sum;
                }*/
                totlSum+=sum;
                


                
            }
            
        }


        System.out.println("total sum is: "+totlSum);
        System.out.println("max individual sum is: "+maxs);
   
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size");
        int n = sc.nextInt();
        System.out.println("ENter elements");
        int numbers[] = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("following elements");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);;
        }
        System.out.println("now giving details of maxsum,subarray,and total sum: ");
        maxsum(numbers);
    }

    
}
