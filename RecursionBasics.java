public class RecursionBasics {
    public static void noDec(int n)
    {
        if (n==1)
        {
            System.out.print(n);      //or use syssout(1)
            return;
        }
        System.out.print(n+" ");
        noDec(n-1);
    }
    public static void noInc(int n)
    {
        if (n==1)
        {
            System.out.println(1);
            return;      //if we're not using return then error kyuki call hota rhega func(n-1) toh infinityerror
        }
        noInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n)
    {
        if (n==0)
        {
           return 1;
        }
        //int func = fact(n-1);
        int fn= n* fact(n-1);
        return fn;
    }
    public static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        return n+ sum(n-1);
    }
    public static int fibo(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        int qwe = fibo(n-1);
        int qwer = fibo(n-2);
        int fn= qwe+qwer;
        return fn;
    }
    public static boolean isSortedArray(int arr[], int i)
    {
        /*if (arr == null || arr.length == 0) {
            return true; // Consider null or empty array as sorted
        }*/
        if (i==arr.length-1)  //i should be less than i< or = arr.length
        {
            return true;
        }
        if (arr[i]>arr[i+1])
        {
            return false;
        }

        return isSortedArray(arr,i+1);

    }
    public static void main(String[] args) {
        System.out.println("no decreasing");
        int n=10;
        noDec(n);
        System.out.println("no is increasing");
        int m=10;
        noInc(m);
        int r=5;
        System.out.println("fact is " + fact(r));
        int q=5;
        System.out.println("sum is "+sum(q));
        System.out.println("fibonacci series" + fibo(4));
        int arr[] = {1,2,3,40,5};
        System.out.println("whether array is sorted or not: reply true or fals");
        System.out.println(isSortedArray(arr,0));
    }
    
}

