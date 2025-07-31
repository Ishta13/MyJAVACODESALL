import java.util.*; // * mtlb all neccessary items
public class MultiDimensionalArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
        l1.add(i*1); //1 2 3 4 5
        l2.add(i*2); //2 4 6 8 10
        l3.add(i*3); //3 6 9 12 15
        }
        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);
        System.out.println(mainlist); //accessing ele within array


        //*****************accessing elements without array list***************/
        for(int i=0;i<mainlist.size();i++)
        {
            //accessing through main list
            ArrayList<Integer> curr = mainlist.get(i); //initialize each list from main list an not to make new arraylist
            for(int j=0;j<curr.size();j++) 
            {
                //accessing list items
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }


    }
    
}
