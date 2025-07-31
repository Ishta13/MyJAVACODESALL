import java.util.ArrayList;
public class MonotonicArrayList {
    public static boolean isincreasearraylistmonotone(ArrayList<Integer> nums)
    {
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
            if(nums.get(i)>nums.get(j))
            {
                return false;
            }
            }
        }
        return true;
    }
    public static boolean isdecreasearraylistmonotone(ArrayList<Integer> nums)
    {
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
            if(nums.get(i)<nums.get(j))
            {
                return false;
            }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println("if monotone print true else print false: "+ " " +isincreasearraylistmonotone(arr));
        System.out.println("if monotone print true else print false: "+ " " +isdecreasearraylistmonotone(arr));
    }
    
}
