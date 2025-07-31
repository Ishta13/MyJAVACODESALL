public class bitpowerof2 {
    public static boolean powerOf2 (int n)
    {
        return (n & (n-1))==0;
               
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("if the it's actually power then ans  "+powerOf2(8));
    }
}
