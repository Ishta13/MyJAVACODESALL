import java.util.*;
public class trappingrainwater {
    public static void rainwater(int arr[]){
        int left_max[] = new int[arr.length];
        left_max[0] = arr[0];                                               // left max boundary assigning
        for(int i=1;i<left_max.length;i++){                                // left max moving to left(-1) 
            left_max[i] = Math.max(arr[i],left_max[i-1]);                   // comparing left max to array of height given
        }
        int right_max[] = new int[arr.length];                  //right max value initialized
        right_max[arr.length-1] = arr[arr.length-1];                       
        for(int i=arr.length-2;i>=0;i--){                                       // right max decrementing from n-1
           right_max[i] = Math.max(arr[i],right_max[i+1]);                       // right max value moving to right (+1)
        }
        int trappedwater=0;
        for(int i=0;i<arr.length;i++){
            int waterheight = Math.min(left_max[i], right_max[i]);                //finalheight= (min of two boundaries)
             trappedwater += (waterheight - arr[i])*1;                             //  trappedwater = (height of water - height of bars given)*width of bar
        }
        System.out.println("total trapperd water: "+trappedwater);

       
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // OR
    //              take int and return trappedwater

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        rainwater(arr);
        
    }
    
}
