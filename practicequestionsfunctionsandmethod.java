import java.util.*;
public class practicequestionsfunctionsandmethod {
    public static float sum(float a,float b,float c) {
        //avg of 3 no
        return a+b+c;
    }
    public static float avg(float a,float b,float c)
    {
        float average= sum(a, b, c)/3;
        return average;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // no is even or not
    public static boolean isEven(int n)
    {
        if (n%2!=0)
        {
            return false;
        }
        return true;
        

    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // function for palindrome or not
    public static void palindrome(int n)
    {
        int original = n;      // n ko original form me store krna pdega kyuki n change hoga after while loop 
        int rev=0;
        while (n>0)
        {
            int r=n%10;
            n=n/10;
            rev= rev*10+r;

        }
        if (original==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //the sum of the digits in an integer
    public static int sumofdigit(int n)
    {
        int sum=0;
        if (n==0)
        {
            System.out.println("please choose a valid no");
            return -1;
        }
        else
        {
        while(n>0)
        {
            int r=n%10;       // used to extract last digit
            sum=sum+r;
            n=n/10;           // imp used to remove last digit
        }
        return sum;
    }
    
    }
    public static void main(String[] args) {
        float avg = avg(12.53f, 34.56f,23.67f );
        System.out.println("avg is: "+avg);
        if (isEven(98234567))
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        palindrome(11211);
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter no: ");
        int n = sc.nextInt();

        int sul= sumofdigit(n);
        System.out.println("sum of digits are: "+sul);
    }


    
}
