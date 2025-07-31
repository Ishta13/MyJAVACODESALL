import java.util.*;
public class functionsandmethods {
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("1111");
        System.out.println("1111");
        System.out.println("1111");

        return 6;
        
    }
    public static void main(String[] args) {
        printHelloWorld();

        
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // add 2 no    

    public static int sum (int a, int b)
    {
        int sum= a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("enter 2nd no");
        int b = sc.nextInt();
        int add = sum(a,b);
        System.out.println("final sum is: "+add);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // multiply    


    public static void multiply(int n1, int n2,int n3)
    {
        int mul= n1*n2*n3;
        System.out.println("multiplication of no is: "+mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no");
        int c= sc.nextInt();
        multiply(a,b,c);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // factorial of no


    public static int factorial(int n)
    {
        int f=1;
        for (int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int ab = sc.nextInt();
        int fact =factorial(ab);
        System.out.println("factorial is: "+fact);       
    }

    public static int fac(int n)
    {
        int fc=1;
        for (int i=1;i<=n;i++)
        {
            fc=fc*i;
        }
        return fc; 
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // binomial coefficient
    public static int binomialcoefficient(int n, int r)
    {
        if (n<r)
        {
            System.out.println("n should be greater or equal to r");
            return -1;
        }
        else
        {
        int nfact = fac(n);
        int rfact = fac(r);
        int nminusrfact = fac(n-r);
        int bicoe = nfact/(rfact*nminusrfact);
        return bicoe;
        }
    }
    public static void main(String[] args) {
        System.out.println("final ans is: "+ binomialcoefficient(4, 2));

       
    }



    

}    