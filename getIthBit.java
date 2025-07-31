public class getIthBit {
    public static void ithBit(int n)
    {
        int bitmask = 1;
        if ((n & bitmask) ==0)
        {
           System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n=12;
        ithBit(n);
        ithBit(11);
        
    }
    
}
