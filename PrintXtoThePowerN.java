public class PrintXtoThePowerN {
    public static int powN(int x, int n)
    {
        if (n==0)
        {
            return 1;
        }
        return x * powN(x, n-1);  // kyuki n already calculate ho gya

    }
    public static void main(String[] args) {
        int x= 2;
        int n= 5;
        System.out.println("ans of power is "+ powN(x, n));
    }
    
}
