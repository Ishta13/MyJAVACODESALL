public class RecursionTillingProblem {
    public static int tilling(int n)
    {
        if (n==0||n==1)
        {
            return 1;  //if n = 1 or 0 no of ways are one
        }
        //vertical
        int ver = tilling(n-1);
        //horizontal
        int hori = tilling(n-2);
        int totlways = ver + hori;
        return totlways;

    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(tilling(n));
    }
}
