public class bitOddorEven {
    public static void ithBit(int n)
    {
        int bitmask = 1;
        if ((n & bitmask) ==0)
        {
           System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        int n=12;
        ithBit(n);
        ithBit(11);
        
    }
    
}
