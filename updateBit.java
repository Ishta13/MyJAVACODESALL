public class updateBit {
    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clearBit (int n, int i)
    {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updatebit(int n,int i,int newBit)
    {
        /*if (newBit == 0)
        {
            return clearBit(n,i);
        }
        else 
        {
            return setBit(n,i);

        }*/
        // new approach
        n = clearBit(n, i);
        int bitm = newBit<<i;
        return n| bitm; 
    }
    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        int newBit = 0;
        System.out.println("updated bit final ans is: "+ updatebit(n,i,newBit));
        //System.out.println("ans of clear bit is: "+ clearBit (n, i));
        //System.out.println("ans of set bit is: "+ setBit (n, i));

    }
    
}
