public class OptimizedPrintXtoThePowerN {
    public static int optimized(int x, int n)
    {
        if (n==0)
        {
            return 1;
        }
        int isEven = optimized(x, n/2) * optimized(x, n/2);
        if (n%2==0)
        {
            return isEven;
        }
        else{
            return x * isEven;
        }
    }
    public static void main(String[] args) {
        int x=3;
        int n=4;
        System.err.println("power result is "+optimized(x, n));
    }
}
