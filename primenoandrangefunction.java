import java.util.*;
public class primenoandrangefunction {
    public static boolean isPrime (int n)
    {
        if (n<=1)
        {
            return false;
        }
        if (n==2)
        {
            return true;
        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // primeno in range
        public static void Primerange(int n)
        {
            int count=0;
            for (int i=1;i<=n;i++) // if written condition in isPrime already don't take 1,0 then can start i from 0,1 and 2 otherwise better start from 2
            {
                if(isPrime(i))
                {
                    System.out.print(i+" ");  //printing no in range for example (2,3,5,7,13,17,19)
                    count++;

                }
                
            }
            System.out.print("\n"+"total count is: ");
             System.out.println(count);// printing total count
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter no");
            int n = sc.nextInt();
            if (isPrime(n))
            {
            System.out.println(n+"is prime");
            }
            else
            {
                System.out.println("not prime");
      
            }
            System.out.print("Enter no for range: ");
            int m = sc.nextInt();
            Primerange(m);
            sc.close();
        }
        
    
}
