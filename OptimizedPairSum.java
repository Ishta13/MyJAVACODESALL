import java.util.ArrayList;

public class OptimizedPairSum {
    public static boolean optimizedsum(ArrayList<Integer> sum, int target)
    {
        int n= sum.size();
        int leftpointer = 0;
        int rightpointer = n-1;
        while(leftpointer<rightpointer)
        {
            //case 1
            if(sum.get(leftpointer)+sum.get(rightpointer)==target)
            {
                return true;
            }
            //case 2
            else if(sum.get(leftpointer)+sum.get(rightpointer)<target)
            {
                leftpointer++;
            }
            else
            {
                rightpointer--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int target = 3;
        System.out.println("return true or false if target is found for pair sum then print true else false: "+optimizedsum(arr,target));
    }
}
