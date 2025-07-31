import java.util.*;
public class patterns1 {
    public static void main(String[] args) {
        Scanner qwerty = new Scanner(System.in);
        for (int i=1;i<=5;i++)
        {
            System.out.println("****");
        }
        System.out.println();
    
//////////////////////////////////////////////////////////////////////////////////////////////
       int n = 4;
       for (int i=1;i<=n;i++)
       {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);   // or can use [syso(j+" ") for clarity]
            }
           System.out.println();
       } 
       System.out.println();

       int p = 1;
       for(int i=1;i<=4;i++)
       {
        for(int j=1;j<=i;j++)
        {
            System.out.print(p+" ");
            p++;
        }
        System.out.println();
       }

////////////////////////////////////////////////////////////////////////////////////////////       
       char ch = 'A';
       System.out.println("Enter no of rows or lines: ");
       int m = qwerty.nextInt();

       for (int i=1;i<=m;i++)
       {
        for (int j=1;j<=m-i+1;j++)
        {
            System.out.print(ch+" ");
            ch++;

        }
        System.out.println();
       }
///////////////////////////////////////////////////////////////////////////////////////////////////////


       System.out.println("Enter no of rows or lines: ");
       int q = qwerty.nextInt();
       for (int i=0;i<q;i++)
       {
        for (int j =0;j<n-i+1;j++)
        {
            System.out.print("&");
        }
        System.out.println();

       }
       System.out.println();
/////////////////////////////////////////////////////////////////////////////




       System.out.println("Enter no of rows or lines: ");
       int qu = qwerty.nextInt();
       for (int i=0;i<qu;i++)          // no starts from 0(in printing), but the no of lines or rows remains the same so better start from 1 and end at n
       {
        for (int j =0;j<n-i+1;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();

       }
       /////////////////////////////////////////////////////////



       System.out.println("Enter no of rows or lines: ");
       int qu = qwerty.nextInt();
       for (int i=1;i<=qu;i++)          
       {
        for (int j =1;j<=qu;j++)
        {
            if(i+j<=qu+1)
            {

              System.out.print("*");
            } 
            else
            {
                System.out.print(" ");
            } 
            
            
        }
        System.out.println();

       }

       /////////////////////////////////////////////////////


int n= qwerty.nextInt();
for (int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
       

        System.out.print(i+" ");

    }    
        

        System.out.println();

    
   
}


    
}



}
