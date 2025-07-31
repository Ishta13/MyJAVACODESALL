import java.util.ArrayList;
public class keyandtarget {
    public static void target(ArrayList<Integer> nums,int key)
    {
        int target = 0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==key)
            {
                target = nums.get(i+1); //num+1 = targt when key is found
                break;

            }
        }
        System.out.println(" target : "+target);
       
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(5);
        arr.add(10);
        int key = 5;
        target(arr, key);

    }
    
}
