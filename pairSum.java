import java.util.ArrayList;
public class pairSum {
    public static boolean sum(ArrayList<Integer> pair,int target)
    {
        for(int i=0;i<pair.size();i++)
        {
            for(int j=i+1;j<pair.size();j++)
            {
                if(pair.get(i)+pair.get(j)==target)
                {
                    return true;
                }
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
        System.out.println("return true or false if target is found for pair sum then print true else false: "+sum(arr,target));   
}
}
