import java.util.ArrayList;
public class optimizedMaxContainWater { //time complexity O(n)
    public static int optimizedheight(ArrayList<Integer> height)
    {
        int n = height.size(); //size of arraylist
        int maxwater = 0; //initialize maxwater
        int lp=0;  
        int rp=n-1;
        while (lp<rp) //jbtk lp ka index smaller than rp ka index
        {
            if(height.get(lp)<height.get(rp))  //then ele check till lp ele less than rp ele
            {
                lp++;  //lp++ taaki height bdhe km naa ho
            }
            else{
                rp--; //else no sol so rp--
            }
            int heights = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp; //width cal(lastindx-firstindx)
            int currwater= heights*width; //currwater calculation
            maxwater = Math.max(maxwater,currwater); //finding max water
        } 
        return maxwater; 
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("most water contain is: "+ optimizedheight(height));
    }
    
}
