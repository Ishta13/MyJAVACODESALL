import java.util.*;
public class ArrayListBasics {
    public static void findMax(ArrayList<Integer> l)
    {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<=l.size()-1;i++)
        {
            if(max<l.get(i))
            {
                max= l.get(i);
            }
        }
        System.out.println("max element is"+ max);
    }
    public static void swap(ArrayList<Integer> lis, int idx1, int idx2)
    {
        int temp = lis.get(idx1);
        lis.set(idx1,lis.get(idx2));
        lis.set(idx2,temp);

    }
    public static void reverseArrayList(ArrayList<Integer> lis)
    {
        for(int i=lis.size()-1;i>=0;i--)
        {
            System.out.print(lis.get(i)+" ");

        }
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(45);
        findMax(list);
        System.out.println("without swap"+ list);
        System.out.println("reversed array: ");
        reverseArrayList(list);
        swap(list, 0, 2);
        System.out.println("swapped items are: ");
        System.out.println(list);
        
    }
    
}
