import java.util.*;
public class pattern01 {
    public static void Pattern(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)                 //j<=n then pattern is same 10101 but not pyramid 
            {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter no: ");
        int n= sc.nextInt();
        System.out.println("pattern is: ");
        Pattern(n);
        
    }
}
