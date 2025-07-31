import java.util.*;
public class maxsubarraykadaneapproach {
    public static void kadane(int num[]){
        int currentsum=0;
        int maxsum = Integer.MIN_VALUE;
        int maxno= Integer.MIN_VALUE;
        int tc=0;
        for(int i=0;i<num.length;i++){

            if(num[i]<0){
                tc++;
            }
            if (num[i]>maxno){
                maxno= num[i];
            }
            if(tc==num.length){
                maxsum= maxno;
            } 
            else {
            currentsum = currentsum + num[i];
            if (currentsum<0){
                currentsum=0;
            }
            if(maxsum<currentsum){
                maxsum=currentsum;
            }
        }
        }
        System.out.println("max subarray sum is"+maxsum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter size");
        int n = sc.nextInt();
        System.out.println("ENter elements");
        int num[] = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        kadane(num);
        System.out.println("NEw array max sum is: ");
        int arr[] = {0,-1,-2,-3,-4};
        kadane(arr);

    }
    
}
