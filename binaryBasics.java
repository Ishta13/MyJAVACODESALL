import java.util.*;
public class binaryBasics {
    public static void bin(int m,int n)
    {
        System.out.println("and op");
        System.out.println(n&m);
        System.out.println("or op");
        System.out.println(n|m);
        System.out.println("xor op");
        System.out.println(n^m);
        System.out.println("left shift");
        System.out.println(n<<m);
        System.out.println("right shift");
        System.out.println(n>>m);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int n = sc.nextInt();
        System.out.println("Enter 2nd no");
        int m = sc.nextInt();
        System.out.println("ans is: ");
        bin(n,m);
        
    }
    
}

