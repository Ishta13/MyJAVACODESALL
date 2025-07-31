import java.util.*;
public class continuebreakstatement {
    public static void main(String[] args) {

        // break statement
        System.out.print("Enter no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.print(i+" ");
            
        }
        // continue statement


        System.out.print("\n"+"Enter no");


        int m = sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.print(i+" ");
            
        }
        
    }
    
}
