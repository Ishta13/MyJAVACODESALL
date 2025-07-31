import java.util.*;
public class whileloop {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);    // sum of no in while loop
        System.out.println("Enter no");
        int n = sc.nextInt();
        int i = 1,sum=0;
        while (i<=n)
        {
            sum=sum+i;
            System.out.print(sum+" ");
            i++;
        }    

        
        System.out.println("\n"+"final sum is "+sum);
        
    
     // printingno from 1 to m
    System.out.println("Enter no");
    int m = sc.nextInt();
    int in=1;
    while (in<=m)
    {
        System.out.print(in+" ");
        in++;

    }
    System.out.println("\n"+"final no is "+m);



    




// 1 to 10 no

int q= 10;
int t=1;
while (t<=q)
{
    System.out.print(t + " ");
    t++;

}


    }
 
}    