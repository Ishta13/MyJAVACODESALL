// Problem: Stock Span Problem
// Difficulty: Medium
import java.util.*; //Time and space complexity
public class StackStockSpanProblem {
    public static void stock(int stocks[], int span[])
    {
        Stack <Integer> s = new Stack<>();
        span[0]=1; ///////////////as first ele is ka span is 1 bydefault
        s.push(0);
        for(int i=1;i<span.length;i++)
        {
            int curr = stocks[i]; /////////ele increment
            while(!s.isEmpty() && curr>stocks[s.peek()])/////////////////////jbtk curr bda hai stock ka next ele
            {
                s.pop();  ////then pop each ele ewich are smaller than curr
            }
            if(s.isEmpty())
            {
                span[i]= i+1; /////////////////final ele find out
            }
            else{
                int prevHigh = s.peek();   ///////////to find prev elee that is bigger than this ele 
                span[i] = i-prevHigh;
            }
            s.push(i);

        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stock(stocks,span);
        for(int i=0;i<span.length;i++)
        {
            System.out.println(span[i]+ " ");
        }
    }
    
}
