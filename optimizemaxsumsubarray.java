public class optimizemaxsumsubarray {
    public static void prefixarray(int array[]){
         int prefix[] = new int[array.length];
         int currentsum =0;
         int maxsum = Integer.MIN_VALUE;
         prefix[0] = array[0];

        for(int i=1;i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1]+array[i];           // to calculate prefix value
        }
        for (int i=0;i<array.length;i++){
            int start = i;                                      // pairing me first no
            for(int j=i;j<array.length;j++){                                                    // imp trick: loop hmesha indexes mee chltaa //$$naa ki$$// elementts(arr[j])
                int end = j;                                         // pairing me last no
                currentsum = start==0? prefix[end] : prefix[end] - prefix[start-1];
                if (maxsum<currentsum){
                    maxsum = currentsum ;
                }
            }
            
        }
        System.out.println("max sum of subarray is: "+ maxsum);
        

    }
    public static void main(String[] args) {
        int arr[]= {-1,2,7,9,-6};
        prefixarray(arr);
    }

    
}
