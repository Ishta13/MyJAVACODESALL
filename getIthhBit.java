public class getIthhBit {
    public static int getBit(int n,int i)  // lsb se i = 0 (index) use 
    {
        int bitmask = 1<<i;  // if >> rightshift then by doing sol ans is always 0
        /*if ((n & bitmask) == 0)   // yha pr n& bitmask bracket me laao
        {
            return 0;
        }
        else{
            return 1;
        }*/
        return n & bitmask ;
    }
    public static void main(String[] args) {
        int n = 100;
        int i = 2;
        int res = getBit(n,i);
        //System.out.println("the bit on "+ i + "th bit is: "+res );
        System.out.println("total ans of AND operation in decimal is: "+res);
    }
    
}
