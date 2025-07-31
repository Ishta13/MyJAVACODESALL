import java.util.*;
public class StacksHistogram {
    public static int histo(int arr[])
    {
        int nsl[] = new int[arr.length]; /////next smaller right
        int nsr[] = new int[arr.length]; ///////next smaller left 
        int max=0;
        Stack <Integer> s = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            /////////////////left to right///////////////
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) /////next smaller
            {
                  s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=arr.length;  /////when empty so n
            }
            else{
                nsr[i]=s.peek(); ///////top ele
            }
            s.push(i); //////push to stack
        }
        s = new Stack<>();    //////////reinitialize stack
        //////////////////right to left////////////////////
        for(int i=arr.length-1;i>=0;i--)
        {
            /////////////////
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) /////next smaller
            {
                  s.pop();
            }
            if(s.isEmpty())
            {
                nsr[i]=-1;  /////when empty so -1 for left
            }
            else{
                nsr[i]=s.peek(); ///////top ele
            }
            s.push(i);
        }
        for(int i=0;i<arr.length;i++)     ////////find height nd width
        {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;  /////formula
            int currArea = height*width;
             max = Math.max(max,currArea);
        }
        return max;
    }
    public static void main(String[] args)
    {

        int histogram[] = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + histo(histogram));
    }
}
