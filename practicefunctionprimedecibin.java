import java.util.*;
public class practicefunctionprimedecibin {
   /* public static boolean isPrime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;

        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        
        }
        return true;
    }
    public static void PrimeRange(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                count++;
                
                System.out.println("total no in range 1 to is: " + i);
            }
        }
        System.out.println("total count is: "+ count);
    }    
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
        System.out.println("Enter no for range");
        int m =sc.nextInt();
        PrimeRange(m);
        

        
        
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int bintodeci(int n)
    {
        int deci=0;
        int pow=0;
        while(n>0)
        {
           int no=n%10;
            deci= deci+(no*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        return deci;
    }
    public static void decitobin (int n)
    {
        int bin=0;
        int pow=0;
        while(n>0)
        {
            int no=n%2;
            bin= bin+(no*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("conversion is: "+bin);
    }
    public static void main(String[] args) {
        System.out.println("the conversion of 101 is: "+ bintodeci(101000001));
       decitobin(134);
    }*/


    
    }







    

